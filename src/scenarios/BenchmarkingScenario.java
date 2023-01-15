package scenarios;

public class BenchmarkingScenario extends Scenario {
   private final int CLOSING_TIME_IN_MINUTES = 30;
   private final Integer MAX_AMOUNT_OF_CUSTOMERS = 600;
   double MEAN_TIME_BETWEEN_ARRIVALS = 3.18;

   @Override
   public int getCLOSING_TIME_IN_MINUTES() {
      return CLOSING_TIME_IN_MINUTES;
   }

   @Override
   public Integer getMAX_AMOUNT_OF_CUSTOMERS() {
      return MAX_AMOUNT_OF_CUSTOMERS;
   }

   @Override
   public double getMEAN_TIME_BETWEEN_ARRIVALS() {
      return MEAN_TIME_BETWEEN_ARRIVALS;
   }

   @Override
   public String toString() {
      return "BenchmarkingScenario{" +
              "CLOSING_TIME_IN_MINUTES=" + CLOSING_TIME_IN_MINUTES +
              ", MAX_AMOUNT_OF_CUSTOMERS=" + MAX_AMOUNT_OF_CUSTOMERS +
              ", MEAN_TIME_BETWEEN_ARRIVALS=" + MEAN_TIME_BETWEEN_ARRIVALS +
              "} " + super.toString();
   }
}
