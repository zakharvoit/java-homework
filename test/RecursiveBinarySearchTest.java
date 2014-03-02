import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RecursiveBinarySearchTest {
    @Test
    public void testParser() throws Exception {
        assertEquals(2, RecursiveBinarySearch.run(new String[]{"3", "1", "2", "3", "4", "5"}));
    }

    @Test
    public void testNotEquals() throws Exception {
        assertEquals(2, RecursiveBinarySearch.binarySearch(3, new int[]{1, 2, 4, 4, 5}));
    }
}
