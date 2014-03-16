/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Divide extends BinaryExpression {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int value) {
        return left.evaluate(value) / right.evaluate(value);
    }
}
