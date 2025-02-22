package sqlancer.cnosdb.ast;

import sqlancer.Randomly;
import sqlancer.cnosdb.CnosDBSchema.CnosDBColumn;
import sqlancer.cnosdb.CnosDBSchema.CnosDBDataType;
import sqlancer.cnosdb.CnosDBSchema.CnosDBTable;
import sqlancer.common.ast.newast.Join;

public class CnosDBJoin implements CnosDBExpression, Join<CnosDBExpression, CnosDBTable, CnosDBColumn> {

    private final CnosDBExpression tableReference;
    private CnosDBExpression onClause;
    private final CnosDBJoinType type;

    public CnosDBJoin(CnosDBExpression tableReference, CnosDBExpression onClause, CnosDBJoinType type) {
        this.tableReference = tableReference;
        this.onClause = onClause;
        this.type = type;
    }

    public CnosDBExpression getTableReference() {
        return tableReference;
    }

    public CnosDBExpression getOnClause() {
        return onClause;
    }

    public CnosDBJoinType getType() {
        return type;
    }

    @Override
    public CnosDBDataType getExpressionType() {
        throw new AssertionError();
    }

    public enum CnosDBJoinType {
        INNER, LEFT, RIGHT, FULL;
        // now not support
        // CROSS;

        public static CnosDBJoinType getRandom() {
            return Randomly.fromOptions(values());
        }

    }

    @Override
    public void setOnClause(CnosDBExpression onClause) {
        this.onClause = onClause;
    }

}
