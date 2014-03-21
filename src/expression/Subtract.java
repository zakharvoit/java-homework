package expression;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Subtract extends AbstractBinaryExpression {
    public Subtract(Expression3 left, Expression3 right) {
        super(left, right);
    }

    @Override
    protected double implementOperation(double x, double y) {
        return x - y;
    }
}
