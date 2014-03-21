package expression;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Add extends AbstractBinaryExpression {
    public Add(Expression3 left, Expression3 right) {
        super(left, right);
    }

    @Override
    protected double implementOperation(double x, double y) {
        return x + y;
    }
}
