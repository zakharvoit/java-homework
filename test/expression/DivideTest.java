package expression;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class DivideTest {
    @Test
    public void testDivision() throws Exception {
        assertEquals(2.5, new Divide(new Variable("x"), new Const(2)).evaluate(5, 5, 5));
    }

    @Test
    public void testDivisionByZero() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, new Divide(new Const(10), new Const(0)).evaluate(10, 10, 10));
    }
}
