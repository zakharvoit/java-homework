package deque;

/**
 * Inv:
 * size >= 0
 */
public class ArrayDequeADT {
    static private final int DEFAULT_SIZE = 2;

    private Object[] arr = new Object[DEFAULT_SIZE];
    private int front = 1;
    private int back = 0;
    private int size;

    /**
     * Post:
     * 1) size' = size + 1
     * 2) deque' = deque with "value" in front.
     */
    static public void addFirst(ArrayDequeADT self, Object value) {
        ensureCapacity(self, self.size + 1);
        self.arr[self.front] = value;
        self.front = mod(self.front + 1, self.arr.length);
        ++self.size;
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
    static public Object removeFirst(ArrayDequeADT self) {
        assert self.size > 0;

        self.front = mod(self.front - 1, self.arr.length);
        Object res = self.arr[self.front];
        self.arr[self.front] = null;
        --self.size;

        return res;
    }

    /**
     * Pre:
     * size > 0
     * <p/>
     * Post:
     * result = first element of deque
     */
    static public Object peekFirst(ArrayDequeADT self) {
        assert self.size > 0;

        return self.arr[mod(self.front - 1, self.arr.length)];
    }

    /**
     * Post:
     * 1) size' = size + 1
     * 2) deque' = deque with "value" in back.
     */
    static public void addLast(ArrayDequeADT self, Object value) {
        ensureCapacity(self, self.size + 1);
        self.arr[self.back] = value;
        self.back = mod(self.back - 1, self.arr.length);
        ++self.size;
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
    static public Object removeLast(ArrayDequeADT self) {
        assert self.size > 0;

        self.back = mod(self.back + 1, self.arr.length);
        Object res = self.arr[self.back];
        self.arr[self.back] = null;
        --self.size;

        return res;
    }

    /**
     * Pre:
     * size > 0
     * <p/>
     * Post:
     * result = last element of deque.
     */
    static public Object peekLast(ArrayDequeADT self) {
        assert self.size > 0;

        return self.arr[mod(self.back + 1, self.arr.length)];
    }

    /**
     * Post:
     * result = size of deque.
     */
    static public int size(ArrayDequeADT self) {
        return self.size;
    }

    /**
     * Post:
     * result = is deque empty?
     */
    static public boolean isEmpty(ArrayDequeADT self) {
        return self.size == 0;
    }

    static private void ensureCapacity(ArrayDequeADT self, int newSize) {
        if (newSize > self.arr.length) {
            Object[] newArr = new Object[self.arr.length * 2];
            copy(self, newArr);
        }
    }

    static private void copy(ArrayDequeADT self, Object[] newArr) {
        for (int i = 0; i < self.size; i++) {
            newArr[i] = self.arr[mod(self.back + i + 1, self.arr.length)];
        }
        self.arr = newArr;
        self.back = self.arr.length - 1;
        self.front = self.size;
    }

    static private int mod(int a, int b) {
        if (a < 0) {
            a += b;
        }

        return a % b;
    }
}
