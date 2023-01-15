package scenarios;

public class CardPaymentOnlyScenario extends BenchmarkingScenario{
    private final int CARD_PAYMENT_PROBABILTY = 100;

    @Override
    public int getCARD_PAYMENT_PROBABILTY() {
        return CARD_PAYMENT_PROBABILTY;
    }

    @Override
    public String toString() {
        return "CardPaymentOnlyScenario{" +
                "CARD_PAYMENT_PROBABILTY=" + CARD_PAYMENT_PROBABILTY +
                "} " + super.toString();
    }
}
