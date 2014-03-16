import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class DivideTest {
    @Test
    public void testDivision() throws Exception {
        assertEquals(2, new Divide(new Variable("x"), new Const(2)).evaluate(5));
    }

    @Test
    public void testDivisionByZero() throws Exception {
        try {
            new Divide(new Const(10), new Const(0)).evaluate(10);
        } catch (ArithmeticException e) {
            return;
        }

        throw new RuntimeException("Division by zero exception expected.");
    }
}
