package stack;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public interface Stack {
    public void push(Object e);

    public Object peek();

    public Object pop();

    public int size();

    public boolean isEmpty();
}
