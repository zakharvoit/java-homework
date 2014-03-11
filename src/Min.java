/**
 * Provides function for searching minimal value on ArrayDeque.
 *
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Min {

    /**
     * Pre: !deque.isEmpty()
     * Post: result = min a, a <- deque
     */
    static public int min(ArrayDeque deque) {
        assert !deque.isEmpty();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < deque.size(); i++) {
            int first = (Integer) deque.removeFirst();
            ans = Math.min(ans, first);
            deque.addLast(first);
        }

        return ans;
    }
}
