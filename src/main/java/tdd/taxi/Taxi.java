package tdd.taxi;

public class Taxi {

    private static final double UNIT_PRICE = 0.8;
    public static final int BASE_DISTANCE = 8;
    public static final double UNIT_PRICE_WAIT = 0.25;

    public double calculate(int waitingTime, int distance) {
        double distancePrice = UNIT_PRICE * distance;
        double longDistanceFee = 0;
        if (distance > BASE_DISTANCE) {
            longDistanceFee = (distance - BASE_DISTANCE) * (UNIT_PRICE / 2);
        }
        double waitingFee = waitingTime * UNIT_PRICE_WAIT;
        return distancePrice + longDistanceFee + waitingFee;
    }
}
