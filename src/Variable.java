import java.util.NoSuchElementException;

/**
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Variable implements Expression3 {
    final private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(double x, double y, double z) {
        switch (name) {
            case "x":
                return x;
            case "y":
                return y;
            case "z":
                return z;
        }

        throw new NoSuchElementException();
    }
}
