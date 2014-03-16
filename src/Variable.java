/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Variable implements Expression {
    final private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int value) {
        return value;
    }
}
