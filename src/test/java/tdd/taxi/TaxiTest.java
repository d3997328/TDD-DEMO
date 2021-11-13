package tdd.taxi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Done 不超过8公里时每公里0.8元
//Done 超过8公里则每公里加收50%长途费
//Todo 停车等待时加收每分钟0.25元
public class TaxiTest {

    private static final double DELTA = 0.00001;

    @Test
    public void should_be_0p8yuan_when_distance_is_1km() {
        verifyCalculate(1, 0.8);
    }

    @Test
    public void should_be_6p4yuan_when_distance_is_8km() {
        verifyCalculate(8, 6.4);
    }

    @Test
    public void should_be_6p4yuan_when_distance_is_9km() {
        verifyCalculate(9, 7.6);
    }

    @Test
    public void should_be_6p4yuan_when_distance_is_10km() {
        verifyCalculate(10, 8.8);
    }

    private void verifyCalculate(int distance, double expected) {
        final Taxi taxi = new Taxi();
        double actual = taxi.calculate(distance);
        assertEquals(expected, actual, DELTA);
    }
}
