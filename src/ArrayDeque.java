/**
 * Inv:
 * size >= 0
 */
public class ArrayDeque {
    private final int DEFAULT_SIZE = 2;

    private Object[] arr = new Object[DEFAULT_SIZE];
    private int front = 1;
    private int back = 0;
    private int size;

    /**
     * Post:
     * 1) size' = size + 1
     * 2) deque' = deque with "value" in front.
     */
    public void addFirst(Object value) {
        ensureCapacity(size + 1);
        arr[front] = value;
        front = mod(front + 1, arr.length);
        ++size;
    }

    /**
     * Pre:
     * size > 0
     * <p/>
     * Post:
     * 1) size' = size - 1
     * 2) deque' = deque without first element.
     * 3) result = removed element.
     */
    public Object removeFirst() {
        assert size > 0;

        front = mod(front - 1, arr.length);
        Object res = arr[front];
        arr[front] = null;
        size--;

        return res;
    }

    /**
     * Pre:
     * size > 0
     * <p/>
     * Post:
     * result = first element of deque
     */
    public Object peekFirst() {
        assert size > 0;

        return arr[mod(front - 1, arr.length)];
    }

    /**
     * Post:
     * 1) size' = size + 1
     * 2) deque' = deque with "value" in back.
     */
    public void addLast(Object value) {
        ensureCapacity(size + 1);
        arr[back] = value;
        back = mod(back - 1, arr.length);
        ++size;
    }

    /**
     * Pre:
     * size > 0
     * <p/>
     * Post:
     * 1) size' = size - 1
     * 2) deque' = deque without last element.
     * 3) result = removed element.
     */
    public Object removeLast() {
        assert size > 0;

        back = mod(back + 1, arr.length);
        Object res = arr[back];
        arr[back] = null;
        --size;

        return res;
    }

    /**
     * Pre:
     * size > 0
     * <p/>
     * Post:
     * result = last element of deque.
     */
    public Object peekLast() {
        assert size > 0;

        return arr[mod(back + 1, arr.length)];
    }

    /**
     * Post:
     * result = size of deque.
     */
    public int size() {
        return size;
    }

    /**
     * Post:
     * result = is deque empty?
     */
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity(int newSize) {
        if (newSize > arr.length) {
            Object[] newArr = new Object[arr.length * 2];
            copy(newArr);
        }
    }

    private void copy(Object[] newArr) {
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[mod(back + i + 1, arr.length)];
        }
        arr = newArr;
        back = arr.length - 1;
        front = size;
    }

    private int mod(int a, int b) {
        if (a < 0) {
            a = (a % b) + b;
        }

        return a % b;
    }
}
