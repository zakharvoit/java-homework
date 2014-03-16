/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public abstract class BinaryExpression implements Expression {
    final protected Expression left;
    final protected Expression right;

    protected BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
