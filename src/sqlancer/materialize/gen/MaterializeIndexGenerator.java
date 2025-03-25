package sqlancer.materialize.gen;

import sqlancer.Randomly;
import sqlancer.SQLIndexGenerator;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.materialize.MaterializeGlobalState;
import sqlancer.materialize.MaterializeSchema.MaterializeTable;

public final class MaterializeIndexGenerator extends SQLIndexGenerator {

    private MaterializeIndexGenerator() {
    }

    public static SQLQueryAdapter generate(MaterializeGlobalState globalState) {
        ExpectedErrors errors = SQLIndexGenerator.generateErrors();
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE");
        sb.append(" INDEX ");
        MaterializeTable randomTable = globalState.getSchema().getRandomTable(t -> !t.isView()); // TODO: materialized
                                                                                                 // views
        sb.append(MaterializeCommon.getFreeIndexName(globalState.getSchema()));
        sb.append(" ON ");
        sb.append(randomTable.getName());
        IndexType method;
        method = IndexType.BTREE;

        sb.append("(");
        if (method == IndexType.HASH) {
            sb.append(randomTable.getRandomColumn().getName());
        } else {
            for (int i = 0; i < Randomly.smallNumber() + 1; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(randomTable.getRandomColumn().getName());
                if (Randomly.getBoolean()) {
                    sb.append(" ");
                    sb.append(Randomly.fromOptions("ASC", "DESC"));
                }
                if (Randomly.getBooleanWithRatherLowProbability()) {
                    sb.append(" NULLS ");
                    sb.append(Randomly.fromOptions("FIRST", "LAST"));
                }
            }
        }

        sb.append(")");
        errors.add("does not support casting");
        MaterializeCommon.addCommonExpressionErrors(errors);
        return new SQLQueryAdapter(sb.toString(), errors);
    }
}
