package deque;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MinTest {
    ArrayDeque deque;

    @Before
    public void setUp() throws Exception {
        deque = new ArrayDeque();

        deque.addLast(1);
        deque.addLast(5);
        deque.addLast(2);
        deque.addLast(-10);
    }

    @Test
    public void testMin() throws Exception {
        assertEquals(-10, Min.min(deque));
    }

    @Test
    public void testEmpty() throws Exception {
        try {
            Min.min(new ArrayDeque());
        } catch (AssertionError e) {
            return;
        }

        assert false;
    }
}
