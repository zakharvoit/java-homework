/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Add extends BinaryExpression {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int value) {
        return left.evaluate(value) + right.evaluate(value);
    }
}
