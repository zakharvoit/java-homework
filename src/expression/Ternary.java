package expression;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Ternary extends AbstractTernaryExpression {
    private final static double EPS = 1e-9;

    public Ternary(Expression3 a, Expression3 b, Expression3 c) {
        super(a, b, c);
    }

    @Override
    protected double implementOpration(double x, double y, double z) {
        if (Math.abs(a.evaluate(x, y, z)) > EPS) {
            return b.evaluate(x, y, z);
        } else {
            return c.evaluate(x, y, z);
        }
    }
}
