package sqlancer;

import sqlancer.common.schema.AbstractPostfixOperation;
import sqlancer.mysql.ast.MySQLConstant;

public abstract class SQLUnaryPostfixOperation<T> implements AbstractPostfixOperation<T> {

    protected final T expression;
    private final UnaryPostfixOperator operator;
    private boolean negate;

    public abstract MySQLConstant getExpectedValue();

    public enum UnaryPostfixOperator {
        IS_NULL, IS_TRUE, IS_FALSE;
    }

    public SQLUnaryPostfixOperation(T expr, UnaryPostfixOperator op, boolean negate) {
        this.expression = expr;
        this.operator = op;
        this.setNegate(negate);
    }

    @Override
    public T getExpression() {
        return expression;
    }

    @Override
    public UnaryPostfixOperator getOperator() {
        return operator;
    }

    @Override
    public boolean isNegated() {
        return negate;
    }

    public void setNegate(boolean negate) {
        this.negate = negate;
    }

    protected boolean getExpectedValueHelper(SQLConstant expectedValue) {
        boolean val;
        switch (operator) {
        case IS_NULL:
            val = expectedValue.isNull();
            break;
        case IS_FALSE:
            val = !expectedValue.isNull() && !expectedValue.asBooleanNotNull();
            break;
        case IS_TRUE:
            val = !expectedValue.isNull() && expectedValue.asBooleanNotNull();
            break;
        default:
            throw new AssertionError(operator);
        }
        if (negate) {
            val = !val;
        }

        return val;
    }
}
