import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class IterativeBinarySearchTest {
    @Test
    public void testParser() throws Exception {
        assertEquals(2, IterativeBinarySearch.run(new String[]{"3", "1", "2", "3", "4", "5"}));
    }

    @Test
    public void testNotEquals() throws Exception {
        assertEquals(2, IterativeBinarySearch.binarySearch(3, new int[]{1, 2, 4, 4, 5}));
    }
}
