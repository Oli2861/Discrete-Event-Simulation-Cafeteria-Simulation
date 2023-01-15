package scenarios;

// 5 * 60 = 300s
public class MaxCapacityScenario extends Scenario {
    private final int CLOSING_TIME_IN_MINUTES = 30;

    @Override
    public int getCLOSING_TIME_IN_MINUTES() {
        return CLOSING_TIME_IN_MINUTES;
    }

    @Override
    public double getMEAN_TIME_BETWEEN_ARRIVALS() {
        return MEAN_TIME_BETWEEN_ARRIVALS;
    }

    public void setMEAN_TIME_BETWEEN_ARRIVALS(double MEAN_TIME_BETWEEN_ARRIVALS) {
        this.MEAN_TIME_BETWEEN_ARRIVALS = MEAN_TIME_BETWEEN_ARRIVALS;
    }

    @Override
    public String toString() {
        return "MaxCapacityScenario{" +
                "CLOSING_TIME_IN_MINUTES=" + CLOSING_TIME_IN_MINUTES +
                ", MEAN_TIME_BETWEEN_ARRIVALS=" + MEAN_TIME_BETWEEN_ARRIVALS +
                "} " + super.toString();
    }
}

