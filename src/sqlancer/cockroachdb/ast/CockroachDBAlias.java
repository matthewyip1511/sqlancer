package sqlancer.cockroachdb.ast;

import sqlancer.common.visitor.UnaryOperation;

public class CockroachDBAlias extends UnaryOperation<CockroachDBExpression> implements CockroachDBExpression {
    public CockroachDBAlias(CockroachDBExpression expr, String alias) {
        super(expr, alias);
    }

    @Override
    public CockroachDBExpression getExpression() {
        return super.getExpression();
    }
}
