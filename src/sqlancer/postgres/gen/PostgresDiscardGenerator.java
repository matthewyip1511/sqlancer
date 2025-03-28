package sqlancer.postgres.gen;

import sqlancer.Randomly;
import sqlancer.SQLDiscardGenerator;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.PostgresSchema.PostgresTable.TableType;

public final class PostgresDiscardGenerator extends SQLDiscardGenerator {

    private PostgresDiscardGenerator() {
        super();
    }

    public static SQLQueryAdapter create(PostgresGlobalState globalState) {
        // prevent that DISCARD discards all tables (if they are TEMP tables)
        boolean hasNonTempTables = globalState.getSchema().getDatabaseTables().stream()
                .anyMatch(t -> t.getTableType() == TableType.STANDARD);

        return SQLDiscardGenerator.create(hasNonTempTables);
    }

}
