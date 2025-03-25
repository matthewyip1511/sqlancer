package sqlancer.cnosdb.ast;

import sqlancer.common.visitor.UnaryOperation;

public class CnosDBAlias extends UnaryOperation<CnosDBExpression> implements CnosDBExpression {
    public CnosDBAlias(CnosDBExpression expr, String alias) {
        super(expr, alias);
    }

    @Override
    public CnosDBExpression getExpression() {
        return super.getExpression();
    }
}
