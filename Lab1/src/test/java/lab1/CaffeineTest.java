package lab1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CaffeineTest {
    @Test
    public void testAdd() {
        Adder adder = new Adder();
        assertEquals(5, adder.add(2, 3));
        assertEquals(0, adder.add(-1, 1));
        assertEquals(-5, adder.add(-2, -3));
    }
}
