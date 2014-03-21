package expression;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public abstract class AbstractTernaryExpression implements Expression3 {
    protected final Expression3 a, b, c;

    protected AbstractTernaryExpression(Expression3 a, Expression3 b, Expression3 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected abstract double implementOpration(double x, double y, double z);

    @Override
    public double evaluate(double x, double y, double z) {
        return implementOpration(a.evaluate(x, y, z), b.evaluate(x, y, z), c.evaluate(x, y, z));
    }
}
