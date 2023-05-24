import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class DummyTelTest {
    @Test
    public void testCalculateCost() {
        double cost = DummyTel.calculateCost(7, 45);
        assertEquals(23.63, cost, 0.01);

        cost = DummyTel.calculateCost(12, 30);
        assertEquals(16.13, cost, 0.01);

        cost = DummyTel.calculateCost(21, 90);
        assertEquals(36.75, cost, 0.01);

        cost = DummyTel.calculateCost(2, 120);
        assertEquals(31.88, cost, 0.01);
    }
}