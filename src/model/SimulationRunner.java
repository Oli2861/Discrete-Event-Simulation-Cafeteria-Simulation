package model;

import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.TimeInstant;
import scenarios.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SimulationRunner {

    public static void main(String[] args) {

        /*
          The used scenario
          - System description: Scenario
          - b) Benchmarking task: BenchmarkingScenario
          - d) Maximum capacity task: MaxCapacityScenario
          - e) Cash payment only in benchmarking scenario: CardPaymentOnlyScenario
          - Improved scenario is used to test different configurations to improve the system.
         */
        //runSimulation(new ImprovedScenario());
        //searchArrivalRateAndRerunSimulation(false);
    }

    /**
     * Run the simulation.
     *
     * @param scenario the scenario to use.
     * @return mean of the time the customers spends in the system.
     */
    private static double runSimulation(Scenario scenario) {
        CafeteriaModel model = new CafeteriaModel(scenario);
        Experiment exp = new Experiment("CafeteriaExperiment");
        exp.setSeedGenerator(42);
        model.connectToExperiment(exp);

        exp.setShowProgressBar(false);
        TimeInstant stopTime = new TimeInstant(scenario.getCLOSING_TIME_IN_MINUTES(), TimeUnit.MINUTES);
        StopCondition condition = new StopCondition(model, stopTime);

        exp.stop(condition);
        exp.tracePeriod(new TimeInstant(0), stopTime);
        exp.debugPeriod(new TimeInstant(0), stopTime);

        exp.start();

        exp.report();
        exp.finish();

        CafeteriaModel cafeteriaModel = (CafeteriaModel) exp.getModel();
        return cafeteriaModel.customerSystemTime.getMean();
    }

    private static void searchArrivalRateAndRerunSimulation(boolean allowCashPayment) {
        double mtba = searchArrivalRate(allowCashPayment);
        if (allowCashPayment) {
            MaxCapacityScenario maxCap = new MaxCapacityScenario();
            maxCap.setMEAN_TIME_BETWEEN_ARRIVALS(mtba);
            runSimulation(maxCap);
        } else {
            MaxCapacityNoCashScenario maxCap = new MaxCapacityNoCashScenario();
            maxCap.setMEAN_TIME_BETWEEN_ARRIVALS(mtba);
            runSimulation(maxCap);
        }
    }

    private static double searchArrivalRate(boolean allowCashPayment) {
        double meanTimeBetweenArrivals = 25;
        double lastOkayLoss = 1;
        double stepSize = 100;
        List<Double> meanTimeBetweenArrivalsHistory = new ArrayList<>();
        List<Double> lossHistory = new ArrayList<>();
        List<Double> stepSizeHistory = new ArrayList<>();

        while (lastOkayLoss > 0) {
            double loss = getLoss(300, 100, meanTimeBetweenArrivals, allowCashPayment);
            if (loss > 0) {
                meanTimeBetweenArrivalsHistory.add(meanTimeBetweenArrivals);
                lossHistory.add(lastOkayLoss);
                stepSizeHistory.add(stepSize / 100);
                lastOkayLoss = loss;
                stepSize = stepSize - Math.log(stepSize);
                meanTimeBetweenArrivals = meanTimeBetweenArrivals - (stepSize / 100);
            } else {
                System.out.println("Not okay loss: " + loss);
                System.out.println("Failing meant time between arrivals: " + meanTimeBetweenArrivals);
                break;
            }
        }

        System.out.println("Mean time between arrivals history: " + meanTimeBetweenArrivalsHistory);
        System.out.println("Loss history: " + lossHistory);
        System.out.println("Step size history: " + stepSizeHistory);

        return meanTimeBetweenArrivalsHistory.get(meanTimeBetweenArrivalsHistory.size() - 1);
    }

    private static double getLoss(int allowedSystemTime, int numberOfSimulations, double meanTimeBetweenArrivals, boolean allowCashPayments) {
        MaxCapacityScenario scenario;
        if (allowCashPayments) {
            scenario = new MaxCapacityScenario();
        } else {
            scenario = new MaxCapacityNoCashScenario();
        }
        scenario.setMEAN_TIME_BETWEEN_ARRIVALS(meanTimeBetweenArrivals);
        List<Double> lossList = new ArrayList<>();

        for (int i = 0; i < numberOfSimulations; i++) {
            double meanCustomerSystemTime = runSimulation(scenario);
            double loss = allowedSystemTime - meanCustomerSystemTime;
            lossList.add(loss);
            if (loss <= 0) return loss;
        }

        return lossList.stream().mapToDouble(loss -> loss).average().getAsDouble();
    }


}
