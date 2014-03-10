/**
 * Array deque implemented as a singleton.
 * http://www.kgeorgiy.info/courses/java-intro/homeworks.html#homework-3
 *
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class ArrayDequeSingleton {
    static private final int DEFAULT_SIZE = 2;

    static private Object[] arr = new Object[DEFAULT_SIZE];
    static private int front = 1;
    static private int back = 0;
    static private int size;

    /**
     * Post:
     * 1) size' = size + 1
     * 2) deque' = deque with "value" in front.
     */
    static public void addFirst(Object value) {
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
    static public Object removeFirst() {
        assert size > 0;

        front = mod(front - 1, arr.length);
        Object res = arr[front];
        arr[front] = null;
        --size;

        return res;
    }

    /**
     * Pre:
     * size > 0
     * <p/>
     * Post:
     * result = first element of deque
     */
    static public Object peekFirst() {
        assert size > 0;

        return arr[mod(front - 1, arr.length)];
    }

    /**
     * Post:
     * 1) size' = size + 1
     * 2) deque' = deque with "value" in back.
     */
    static public void addLast(Object value) {
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
    static public Object removeLast() {
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
    static public Object peekLast() {
        assert size > 0;

        return arr[mod(back + 1, arr.length)];
    }

    /**
     * Post:
     * result = size of deque.
     */
    static public int size() {
        return size;
    }

    /**
     * Post:
     * result = is deque empty?
     */
    static public boolean isEmpty() {
        return size == 0;
    }

    static private void ensureCapacity(int newSize) {
        if (newSize > arr.length) {
            Object[] newArr = new Object[arr.length * 2];
            copy(newArr);
        }
    }

    static private void copy(Object[] newArr) {
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[mod(back + i + 1, arr.length)];
        }
        arr = newArr;
        back = arr.length - 1;
        front = size;
    }

    static private int mod(int a, int b) {
        if (a < 0) {
            a += b;
        }

        return a % b;
    }
}
