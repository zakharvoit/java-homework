/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Divide extends BinaryExpression {
    public Divide(Expression3 left, Expression3 right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x, double y, double z) {
        return left.evaluate(x, y, z) / right.evaluate(x, y, z);
    }
}
