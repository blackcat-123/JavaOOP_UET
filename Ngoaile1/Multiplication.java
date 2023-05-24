
public class Multiplication extends BinaryExpression {

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        String s = String.format("(%s * %s)", left, right);
        return s;
    }

    @Override
    public double evaluate() {
        double result = right.evaluate() * left.evaluate();
        return result;
    }

} 