package sqlancer.common.gen;

import sqlancer.GlobalState;

/**
 * Interface for custom table generation strategies. This allows database providers to implement specific table
 * generation logic.
 */
public interface TableGenerator<G extends GlobalState<?, ?, ?>> {

    /**
     * Creates tables according to the specific database implementation logic.
     *
     * @param globalState
     *            The global state containing database connection and schema
     * @param numTables
     *            The target number of tables to generate
     *
     * @throws Exception
     *             if an error occurs during table generation
     */
    void createTables(G globalState, int numTables) throws Exception;

    /**
     * Optional preparation steps after table generation.
     *
     * @param globalState
     *            The global state containing database connection and schema
     *
     * @throws Exception
     *             if an error occurs during table preparation
     */
    default void prepareTables(G globalState) throws Exception {
        // Default implementation does nothing
    }
}