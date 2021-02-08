
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.divide(20, 2), 0.001);
    }
}