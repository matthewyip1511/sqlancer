/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 20:56:04 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.cockroachdb.ast.CockroachDBExpression;
import sqlancer.cockroachdb.ast.CockroachDBUnaryPostfixOperation;
import sqlancer.common.visitor.UnaryOperation;

public class CockroachDBUnaryPostfixOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        CockroachDBUnaryPostfixOperation.CockroachDBUnaryPostfixOperator cockroachDBUnaryPostfixOperation_CockroachDBUnaryPostfixOperator0 = CockroachDBUnaryPostfixOperation.CockroachDBUnaryPostfixOperator.IS_NOT_FALSE;
        String string0 = cockroachDBUnaryPostfixOperation_CockroachDBUnaryPostfixOperator0.getTextRepresentation();
        assertEquals("IS NOT FALSE", string0);
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBUnaryPostfixOperation.CockroachDBUnaryPostfixOperator cockroachDBUnaryPostfixOperation_CockroachDBUnaryPostfixOperator0 = CockroachDBUnaryPostfixOperation.CockroachDBUnaryPostfixOperator.IS_NOT_NULL;
        CockroachDBUnaryPostfixOperation cockroachDBUnaryPostfixOperation0 = new CockroachDBUnaryPostfixOperation(
                (CockroachDBExpression) null, cockroachDBUnaryPostfixOperation_CockroachDBUnaryPostfixOperator0);
        UnaryOperation.OperatorKind unaryOperation_OperatorKind0 = cockroachDBUnaryPostfixOperation0.getOperatorKind();
        assertEquals(UnaryOperation.OperatorKind.POSTFIX, unaryOperation_OperatorKind0);
    }
}
