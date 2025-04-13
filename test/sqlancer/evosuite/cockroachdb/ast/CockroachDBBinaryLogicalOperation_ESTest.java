/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:17:25 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.cockroachdb.ast.CockroachDBBinaryLogicalOperation;
import sqlancer.cockroachdb.ast.CockroachDBConstant;

public class CockroachDBBinaryLogicalOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        CockroachDBConstant.CockroachDBNullConstant cockroachDBConstant_CockroachDBNullConstant0 = CockroachDBConstant
                .createNullConstant();
        CockroachDBBinaryLogicalOperation.CockroachDBBinaryLogicalOperator cockroachDBBinaryLogicalOperation_CockroachDBBinaryLogicalOperator0 = CockroachDBBinaryLogicalOperation.CockroachDBBinaryLogicalOperator.AND;
        CockroachDBBinaryLogicalOperation cockroachDBBinaryLogicalOperation0 = new CockroachDBBinaryLogicalOperation(
                cockroachDBConstant_CockroachDBNullConstant0, cockroachDBConstant_CockroachDBNullConstant0,
                cockroachDBBinaryLogicalOperation_CockroachDBBinaryLogicalOperator0);
        assertEquals("AND", cockroachDBBinaryLogicalOperation0.getOperatorRepresentation());
    }

//    @Test
//    public void test1() throws Throwable {
//        CockroachDBBinaryLogicalOperation.CockroachDBBinaryLogicalOperator cockroachDBBinaryLogicalOperation_CockroachDBBinaryLogicalOperator0 = CockroachDBBinaryLogicalOperation.CockroachDBBinaryLogicalOperator
//                .getRandom();
//        assertEquals(CockroachDBBinaryLogicalOperation.CockroachDBBinaryLogicalOperator.AND,
//                cockroachDBBinaryLogicalOperation_CockroachDBBinaryLogicalOperator0);
//    }

    @Test
    public void test2() throws Throwable {
        CockroachDBBinaryLogicalOperation.CockroachDBBinaryLogicalOperator cockroachDBBinaryLogicalOperation_CockroachDBBinaryLogicalOperator0 = CockroachDBBinaryLogicalOperation.CockroachDBBinaryLogicalOperator.AND;
        String string0 = cockroachDBBinaryLogicalOperation_CockroachDBBinaryLogicalOperator0.getTextRepresentation();
        assertEquals("AND", string0);
    }
}
