package sqlancer.postgres.gen;

import java.util.List;

import sqlancer.SQLDropIndexGenerator;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.postgres.PostgresGlobalState;
import sqlancer.postgres.PostgresSchema.PostgresIndex;

public final class PostgresDropIndexGenerator {

    private PostgresDropIndexGenerator() {
    }

    public static SQLQueryAdapter create(PostgresGlobalState globalState) {
        List<PostgresIndex> indexes = globalState.getSchema().getRandomTable().getIndexes();
        return SQLDropIndexGenerator.create(indexes);
    }
}
