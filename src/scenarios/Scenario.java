package scenarios;

import decisionstrategy.CustomerDesire;
import decisionstrategy.DesireDecisionStrategy;
import decisionstrategy.SimpleDesireDecisionStrategy;

public class Scenario {
    private final int CAPACITY_SELF_SERVICE_BAR = 1;
    private final int NUMBER_OF_SERVERS_COUNTER_1 = 1;
    private final int NUMBER_OF_SERVERS_COUNTER_2 = 1;

    private final int NUMBER_OF_CASHIERS_CHECKOUT_COUNTER = 1;

    private final int CARD_PAYMENT_PROBABILTY = 85;
    private final int CLOSING_TIME_IN_MINUTES = 60;
    private final Integer MAX_AMOUNT_OF_CUSTOMERS = null;

    // private final DesireDecisionStrategy activeDecisionStrategy = new MyDesireDecisionStrategy();
    private final DesireDecisionStrategy activeDecisionStrategy = new SimpleDesireDecisionStrategy();

    double MEAN_TIME_BETWEEN_ARRIVALS = 6.6667;
    private final double MEAN_MENU_1 = 5.67596;
    private final double MEAN_MENU_2 = 9.95262;
    private final double STANDARD_DEVIATION = 1.86631;
    private final int MIN_SNACK_GRABBING_TIME = 3;
    private final int MAX_SNACK_GRABBING_TIME = 20;
    private final int MIN_CHECKOUT_TIME_CASH = 10;
    private final int MAX_CHECKOUT_TIME_CASH = 60;
    private final int MIN_CHECKOUT_TIME_CARD = 3;
    private final int MAX_CHECKOUT_TIME_CARD = 15;

    public int getCAPACITY_SELF_SERVICE_BAR() {
        return CAPACITY_SELF_SERVICE_BAR;
    }

    public int getNUMBER_OF_SERVERS_COUNTER_1() {
        return NUMBER_OF_SERVERS_COUNTER_1;
    }

    public int getNUMBER_OF_SERVERS_COUNTER_2() {
        return NUMBER_OF_SERVERS_COUNTER_2;
    }

    public int getNUMBER_OF_CASHIERS_CHECKOUT_COUNTER() {
        return NUMBER_OF_CASHIERS_CHECKOUT_COUNTER;
    }

    public int getCARD_PAYMENT_PROBABILTY() {
        return CARD_PAYMENT_PROBABILTY;
    }

    public int getCLOSING_TIME_IN_MINUTES() {
        return CLOSING_TIME_IN_MINUTES;
    }

    public Integer getMAX_AMOUNT_OF_CUSTOMERS() {
        return MAX_AMOUNT_OF_CUSTOMERS;
    }

    public DesireDecisionStrategy getActiveDecisionStrategy() {
        return activeDecisionStrategy;
    }

    public double getMEAN_TIME_BETWEEN_ARRIVALS() {
        return MEAN_TIME_BETWEEN_ARRIVALS;
    }

    public double getMEAN_MENU_1() {
        return MEAN_MENU_1;
    }

    public double getMEAN_MENU_2() {
        return MEAN_MENU_2;
    }

    public double getSTANDARD_DEVIATION() {
        return STANDARD_DEVIATION;
    }

    public int getMIN_SNACK_GRABBING_TIME() {
        return MIN_SNACK_GRABBING_TIME;
    }

    public int getMAX_SNACK_GRABBING_TIME() {
        return MAX_SNACK_GRABBING_TIME;
    }

    public int getMIN_CHECKOUT_TIME_CASH() {
        return MIN_CHECKOUT_TIME_CASH;
    }

    public int getMAX_CHECKOUT_TIME_CASH() {
        return MAX_CHECKOUT_TIME_CASH;
    }

    public int getMIN_CHECKOUT_TIME_CARD() {
        return MIN_CHECKOUT_TIME_CARD;
    }

    public int getMAX_CHECKOUT_TIME_CARD() {
        return MAX_CHECKOUT_TIME_CARD;
    }

    @Override
    public String toString() {
        return "Scenario{" +
                "CAPACITY_SELF_SERVICE_BAR=" + CAPACITY_SELF_SERVICE_BAR +
                ", NUMBER_OF_SERVERS_COUNTER_1=" + NUMBER_OF_SERVERS_COUNTER_1 +
                ", NUMBER_OF_SERVERS_COUNTER_2=" + NUMBER_OF_SERVERS_COUNTER_2 +
                ", NUMBER_OF_CASHIERS_CHECKOUT_COUNTER=" + NUMBER_OF_CASHIERS_CHECKOUT_COUNTER +
                ", CARD_PAYMENT_PROBABILTY=" + CARD_PAYMENT_PROBABILTY +
                ", CLOSING_TIME_IN_MINUTES=" + CLOSING_TIME_IN_MINUTES +
                ", MAX_AMOUNT_OF_CUSTOMERS=" + MAX_AMOUNT_OF_CUSTOMERS +
                ", activeDecisionStrategy=" + activeDecisionStrategy +
                ", MEAN_TIME_BETWEEN_ARRIVALS=" + MEAN_TIME_BETWEEN_ARRIVALS +
                ", MEAN_MENU_1=" + MEAN_MENU_1 +
                ", MEAN_MENU_2=" + MEAN_MENU_2 +
                ", STANDARD_DEVIATION=" + STANDARD_DEVIATION +
                ", MIN_SNACK_GRABBING_TIME=" + MIN_SNACK_GRABBING_TIME +
                ", MAX_SNACK_GRABBING_TIME=" + MAX_SNACK_GRABBING_TIME +
                ", MIN_CHECKOUT_TIME_CASH=" + MIN_CHECKOUT_TIME_CASH +
                ", MAX_CHECKOUT_TIME_CASH=" + MAX_CHECKOUT_TIME_CASH +
                ", MIN_CHECKOUT_TIME_CARD=" + MIN_CHECKOUT_TIME_CARD +
                ", MAX_CHECKOUT_TIME_CARD=" + MAX_CHECKOUT_TIME_CARD +
                '}';
    }
}
