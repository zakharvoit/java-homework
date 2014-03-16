package stack;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public abstract class AbstractStack implements Stack {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
