package sqlancer;

import sqlancer.common.query.ExpectedErrors;
import sqlancer.common.query.SQLQueryAdapter;

public abstract class SQLDiscardGenerator {

    protected SQLDiscardGenerator() {
    }

    protected static boolean canDiscardTemporaryTables(String what) {
        return what.contentEquals("TEMPORARY") || what.contentEquals("TEMP") || what.contentEquals("ALL");
    }

    protected static SQLQueryAdapter create(boolean hasNonTempTables) {
        StringBuilder sb = new StringBuilder();
        sb.append("DISCARD ");
        String what;
        if (hasNonTempTables) {
            what = Randomly.fromOptions("ALL", "PLANS", "SEQUENCES", "TEMPORARY", "TEMP");
        } else {
            what = Randomly.fromOptions("PLANS", "SEQUENCES");
        }
        sb.append(what);
        return new SQLQueryAdapter(sb.toString(), ExpectedErrors.from("cannot run inside a transaction block")) {

            @Override
            public boolean couldAffectSchema() {
                return canDiscardTemporaryTables(what);
            }
        };
    }
}
