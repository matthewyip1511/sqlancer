package sqlancer.cnosdb;

import sqlancer.Randomly;
import sqlancer.cnosdb.ast.CnosDBAggregate;
import sqlancer.cnosdb.ast.CnosDBBetweenOperation;
import sqlancer.cnosdb.ast.CnosDBBinaryLogicalOperation;
import sqlancer.cnosdb.ast.CnosDBCastOperation;
import sqlancer.cnosdb.ast.CnosDBColumnValue;
import sqlancer.cnosdb.ast.CnosDBConstant;
import sqlancer.cnosdb.ast.CnosDBExpression;
import sqlancer.cnosdb.ast.CnosDBFunction;
import sqlancer.cnosdb.ast.CnosDBInOperation;
import sqlancer.cnosdb.ast.CnosDBLikeOperation;
import sqlancer.cnosdb.ast.CnosDBOrderByTerm;
import sqlancer.cnosdb.ast.CnosDBPostfixOperation;
import sqlancer.cnosdb.ast.CnosDBPostfixText;
import sqlancer.cnosdb.ast.CnosDBPrefixOperation;
import sqlancer.cnosdb.ast.CnosDBSelect;
import sqlancer.cnosdb.ast.CnosDBSelect.CnosDBFromTable;
import sqlancer.cnosdb.ast.CnosDBSelect.CnosDBSubquery;
import sqlancer.cnosdb.ast.CnosDBSimilarTo;
import sqlancer.common.ast.JoinBase;
import sqlancer.common.ast.SelectBase;
import sqlancer.common.visitor.BinaryOperation;
import sqlancer.common.visitor.ToStringVisitor;

public final class CnosDBToStringVisitor extends ToStringVisitor<CnosDBExpression> implements CnosDBVisitor {

    @Override
    protected void visitJoinType(JoinBase<CnosDBExpression> join) {
        if (join.getType() == JoinBase.JoinType.CROSS) {
            throw new AssertionError(join.getType());
        }
        super.visitJoinType(join);
    }

    @Override
    protected boolean shouldVisitOnClause(JoinBase<CnosDBExpression> join) {
        return true;
    }

    @Override
    public void visitSpecific(CnosDBExpression expr) {
        CnosDBVisitor.super.visit(expr);
    }

    @Override
    public void visit(CnosDBConstant constant) {
        sb.append(constant.getTextRepresentation());
    }

    @Override
    public String get() {
        return sb.toString();
    }

    @Override
    protected CnosDBExpression getDistinctOnClause(SelectBase<CnosDBExpression> select) {
        return select.getDistinctOnClause();
    }

    @Override
    public void visit(CnosDBPostfixOperation op) {
        sb.append("(");
        visit(op.getExpression());
        sb.append(")");
        sb.append(" ");
        sb.append(op.getOperatorTextRepresentation());
    }

    @Override
    public void visit(CnosDBColumnValue c) {
        sb.append(c.getColumn().getFullQualifiedName());
    }

    @Override
    public void visit(CnosDBPrefixOperation op) {
        sb.append(op.getTextRepresentation());
        sb.append(" (");
        visit(op.getExpression());
        sb.append(")");
    }

    @Override
    public void visit(CnosDBFromTable from) {
        sb.append(from.getTable().getName());
    }

    @Override
    public void visit(CnosDBSubquery subquery) {
        sb.append("(");
        visit(subquery.getSelect());
        sb.append(") AS ");
        sb.append(subquery.getName());
    }

    @Override
    public void visit(CnosDBSelect s) {
        visitSelect(s);
    }

    @Override
    protected CnosDBExpression getJoinOnClause(JoinBase<CnosDBExpression> join) {
        return join.getOnClause();
    }

    @Override
    protected CnosDBExpression getJoinTableReference(JoinBase<CnosDBExpression> join) {
        return join.getTableReference();
    }

    @Override
    public void visit(CnosDBOrderByTerm op) {
        visit(op.getExpr());
        sb.append(" ");
        sb.append(op.getOrder());
    }

    @Override
    public void visit(CnosDBFunction f) {
        sb.append(f.getFunctionName());
        sb.append("(");
        int i = 0;
        for (CnosDBExpression arg : f.getArguments()) {
            if (i++ != 0) {
                sb.append(", ");
            }
            visit(arg);
        }
        sb.append(")");
    }

    @Override
    public void visit(CnosDBCastOperation cast) {
        sb.append("CAST( ");
        visit(cast.getExpression());
        sb.append(" AS ");
        appendType(cast);
        sb.append(")");
    }

    private void appendType(CnosDBCastOperation cast) {
        CnosDBCompoundDataType compoundType = cast.getCompoundType();
        switch (compoundType.getDataType()) {
        case BOOLEAN:
            sb.append("BOOLEAN");
            break;
        case INT:
            sb.append("BIGINT");
            break;
        case STRING:
            sb.append(Randomly.fromOptions("STRING"));
            break;
        case DOUBLE:
            sb.append("DOUBLE");
            break;
        case UINT:
            sb.append("BIGINT UNSIGNED");
            break;
        case TIMESTAMP:
            sb.append("TIMESTAMP");
            break;

        default:
            throw new AssertionError(cast.getType());
        }
    }

    @Override
    public void visit(CnosDBBetweenOperation op) {
        sb.append("(");
        visit(op.getExpr());
        sb.append(") BETWEEN (");
        visit(op.getLeft());
        sb.append(") AND (");
        visit(op.getRight());
        sb.append(")");
    }

    @Override
    public void visit(CnosDBInOperation op) {
        sb.append("(");
        visit(op.getExpr());
        sb.append(")");
        if (!op.isTrue()) {
            sb.append(" NOT");
        }
        sb.append(" IN (");
        visit(op.getListElements());
        sb.append(")");
    }

    @Override
    public void visit(CnosDBPostfixText op) {
        visit(op.getExpr());
        sb.append(op.getText());
    }

    @Override
    public void visit(CnosDBAggregate op) {
        sb.append(op.getFunction());
        sb.append("(");
        visit(op.getArgs());
        sb.append(")");
    }

    @Override
    public void visit(CnosDBSimilarTo op) {
        sb.append("(");
        visit(op.getString());
        sb.append(" SIMILAR TO ");
        visit(op.getSimilarTo());
        sb.append(")");
    }

    @Override
    public void visit(CnosDBBinaryLogicalOperation op) {
        super.visit((BinaryOperation<CnosDBExpression>) op);
    }

    @Override
    public void visit(CnosDBLikeOperation op) {
        super.visit((BinaryOperation<CnosDBExpression>) op);
    }

}
