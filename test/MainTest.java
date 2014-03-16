import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class MainTest {
    @Test
    public void testCalculate() throws Exception {
        assertEquals(9, Main.calculate(4));
    }
}
