package sqlancer.common.visitor;

public abstract class UnaryOperation<T> {
    T expression;
    String alias;

    public UnaryOperation(T expression, String alias) {
        this.expression = expression;
        this.alias = alias;
    }

    protected enum OperatorKind {
        PREFIX, POSTFIX
    }

    public T getExpression() {
        return expression;
    };

    public String getOperatorRepresentation() {
        return " as " + alias;
    }

    public boolean omitBracketsWhenPrinting() {
        return true;
    }

    public OperatorKind getOperatorKind() {
        return OperatorKind.POSTFIX;
    };

}
