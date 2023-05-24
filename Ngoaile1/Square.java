


public class Square extends Expression {

    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return String.format("(%s) ^ 2", expression);
    }

    @Override
    public double evaluate() {
        double evaluate = expression.evaluate() * expression.evaluate();
        return evaluate;
    }

    /**
     * Javadoc.
     * Comment.
     */
    public static void main(String[] args) {

    }
} 