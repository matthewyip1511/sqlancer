package sqlancer.yugabyte.ysql.gen;

import java.util.List;
import java.util.stream.Collectors;

import sqlancer.Randomly;
import sqlancer.SQLIndexGenerator;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.common.schema.AbstractTableColumn;
import sqlancer.yugabyte.ysql.YSQLErrors;
import sqlancer.yugabyte.ysql.YSQLGlobalState;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLColumn;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLDataType;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLTable;
import sqlancer.yugabyte.ysql.YSQLVisitor;
import sqlancer.yugabyte.ysql.ast.YSQLExpression;

public final class YSQLIndexGenerator extends SQLIndexGenerator {

    private YSQLIndexGenerator() {
    }

    public static SQLQueryAdapter generate(YSQLGlobalState globalState) {
        ExpectedErrors errors = SQLIndexGenerator.generateErrors();
        StringBuilder sb = new StringBuilder();
        YSQLTable randomTable = globalState.getSchema().getRandomTable(t -> !t.isView()); // TODO: materialized

        IndexType method = SQLIndexGenerator.generateHelper(
                globalState, errors, sb, randomTable, (YSQLGlobalState state,
                        List<YSQLColumn> columns) -> YSQLExpressionGenerator.generateExpression(state, columns),
                YSQLVisitor::asString);

        if (Randomly.getBoolean() && method != IndexType.HASH) {
            sb.append(" INCLUDE(");
            List<YSQLColumn> columns = randomTable.getRandomNonEmptyColumnSubset();
            sb.append(columns.stream().map(AbstractTableColumn::getName).collect(Collectors.joining(", ")));
            sb.append(")");
        }
        if (Randomly.getBoolean()) {
            sb.append(" WHERE ");
            YSQLExpression expr = new YSQLExpressionGenerator(globalState).setColumns(randomTable.getColumns())
                    .setGlobalState(globalState).generateExpression(YSQLDataType.BOOLEAN);
            sb.append(YSQLVisitor.asString(expr));
        }
        errors.add("already contains data"); // CONCURRENT INDEX failed
        errors.add("You might need to add explicit type casts");
        errors.add("INDEX on column of type");
        errors.add("collations are not supported"); // TODO check
        errors.add("because it has pending trigger events");
        errors.add("duplicate key value violates unique constraint");
        errors.add("could not determine which collation to use for");
        errors.add("index method \"gist\" not supported yet");
        errors.add("is duplicated");
        errors.add("already exists");
        errors.add("could not create unique index");
        errors.add("has no default operator class");
        errors.add("does not support");
        errors.add("cannot cast");
        YSQLErrors.addCommonExpressionErrors(errors);
        return new SQLQueryAdapter(sb.toString(), errors);
    }
}
