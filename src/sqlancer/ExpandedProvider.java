package sqlancer;

import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.common.query.SQLancerResultSet;
import sqlancer.common.schema.AbstractSchema;

import java.io.IOException;

public abstract class ExpandedProvider<G extends SQLGlobalState<O, ? extends AbstractSchema<G, ?>>, O extends DBMSSpecificOptions<? extends OracleFactory<G>>>
        extends SQLProviderAdapter<G, O> {

    public static boolean generateOnlyKnown;

    protected String entryURL;
    protected String username;
    protected String password;
    protected String entryPath;
    protected String host;
    protected int port;
    protected String testURL;
    protected String databaseName;
    protected String createDatabaseCommand;
    protected String extensionsList;

    protected ExpandedProvider(Class<G> globalClass, Class<O> optionClass) {
        super(globalClass, optionClass);
    }

    protected static <G extends SQLGlobalState<?, ?>, A extends Enum<A>> int mapActions(G globalState, A action) {
        Randomly r = globalState.getRandomly();
        int nrPerformed;
        switch (action.name()) { // Use action.name() to handle both enums
        case "CREATE_INDEX":
            nrPerformed = r.getInteger(0, 3);
            break;
        case "CLUSTER":
            nrPerformed = r.getInteger(0, 3);
            break;
        case "CREATE_STATISTICS":
            nrPerformed = r.getInteger(0, 5);
            break;
        case "DISCARD":
        case "DROP_INDEX":
            nrPerformed = r.getInteger(0, 5);
            break;
        case "COMMIT":
            nrPerformed = r.getInteger(0, 0);
            break;
        case "ALTER_TABLE":
            nrPerformed = r.getInteger(0, 5);
            break;
        case "REINDEX":
        case "RESET":
            nrPerformed = r.getInteger(0, 3);
            break;
        case "DELETE":
            nrPerformed = r.getInteger(0, 5);
            break;
        case "RESET_ROLE":
        case "SET":
            nrPerformed = r.getInteger(0, 5);
            break;
        case "ANALYZE":
            nrPerformed = r.getInteger(0, 3);
            break;
        case "VACUUM":
        case "SET_CONSTRAINTS":
        case "COMMENT_ON":
        case "NOTIFY":
        case "LISTEN":
        case "UNLISTEN":
        case "CREATE_SEQUENCE":
        case "DROP_STATISTICS":
        case "TRUNCATE":
            nrPerformed = r.getInteger(0, 2);
            break;
        case "CREATE_VIEW":
            nrPerformed = r.getInteger(0, 2);
            break;
        case "UPDATE":
            nrPerformed = r.getInteger(0, 10);
            break;
        case "INSERT":
            nrPerformed = r.getInteger(0, globalState.getOptions().getMaxNumberInserts());
            break;
        case "TABLEGROUP":
            nrPerformed = r.getInteger(0, 3);
            break;
        default:
            throw new AssertionError(action);
        }
        return nrPerformed;
    }

    protected CommonExplainComponents prepareExplainQuery(String selectStr, String explainPrefix, G globalState)
            throws Exception {
        String queryPlan = "";
        String explainQuery = explainPrefix + selectStr;
        if (globalState.getOptions().logEachSelect()) {
            globalState.getLogger().writeCurrent(explainQuery);
            try {
                globalState.getLogger().getCurrentFileWriter().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        SQLQueryAdapter q = new SQLQueryAdapter(explainQuery);
        boolean afterProjection = false;
        SQLancerResultSet rs = q.executeAndGet(globalState);
        return new CommonExplainComponents(queryPlan, explainQuery, afterProjection, rs);
    }

    protected static class CommonExplainComponents {
        public String queryPlan;
        public String explainQuery;
        public boolean afterProjection;
        public SQLancerResultSet rs;

        public CommonExplainComponents(String queryPlan, String explainQuery, boolean afterProjection,
                SQLancerResultSet rs) {
            this.queryPlan = queryPlan;
            this.explainQuery = explainQuery;
            this.afterProjection = afterProjection;
            this.rs = rs;
        }
    }
}
