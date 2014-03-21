package expression;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class TernaryTest {
    @Test
    public void testTernaryTrue() throws Exception {
        Assert.assertEquals(2.0, new Ternary(new Const(1), new Const(2), new Const(3)).evaluate(0, 0, 0));
    }

    @Test
    public void testTernaryFalse() throws Exception {
        Assert.assertEquals(3.0, new Ternary(new Const(0), new Const(2), new Const(3)).evaluate(0, 0, 0));
    }
}
