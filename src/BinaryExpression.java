/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public abstract class BinaryExpression implements Expression3 {
    final protected Expression3 left;
    final protected Expression3 right;

    protected BinaryExpression(Expression3 left, Expression3 right) {
        this.left = left;
        this.right = right;
    }
}
