/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:32:47 GMT 2025
 */

package sqlancer.evosuite.clickhouse.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.clickhouse.ast.ClickHouseExpression;
import sqlancer.clickhouse.ast.ClickHousePostfixText;
import sqlancer.clickhouse.ast.ClickHouseUnaryFunctionOperation;
import sqlancer.clickhouse.ast.constant.ClickHouseInt8Constant;
import sqlancer.clickhouse.ast.constant.ClickHouseUInt8Constant;

public class ClickHouseUnaryFunctionOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        ClickHouseUInt8Constant clickHouseUInt8Constant0 = new ClickHouseUInt8Constant(0);
        ClickHouseUnaryFunctionOperation clickHouseUnaryFunctionOperation0 = new ClickHouseUnaryFunctionOperation(
                clickHouseUInt8Constant0, (ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator) null);
        // Undeclared exception!
        try {
            clickHouseUnaryFunctionOperation0.getOperatorRepresentation();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.clickhouse.ast.ClickHouseUnaryFunctionOperation", e);
        }
    }

    @Test
    public void test1() throws Throwable {
        ClickHouseInt8Constant clickHouseInt8Constant0 = new ClickHouseInt8Constant(1851);
        ClickHousePostfixText clickHouseExpression_ClickHousePostfixText0 = new ClickHousePostfixText(
                "}O[03;(n(\"?eURg4", clickHouseInt8Constant0);
        ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0 = ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator.LOG;
        ClickHouseUnaryFunctionOperation clickHouseUnaryFunctionOperation0 = new ClickHouseUnaryFunctionOperation(
                clickHouseExpression_ClickHousePostfixText0,
                clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0);
        clickHouseUnaryFunctionOperation0.getOperatorRepresentation();
    }

    @Test
    public void test2() throws Throwable {
        ClickHouseInt8Constant clickHouseInt8Constant0 = new ClickHouseInt8Constant(1851);
        ClickHousePostfixText clickHouseExpression_ClickHousePostfixText0 = new ClickHousePostfixText(
                "}O[03;(n(\"?eURg4", clickHouseInt8Constant0);
        ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0 = ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator.LOG;
        ClickHouseUnaryFunctionOperation clickHouseUnaryFunctionOperation0 = new ClickHouseUnaryFunctionOperation(
                clickHouseExpression_ClickHousePostfixText0,
                clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0);
        clickHouseUnaryFunctionOperation0.getExpression();
    }

    @Test
    public void test3() throws Throwable {
        ClickHouseInt8Constant clickHouseInt8Constant0 = new ClickHouseInt8Constant(1851);
        ClickHousePostfixText clickHouseExpression_ClickHousePostfixText0 = new ClickHousePostfixText(
                "}O[03;(n(\"?eURg4", clickHouseInt8Constant0);
        ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0 = ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator.LOG;
        ClickHouseUnaryFunctionOperation clickHouseUnaryFunctionOperation0 = new ClickHouseUnaryFunctionOperation(
                clickHouseExpression_ClickHousePostfixText0,
                clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0);
        clickHouseUnaryFunctionOperation0.getOperatorKind();
    }

    @Test
    public void test4() throws Throwable {
        ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0 = ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator.SQRT;
        ClickHouseUnaryFunctionOperation clickHouseUnaryFunctionOperation0 = new ClickHouseUnaryFunctionOperation(
                (ClickHouseExpression) null, clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0);
        ClickHouseExpression clickHouseExpression0 = clickHouseUnaryFunctionOperation0.getExpression();
        assertNull(clickHouseExpression0);
    }

    @Test
    public void test5() throws Throwable {
        ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0 = ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator.TAN;
        String string0 = clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0.getTextRepresentation();
        assertEquals("tan", string0);
    }

    @Test
    public void test6() throws Throwable {
        ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0 = ClickHouseUnaryFunctionOperation.ClickHouseUnaryFunctionOperator
                .getRandom();
        assertEquals("exp", clickHouseUnaryFunctionOperation_ClickHouseUnaryFunctionOperator0.getTextRepresentation());
    }
}
