/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Const implements Expression3 {
    final private int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return this.value;
    }
}
