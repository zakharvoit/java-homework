package expression;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public abstract class AbstractUnaryExpression implements Expression3 {
    protected final Expression3 arg;

    protected AbstractUnaryExpression(Expression3 arg) {
        this.arg = arg;
    }

    protected abstract double implementOperation(double x);

    @Override
    public double evaluate(double x, double y, double z) {
        return implementOperation(arg.evaluate(x, y, z));
    }
}
