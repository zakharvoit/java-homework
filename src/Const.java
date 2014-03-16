/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Const implements Expression {
    final private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int value) {
        return this.value;
    }
}
