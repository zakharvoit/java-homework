package expression;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public abstract class AbstractBinaryExpression implements Expression3 {
    final protected Expression3 left;
    final protected Expression3 right;

    protected AbstractBinaryExpression(Expression3 left, Expression3 right) {
        this.left = left;
        this.right = right;
    }

    protected abstract double implementOperation(double x, double y);

    @Override
    public double evaluate(double x, double y, double z) {
        return implementOperation(left.evaluate(x, y, z), right.evaluate(x, y, z));
    }
}
