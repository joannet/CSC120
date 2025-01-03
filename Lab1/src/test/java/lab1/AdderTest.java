package lab1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdderTest {
    @Test
    public void testAdd() {
        Adder adder = new Adder();

        // Test case: 2 + 3 = 5
        assertEquals("Expected 2 + 3 to equal 5", 5, adder.add(2, 3));
        System.out.println("Test case 2 + 3 = 5 passed.");

        // Test case: -1 + 1 = 0
        assertEquals("Expected -1 + 1 to equal 0", 0, adder.add(-1, 1));
        System.out.println("Test case -1 + 1 = 0 passed.");

        // Test case: -2 + -3 = -5
        assertEquals("Expected -2 + -3 to equal -5", -5, adder.add(-2, -3));
        System.out.println("Test case -2 + -3 = -5 passed.");
    }
}
