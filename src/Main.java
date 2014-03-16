/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(Integer.parseInt(args[0])));
    }

    /**
     * Calculates x^2 - 2x + 1
     */
    public static int calculate(int x) {
        return new Add(
                new Subtract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")),
                        new Multiply(
                                new Const(2),
                                new Variable("x"))
                ),
                new Const(1)).evaluate(x);
    }
}
