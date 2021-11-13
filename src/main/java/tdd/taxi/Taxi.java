package tdd.taxi;

public class Taxi {

    private static final double UNIT_PRICE = 0.8;
    public static final int BASE_DISTANCE = 8;

    public double calculate(int distance) {
        double distancePrice = UNIT_PRICE * distance;
        double longDistanceFee = 0;
        if (distance > BASE_DISTANCE) {
            longDistanceFee = (distance - BASE_DISTANCE) * (UNIT_PRICE / 2);
        }
        return distancePrice + longDistanceFee;
    }
}
