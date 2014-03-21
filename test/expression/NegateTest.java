package expression;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class NegateTest {
    @Test
    public void testNegate() throws Exception {
        assertEquals(-1.0, new Negate(new Const(1)).evaluate(0, 0, 0));
    }
}
