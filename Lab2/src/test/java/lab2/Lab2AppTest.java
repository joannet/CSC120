package lab2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Lab2AppTest {
    @Test
    public void testAdd() {
        Lab2App adder = new Lab2App();
        assertEquals(5, adder.add(2, 3));
        assertEquals(0, adder.add(-1, 1));
        assertEquals(-5, adder.add(-2, -3));
    }
}
