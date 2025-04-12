/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:56:34 GMT 2025
 */

package sqlancer.evosuite.cnosdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.cnosdb.ast.CnosDBBinaryArithmeticOperation;
import sqlancer.cnosdb.ast.CnosDBConstant;
import sqlancer.cnosdb.CnosDBSchema;

public class CnosDBBinaryArithmeticOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.TIMESTAMP;
        CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator.getRandom(cnosDBSchema_CnosDBDataType0);
    }

    @Test
    public void test1() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.UINT;
        CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator.getRandom(cnosDBSchema_CnosDBDataType0);
    }

    @Test
    public void test2() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.DOUBLE;
        CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator.getRandom(cnosDBSchema_CnosDBDataType0);
    }

    @Test
    public void test3() throws Throwable {
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.STRING;
        CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator.getRandom(cnosDBSchema_CnosDBDataType0);
    }

    @Test
    public void test4() throws Throwable {
        CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator cnosDBBinaryArithmeticOperation_CnosDBBinaryOperator0 = CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator.EXPONENTIATION;
        CnosDBConstant.TimeStampConstant cnosDBConstant_TimeStampConstant0 = new CnosDBConstant.TimeStampConstant(
                4214L);
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType0 = CnosDBSchema.CnosDBDataType.STRING;
        CnosDBConstant cnosDBConstant0 = cnosDBConstant_TimeStampConstant0.cast(cnosDBSchema_CnosDBDataType0);
        CnosDBBinaryArithmeticOperation cnosDBBinaryArithmeticOperation0 = new CnosDBBinaryArithmeticOperation(
                cnosDBConstant0, cnosDBConstant_TimeStampConstant0,
                cnosDBBinaryArithmeticOperation_CnosDBBinaryOperator0);
        CnosDBSchema.CnosDBDataType cnosDBSchema_CnosDBDataType1 = cnosDBBinaryArithmeticOperation0.getExpressionType();
        assertNotSame(cnosDBSchema_CnosDBDataType0, cnosDBSchema_CnosDBDataType1);
    }

    @Test
    public void test5() throws Throwable {
        CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator cnosDBBinaryArithmeticOperation_CnosDBBinaryOperator0 = CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator.EXPONENTIATION;
        String string0 = cnosDBBinaryArithmeticOperation_CnosDBBinaryOperator0.getTextRepresentation();
        assertEquals("^", string0);
    }
}
