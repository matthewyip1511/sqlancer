/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:17:30 GMT 2025
 */

package sqlancer.evosuite.duckdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.ast.newast.NewOrderingTerm;
import sqlancer.duckdb.ast.DuckDBConstant;
import sqlancer.duckdb.ast.DuckDBOrderingTerm;
import sqlancer.duckdb.ast.DuckDBTernary;

public class DuckDBOrderingTerm_ESTest {

    @Test
    public void test0() throws Throwable {
        DuckDBConstant.DuckDBNullConstant duckDBConstant_DuckDBNullConstant0 = new DuckDBConstant.DuckDBNullConstant();
        DuckDBTernary duckDBTernary0 = new DuckDBTernary(duckDBConstant_DuckDBNullConstant0,
                duckDBConstant_DuckDBNullConstant0, duckDBConstant_DuckDBNullConstant0, "t_Hd7LRY-BBnH\"x=b",
                "t_Hd7LRY-BBnH\"x=b");
        NewOrderingTerm.Ordering newOrderingTerm_Ordering0 = NewOrderingTerm.Ordering.DESC;
        DuckDBOrderingTerm duckDBOrderingTerm0 = new DuckDBOrderingTerm(duckDBTernary0, newOrderingTerm_Ordering0);
        assertEquals(NewOrderingTerm.Ordering.DESC, duckDBOrderingTerm0.getOrdering());
    }
}
