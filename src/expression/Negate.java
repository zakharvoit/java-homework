package expression;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Negate extends AbstractUnaryExpression {
    public Negate(Expression3 arg) {
        super(arg);
    }

    @Override
    protected double implementOperation(double x) {
        return -x;
    }
}
