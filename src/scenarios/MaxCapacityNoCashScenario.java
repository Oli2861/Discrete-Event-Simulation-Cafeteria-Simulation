package scenarios;

public class MaxCapacityNoCashScenario extends MaxCapacityScenario{
    private final int CARD_PAYMENT_PROBABILTY = 100;

    @Override
    public int getCARD_PAYMENT_PROBABILTY() {
        return CARD_PAYMENT_PROBABILTY;
    }
}
