/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:48:55 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.cockroachdb.ast.CockroachDBCast;
import sqlancer.cockroachdb.ast.CockroachDBConstant;
import sqlancer.cockroachdb.ast.CockroachDBExpression;
import sqlancer.cockroachdb.CockroachDBSchema;
import sqlancer.common.visitor.UnaryOperation;

public class CockroachDBCast_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        CockroachDBSchema.CockroachDBDataType cockroachDBSchema_CockroachDBDataType0 = CockroachDBSchema.CockroachDBDataType.TIMESTAMPTZ;
        CockroachDBSchema.CockroachDBCompositeDataType cockroachDBSchema_CockroachDBCompositeDataType0 = new CockroachDBSchema.CockroachDBCompositeDataType(
                cockroachDBSchema_CockroachDBDataType0, 1153);
        CockroachDBCast cockroachDBCast0 = new CockroachDBCast((CockroachDBExpression) null,
                cockroachDBSchema_CockroachDBCompositeDataType0);
        CockroachDBExpression cockroachDBExpression0 = cockroachDBCast0.getExpression();
        assertNull(cockroachDBExpression0);
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBConstant.CockroachDBNullConstant cockroachDBConstant_CockroachDBNullConstant0 = new CockroachDBConstant.CockroachDBNullConstant();
        CockroachDBCast cockroachDBCast0 = new CockroachDBCast(cockroachDBConstant_CockroachDBNullConstant0,
                (CockroachDBSchema.CockroachDBCompositeDataType) null);
        // Undeclared exception!
        try {
            cockroachDBCast0.getOperatorRepresentation();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cockroachdb.ast.CockroachDBCast", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        CockroachDBConstant.CockroachDBNullConstant cockroachDBConstant_CockroachDBNullConstant0 = CockroachDBConstant
                .createNullConstant();
        CockroachDBSchema.CockroachDBDataType cockroachDBSchema_CockroachDBDataType0 = CockroachDBSchema.CockroachDBDataType.SERIAL;
        CockroachDBSchema.CockroachDBCompositeDataType cockroachDBSchema_CockroachDBCompositeDataType0 = new CockroachDBSchema.CockroachDBCompositeDataType(
                cockroachDBSchema_CockroachDBDataType0);
        CockroachDBCast cockroachDBCast0 = new CockroachDBCast(cockroachDBConstant_CockroachDBNullConstant0,
                cockroachDBSchema_CockroachDBCompositeDataType0);
        // Undeclared exception!
        try {
            cockroachDBCast0.getOperatorRepresentation();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test3() throws Throwable {
        CockroachDBSchema.CockroachDBDataType cockroachDBSchema_CockroachDBDataType0 = CockroachDBSchema.CockroachDBDataType.TIMESTAMPTZ;
        CockroachDBSchema.CockroachDBCompositeDataType cockroachDBSchema_CockroachDBCompositeDataType0 = new CockroachDBSchema.CockroachDBCompositeDataType(
                cockroachDBSchema_CockroachDBDataType0, 1153);
        CockroachDBCast cockroachDBCast0 = new CockroachDBCast((CockroachDBExpression) null,
                cockroachDBSchema_CockroachDBCompositeDataType0);
        String string0 = cockroachDBCast0.getOperatorRepresentation();
        assertEquals("::TIMESTAMPTZ", string0);
    }

    @Test
    public void test4() throws Throwable {
        CockroachDBConstant.CockroachDBNullConstant cockroachDBConstant_CockroachDBNullConstant0 = new CockroachDBConstant.CockroachDBNullConstant();
        CockroachDBCast cockroachDBCast0 = new CockroachDBCast(cockroachDBConstant_CockroachDBNullConstant0,
                (CockroachDBSchema.CockroachDBCompositeDataType) null);
        CockroachDBConstant.CockroachDBNullConstant cockroachDBConstant_CockroachDBNullConstant1 = (CockroachDBConstant.CockroachDBNullConstant) cockroachDBCast0
                .getExpression();
        assertEquals("NULL", cockroachDBConstant_CockroachDBNullConstant1.toString());
    }

    @Test
    public void test5() throws Throwable {
        CockroachDBConstant.CockroachDBNullConstant cockroachDBConstant_CockroachDBNullConstant0 = new CockroachDBConstant.CockroachDBNullConstant();
        CockroachDBCast cockroachDBCast0 = new CockroachDBCast(cockroachDBConstant_CockroachDBNullConstant0,
                (CockroachDBSchema.CockroachDBCompositeDataType) null);
        UnaryOperation.OperatorKind unaryOperation_OperatorKind0 = cockroachDBCast0.getOperatorKind();
        assertEquals(UnaryOperation.OperatorKind.POSTFIX, unaryOperation_OperatorKind0);
    }
}
