package scenarios;

public class ImprovedScenario extends BenchmarkingScenario {
    private final int CAPACITY_SELF_SERVICE_BAR = 1;
    private final int NUMBER_OF_SERVERS_COUNTER_1 = 2;
    private final int NUMBER_OF_SERVERS_COUNTER_2 = 1;
    private final int NUMBER_OF_CASHIERS_CHECKOUT_COUNTER = 4;

    @Override
    public int getCAPACITY_SELF_SERVICE_BAR() {
        return CAPACITY_SELF_SERVICE_BAR;
    }

    @Override
    public int getNUMBER_OF_SERVERS_COUNTER_1() {
        return NUMBER_OF_SERVERS_COUNTER_1;
    }

    @Override
    public int getNUMBER_OF_SERVERS_COUNTER_2() {
        return NUMBER_OF_SERVERS_COUNTER_2;
    }

    @Override
    public int getNUMBER_OF_CASHIERS_CHECKOUT_COUNTER() {
        return NUMBER_OF_CASHIERS_CHECKOUT_COUNTER;
    }

    public void setMEAN_TIME_BETWEEN_ARRIVALS(double MEAN_TIME_BETWEEN_ARRIVALS) {
        this.MEAN_TIME_BETWEEN_ARRIVALS = MEAN_TIME_BETWEEN_ARRIVALS;
    }

    @Override
    public String toString() {
        return "ImprovedScenario{" +
                "CAPACITY_SELF_SERVICE_BAR=" + CAPACITY_SELF_SERVICE_BAR +
                ", NUMBER_OF_SERVERS_COUNTER_1=" + NUMBER_OF_SERVERS_COUNTER_1 +
                ", NUMBER_OF_SERVERS_COUNTER_2=" + NUMBER_OF_SERVERS_COUNTER_2 +
                ", NUMBER_OF_CASHIERS_CHECKOUT_COUNTER=" + NUMBER_OF_CASHIERS_CHECKOUT_COUNTER +
                ", MEAN_TIME_BETWEEN_ARRIVALS=" + MEAN_TIME_BETWEEN_ARRIVALS +
                ", MEAN_TIME_BETWEEN_ARRIVALS=" + MEAN_TIME_BETWEEN_ARRIVALS +
                "} " + super.toString();
    }
}
