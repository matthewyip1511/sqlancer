/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:00:18 GMT 2025
 */

package sqlancer.evosuite.duckdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.duckdb.ast.DuckDBConstant;
import sqlancer.duckdb.ast.DuckDBExpression;
import sqlancer.duckdb.ast.DuckDBTernary;

public class DuckDBTernary_ESTest {

    @Test
    public void test0() throws Throwable {
        DuckDBExpression duckDBExpression0 = DuckDBConstant.createNullConstant();
        DuckDBTernary duckDBTernary0 = new DuckDBTernary(duckDBExpression0, duckDBExpression0, duckDBExpression0,
                "EW6C!*%fd0^pw&d6", "");
        assertEquals("EW6C!*%fd0^pw&d6", duckDBTernary0.getLeftStr());
    }
}
