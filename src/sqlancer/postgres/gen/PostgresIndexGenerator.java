package sqlancer.postgres.gen;

import java.util.List;
import java.util.stream.Collectors;

import sqlancer.Randomly;
import sqlancer.SQLIndexGenerator;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.PostgresSchema.PostgresColumn;
import sqlancer.postgres.PostgresSchema.PostgresDataType;
import sqlancer.postgres.PostgresSchema.PostgresTable;
import sqlancer.postgres.PostgresVisitor;
import sqlancer.postgres.ast.PostgresExpression;

public final class PostgresIndexGenerator extends SQLIndexGenerator {

    private PostgresIndexGenerator() {
    }

    public static SQLQueryAdapter generate(PostgresGlobalState globalState) {
        ExpectedErrors errors = SQLIndexGenerator.generateErrors();
        StringBuilder sb = new StringBuilder();

        /*
         * Commented out as a workaround for https://www.postgresql.org/message-id/CA%2Bu7OA4XYhc-
         * qyCgJqwwgMGZDWAyeH821oa5oMzm_HEifZ4BeA%40mail.gmail.com
         */
        // if (Randomly.getBoolean()) {
        // sb.append("CONCURRENTLY ");
        // }
        PostgresTable randomTable = globalState.getSchema().getRandomTable(t -> !t.isView()); // TODO: materialized
        // views
        IndexType method = SQLIndexGenerator.generateHelper(
                globalState, errors, sb, randomTable, (PostgresGlobalState state,
                        List<PostgresColumn> columns) -> PostgresExpressionGenerator.generateExpression(state, columns),
                PostgresVisitor::asString);

        if (Randomly.getBoolean() && method != IndexType.HASH) {
            sb.append(" INCLUDE(");
            List<PostgresColumn> columns = randomTable.getRandomNonEmptyColumnSubset();
            sb.append(columns.stream().map(c -> c.getName()).collect(Collectors.joining(", ")));
            sb.append(")");
        }
        if (Randomly.getBoolean()) {
            sb.append(" WHERE ");
            PostgresExpression expr = new PostgresExpressionGenerator(globalState).setColumns(randomTable.getColumns())
                    .setGlobalState(globalState).generateExpression(PostgresDataType.BOOLEAN);
            sb.append(PostgresVisitor.asString(expr));
        }

        errors.add("cannot cast");
        PostgresCommon.addCommonExpressionErrors(errors);
        return new SQLQueryAdapter(sb.toString(), errors);
    }
}
