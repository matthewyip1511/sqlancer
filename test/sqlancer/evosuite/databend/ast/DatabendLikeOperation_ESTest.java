/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:39:24 GMT 2025
 */

package sqlancer.evosuite.databend.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.databend.ast.DatabendBinaryArithmeticOperation;
import sqlancer.databend.ast.DatabendColumnValue;
import sqlancer.databend.ast.DatabendConstant;
import sqlancer.databend.ast.DatabendExpression;
import sqlancer.databend.ast.DatabendLikeOperation;
import sqlancer.databend.ast.DatabendSelect;
import sqlancer.databend.ast.DatabendUnaryPostfixOperation;
import sqlancer.databend.DatabendSchema;

public class DatabendLikeOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = DatabendSchema.DatabendCompositeDataType
                .getRandomWithoutNull();
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn((String) null,
                databendSchema_DatabendCompositeDataType0, true, false);
        DatabendConstant.DatabendStringConstant databendConstant_DatabendStringConstant0 = new DatabendConstant.DatabendStringConstant(
                "");
        DatabendColumnValue databendColumnValue0 = new DatabendColumnValue(databendSchema_DatabendColumn0,
                databendConstant_DatabendStringConstant0);
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendColumnValue0,
                databendColumnValue0, databendLikeOperation_DatabendLikeOperator0);
        DatabendLikeOperation databendLikeOperation1 = new DatabendLikeOperation(databendColumnValue0,
                databendLikeOperation0, databendLikeOperation_DatabendLikeOperator0);
        // Undeclared exception!
        try {
            databendLikeOperation1.getExpectedValue();
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // sqlancer.databend.ast.DatabendConstant$DatabendBooleanConstant@0000000007
            //
            verifyException("sqlancer.databend.ast.DatabendConstant", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation((DatabendExpression) null,
                (DatabendExpression) null, databendLikeOperation_DatabendLikeOperator0);
        DatabendExpression databendExpression0 = databendLikeOperation0.getRightExpr();
        assertNull(databendExpression0);
    }

    @Test
    public void test02() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation((DatabendExpression) null,
                (DatabendExpression) null, databendLikeOperation_DatabendLikeOperator0);
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator1 = databendLikeOperation0
                .getOp();
        assertSame(databendLikeOperation_DatabendLikeOperator0, databendLikeOperation_DatabendLikeOperator1);
    }

    @Test
    public void test03() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation((DatabendExpression) null,
                (DatabendExpression) null, databendLikeOperation_DatabendLikeOperator0);
        DatabendExpression databendExpression0 = databendLikeOperation0.getLeftExpr();
        assertNull(databendExpression0);
    }

    @Test
    public void test04() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = DatabendSchema.DatabendCompositeDataType
                .getRandomWithoutNull();
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn((String) null,
                databendSchema_DatabendCompositeDataType0, true, true);
        DatabendConstant.DatabendStringConstant databendConstant_DatabendStringConstant0 = new DatabendConstant.DatabendStringConstant(
                (String) null);
        DatabendColumnValue databendColumnValue0 = new DatabendColumnValue(databendSchema_DatabendColumn0,
                databendConstant_DatabendStringConstant0);
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendColumnValue0,
                databendColumnValue0, databendLikeOperation_DatabendLikeOperator0);
        // Undeclared exception!
        try {
            databendLikeOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.LikeImplementationHelper", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = DatabendSchema.DatabendCompositeDataType
                .getRandomWithoutNull();
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn("LIKE",
                databendSchema_DatabendCompositeDataType0, true, true);
        DatabendConstant databendConstant0 = DatabendConstant.createBooleanConstant(true);
        DatabendColumnValue databendColumnValue0 = new DatabendColumnValue(databendSchema_DatabendColumn0,
                databendConstant0);
        DatabendBinaryArithmeticOperation databendBinaryArithmeticOperation0 = new DatabendBinaryArithmeticOperation(
                databendColumnValue0, databendColumnValue0, databendLikeOperation_DatabendLikeOperator0);
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendBinaryArithmeticOperation0,
                databendColumnValue0, databendLikeOperation_DatabendLikeOperator0);
        // Undeclared exception!
        try {
            databendLikeOperation0.getExpectedValue();
            fail("Expecting exception: ClassCastException");

        } catch (ClassCastException e) {
            //
            // class sqlancer.databend.ast.DatabendLikeOperation$DatabendLikeOperator cannot be cast to class
            // sqlancer.databend.ast.DatabendBinaryArithmeticOperation$DatabendBinaryArithmeticOperator
            // (sqlancer.databend.ast.DatabendLikeOperation$DatabendLikeOperator and
            // sqlancer.databend.ast.DatabendBinaryArithmeticOperation$DatabendBinaryArithmeticOperator are in unnamed
            // module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5d04e0b5)
            //
            verifyException("sqlancer.databend.ast.DatabendBinaryArithmeticOperation", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        DatabendConstant databendConstant0 = DatabendConstant.createDateConstant((-4992L));
        DatabendUnaryPostfixOperation.DatabendUnaryPostfixOperator databendUnaryPostfixOperation_DatabendUnaryPostfixOperator0 = DatabendUnaryPostfixOperation.DatabendUnaryPostfixOperator.IS_NOT_NULL;
        DatabendUnaryPostfixOperation databendUnaryPostfixOperation0 = new DatabendUnaryPostfixOperation(
                databendConstant0, databendUnaryPostfixOperation_DatabendUnaryPostfixOperator0);
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation((DatabendExpression) null,
                databendUnaryPostfixOperation0, databendLikeOperation_DatabendLikeOperator0);
        DatabendUnaryPostfixOperation databendUnaryPostfixOperation1 = (DatabendUnaryPostfixOperation) databendLikeOperation0
                .getRightExpr();
        assertEquals(DatabendUnaryPostfixOperation.DatabendUnaryPostfixOperator.IS_NOT_NULL,
                databendUnaryPostfixOperation1.getOp());
    }

    @Test
    public void test07() throws Throwable {
        DatabendConstant.DatabendStringConstant databendConstant_DatabendStringConstant0 = new DatabendConstant.DatabendStringConstant(
                "JSONB");
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(
                databendConstant_DatabendStringConstant0, databendConstant_DatabendStringConstant0,
                databendLikeOperation_DatabendLikeOperator0);
        DatabendConstant.DatabendStringConstant databendConstant_DatabendStringConstant1 = (DatabendConstant.DatabendStringConstant) databendLikeOperation0
                .getLeftExpr();
        assertEquals("JSONB", databendConstant_DatabendStringConstant1.asString());
    }

    @Test
    public void test08() throws Throwable {
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = DatabendSchema.DatabendCompositeDataType
                .getRandomWithoutNull();
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn((String) null,
                databendSchema_DatabendCompositeDataType0, true, true);
        DatabendConstant.DatabendStringConstant databendConstant_DatabendStringConstant0 = new DatabendConstant.DatabendStringConstant(
                "4v|d!VK>B+");
        DatabendColumnValue databendColumnValue0 = new DatabendColumnValue(databendSchema_DatabendColumn0,
                databendConstant_DatabendStringConstant0);
        DatabendConstant databendConstant0 = DatabendConstant.createNullConstant();
        DatabendColumnValue databendColumnValue1 = new DatabendColumnValue(databendSchema_DatabendColumn0,
                databendConstant0);
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendColumnValue0,
                databendColumnValue1, databendLikeOperation_DatabendLikeOperator0);
        DatabendConstant databendConstant1 = databendLikeOperation0.getExpectedValue();
        assertFalse(databendConstant1.isString());
    }

    @Test
    public void test09() throws Throwable {
        DatabendSchema.DatabendDataType databendSchema_DatabendDataType0 = DatabendSchema.DatabendDataType.BOOLEAN;
        DatabendSchema.DatabendCompositeDataType databendSchema_DatabendCompositeDataType0 = new DatabendSchema.DatabendCompositeDataType(
                databendSchema_DatabendDataType0, 0);
        DatabendSchema.DatabendColumn databendSchema_DatabendColumn0 = new DatabendSchema.DatabendColumn((String) null,
                databendSchema_DatabendCompositeDataType0, false, true);
        DatabendConstant.DatabendNullConstant databendConstant_DatabendNullConstant0 = new DatabendConstant.DatabendNullConstant();
        DatabendColumnValue databendColumnValue0 = DatabendColumnValue.create(databendSchema_DatabendColumn0,
                databendConstant_DatabendNullConstant0);
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendColumnValue0,
                databendColumnValue0, databendLikeOperation_DatabendLikeOperator0);
        DatabendConstant databendConstant0 = databendLikeOperation0.getExpectedValue();
        assertEquals("NULL", databendConstant0.toString());
    }

    @Test
    public void test10() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendConstant.DatabendStringConstant databendConstant_DatabendStringConstant0 = new DatabendConstant.DatabendStringConstant(
                "like");
        DatabendColumnValue databendColumnValue0 = new DatabendColumnValue((DatabendSchema.DatabendColumn) null,
                databendConstant_DatabendStringConstant0);
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendColumnValue0,
                databendColumnValue0, databendLikeOperation_DatabendLikeOperator0);
        DatabendConstant databendConstant0 = databendLikeOperation0.getExpectedValue();
        assertNotNull(databendConstant0);
        assertEquals("true", databendConstant0.toString());
    }

    @Test
    public void test11() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendSelect databendSelect0 = new DatabendSelect();
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendSelect0, databendSelect0,
                databendLikeOperation_DatabendLikeOperator0);
        DatabendConstant databendConstant0 = databendLikeOperation0.getExpectedValue();
        assertNull(databendConstant0);
    }

    @Test
    public void test12() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        String string0 = databendLikeOperation_DatabendLikeOperator0.getTextRepresentation();
        assertEquals("LIKE", string0);
    }

    @Test
    public void test13() throws Throwable {
        DatabendConstant.DatabendStringConstant databendConstant_DatabendStringConstant0 = new DatabendConstant.DatabendStringConstant(
                "JSONB");
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(
                databendConstant_DatabendStringConstant0, databendConstant_DatabendStringConstant0,
                databendLikeOperation_DatabendLikeOperator0);
        DatabendSchema.DatabendDataType databendSchema_DatabendDataType0 = databendLikeOperation0.getExpectedType();
        assertEquals(DatabendSchema.DatabendDataType.BOOLEAN, databendSchema_DatabendDataType0);
    }

    @Test
    public void test14() throws Throwable {
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation((DatabendExpression) null,
                (DatabendExpression) null, (DatabendLikeOperation.DatabendLikeOperator) null);
        databendLikeOperation0.getOp();
    }

    @Test
    public void test15() throws Throwable {
        DatabendLikeOperation.DatabendLikeOperator databendLikeOperation_DatabendLikeOperator0 = DatabendLikeOperation.DatabendLikeOperator.LIKE_OPERATOR;
        DatabendConstant.DatabendTimestampConstant databendConstant_DatabendTimestampConstant0 = new DatabendConstant.DatabendTimestampConstant(
                (-1704L));
        DatabendColumnValue databendColumnValue0 = new DatabendColumnValue((DatabendSchema.DatabendColumn) null,
                databendConstant_DatabendTimestampConstant0);
        DatabendLikeOperation databendLikeOperation0 = new DatabendLikeOperation(databendColumnValue0,
                databendConstant_DatabendTimestampConstant0, databendLikeOperation_DatabendLikeOperator0);
        DatabendConstant databendConstant0 = databendLikeOperation0.getExpectedValue();
        assertNull(databendConstant0);
    }
}
