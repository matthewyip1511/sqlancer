package sqlancer.tidb.visitor;

import sqlancer.Randomly;
import sqlancer.common.ast.JoinBase;
import sqlancer.common.visitor.ToStringVisitor;
import sqlancer.tidb.ast.TiDBAggregate;
import sqlancer.tidb.ast.TiDBCase;
import sqlancer.tidb.ast.TiDBCastOperation;
import sqlancer.tidb.ast.TiDBColumnReference;
import sqlancer.tidb.ast.TiDBConstant;
import sqlancer.tidb.ast.TiDBExpression;
import sqlancer.tidb.ast.TiDBFunctionCall;
import sqlancer.tidb.ast.TiDBJoin;
import sqlancer.tidb.ast.TiDBSelect;
import sqlancer.tidb.ast.TiDBTableReference;
import sqlancer.tidb.ast.TiDBText;

public class TiDBToStringVisitor extends ToStringVisitor<TiDBExpression> implements TiDBVisitor {

    @Override
    public void visitSpecific(TiDBExpression expr) {
        TiDBVisitor.super.visit(expr);
    }

    @Override
    protected TiDBExpression getJoinOnClause(JoinBase<TiDBExpression> join) {
        return join.getOnClause();
    }

    @Override
    protected TiDBExpression getJoinTableReference(JoinBase<TiDBExpression> join) {
        return join.getTableReference();
    }

    @Override
    public void visit(TiDBConstant c) {
        sb.append(c.toString());
    }

    public String getString() {
        return sb.toString();
    }

    @Override
    public void visit(TiDBColumnReference c) {
        if (c.getColumn().getTable() == null) {
            sb.append(c.getColumn().getName());
        } else {
            sb.append(c.getColumn().getFullQualifiedName());
        }
    }

    @Override
    public void visit(TiDBTableReference expr) {
        sb.append(expr.getTable().getName());
    }

    @Override
    public void visit(TiDBSelect select) {
        sb.append("SELECT ");
        if (select.getHint() != null) {
            sb.append("/*+ ");
            visit(select.getHint());
            sb.append("*/");
        }
        visit(select.getFetchColumns());
        sb.append(" FROM ");
        visit(select.getFromList());
        if (!select.getFromList().isEmpty() && !select.getJoinList().isEmpty()) {
            sb.append(", ");
        }
        if (!select.getJoinList().isEmpty()) {
            visit(select.getJoinList());
        }
        visitWhereClause(select);
        visitGroupByClause(select);
        visitHavingClause(select);
        visitOrderByClause(select);
    }

    @Override
    public void visit(TiDBFunctionCall call) {
        sb.append(call.getFunction());
        sb.append("(");
        visit(call.getArgs());
        sb.append(")");
    }

    @Override
    public void visit(TiDBJoin join) {
        sb.append(" ");
        visit(join.getLeftTable());
        sb.append(" ");
        switch (join.getJoinType()) {
        case INNER:
            sb.append("INNER ");
            sb.append("JOIN ");
            break;
        case STRAIGHT:
            sb.append("STRAIGHT_JOIN ");
            break;
        case RIGHT:
            sb.append("RIGHT ");
            if (Randomly.getBoolean()) {
                sb.append(" OUTER ");
            }
            sb.append("JOIN ");
            break;
        case LEFT:
            sb.append("LEFT ");
            if (Randomly.getBoolean()) {
                sb.append(" OUTER ");
            }
            sb.append("JOIN ");
            break;
        case NATURAL:
            sb.append("NATURAL ");
            switch (join.getNaturalJoinType()) {
            case INNER:
                break;
            case LEFT:
                sb.append("LEFT ");
                break;
            case RIGHT:
                sb.append("RIGHT ");
                break;
            default:
                throw new AssertionError();
            }
            sb.append("JOIN ");
            break;
        case CROSS:
            sb.append("CROSS JOIN ");
            break;
        default:
            throw new AssertionError();
        }
        visit(join.getRightTable());
        if (join.getOnCondition() != null && join.getJoinType() != JoinBase.JoinType.NATURAL) {
            sb.append(" ON ");
            visit(join.getOnCondition());
        }
    }

    @Override
    public void visit(TiDBText text) {
        sb.append(text.getText());
    }

    @Override
    public void visit(TiDBAggregate aggr) {
        sb.append(aggr.getFunction());
        sb.append("(");
        visit(aggr.getArgs());
        sb.append(")");
    }

    @Override
    public void visit(TiDBCastOperation cast) {
        sb.append("CAST(");
        visit(cast.getExpr());
        sb.append(" AS ");
        sb.append(cast.getType());
        sb.append(")");
    }

    @Override
    public void visit(TiDBCase op) {
        generateCaseStatement(op.getSwitchCondition(), op.getConditions(), op.getExpressions(), op.getElseExpr(),
                true);
    }
}
