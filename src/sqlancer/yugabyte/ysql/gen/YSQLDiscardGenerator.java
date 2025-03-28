package sqlancer.yugabyte.ysql.gen;

import sqlancer.Randomly;
import sqlancer.SQLDiscardGenerator;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.yugabyte.ysql.YSQLGlobalState;
import sqlancer.yugabyte.ysql.YSQLSchema.YSQLTable.TableType;

public final class YSQLDiscardGenerator extends SQLDiscardGenerator {

    private YSQLDiscardGenerator() {
        super();
    }

    public static SQLQueryAdapter create(YSQLGlobalState globalState) {
        // prevent that DISCARD discards all tables (if they are TEMP tables)
        boolean hasNonTempTables = globalState.getSchema().getDatabaseTables().stream()
                .anyMatch(t -> t.getTableType() == TableType.STANDARD);

        return SQLDiscardGenerator.create(hasNonTempTables);
    }
}
