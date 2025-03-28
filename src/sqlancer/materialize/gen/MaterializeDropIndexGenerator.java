package sqlancer.materialize.gen;

import java.util.List;

import sqlancer.SQLDropIndexGenerator;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.materialize.MaterializeGlobalState;
import sqlancer.materialize.MaterializeSchema.MaterializeIndex;
import sqlancer.materialize.MaterializeSchema.MaterializeTable;

public final class MaterializeDropIndexGenerator {

    private MaterializeDropIndexGenerator() {
    }

    public static SQLQueryAdapter create(MaterializeGlobalState globalState) {
        MaterializeTable randomTable = globalState.getSchema().getRandomTable();
        List<MaterializeIndex> indexes = randomTable.getIndexes();
        return SQLDropIndexGenerator.create(indexes);
    }

}
