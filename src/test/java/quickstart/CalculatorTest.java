package quickstart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fb on 16/3/17.
 */
public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void hello() {
        assertEquals(6,3+3);
    }
}