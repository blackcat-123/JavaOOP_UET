import java.lang.String;

public class Numeral extends Expression {

    private double value;

    public Numeral() {

    }

    /**
     * Numeral.
     */

    public Numeral(double value) {
        this.value = value;
    }

    /**
     * String.
     * Comment.
     */

    @Override
    public String toString() {
        int realValue = (int) value;
        if (realValue == value) {
            return String.valueOf(realValue);
        } else {
            return String.valueOf(value);
        }
    }

    @Override
    public double evaluate() {
        return value;
    }
}
