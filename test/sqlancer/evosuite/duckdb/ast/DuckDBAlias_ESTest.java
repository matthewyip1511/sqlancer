/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:25:14 GMT 2025
 */

package sqlancer.evosuite.duckdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.duckdb.ast.DuckDBAlias;
import sqlancer.duckdb.ast.DuckDBSelect;

public class DuckDBAlias_ESTest {

    @Test
    public void test0() throws Throwable {
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        DuckDBAlias duckDBAlias0 = new DuckDBAlias(duckDBSelect0, (String) null);
        assertNull(duckDBAlias0.getAlias());
    }
}
