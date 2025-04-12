/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:34:25 GMT 2025
 */

package sqlancer.evosuite.cnosdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import sqlancer.cnosdb.ast.CnosDBBinaryArithmeticOperation;
import sqlancer.cnosdb.ast.CnosDBConstant;
import sqlancer.cnosdb.ast.CnosDBExpression;
import sqlancer.cnosdb.ast.CnosDBInOperation;
import sqlancer.cnosdb.ast.CnosDBSelect;
import sqlancer.Randomly;

public class CnosDBInOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        CnosDBConstant.BooleanConstant cnosDBConstant_BooleanConstant0 = new CnosDBConstant.BooleanConstant(false);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation(cnosDBConstant_BooleanConstant0,
                (List<CnosDBExpression>) null, false);
        boolean boolean0 = cnosDBInOperation0.isTrue();
        assertFalse(boolean0);
    }

    @Test
    public void test1() throws Throwable {
        CnosDBConstant.BooleanConstant cnosDBConstant_BooleanConstant0 = new CnosDBConstant.BooleanConstant(true);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation(cnosDBConstant_BooleanConstant0,
                (List<CnosDBExpression>) null, true);
        cnosDBInOperation0.getListElements();
        assertTrue(cnosDBInOperation0.isTrue());
    }

    @Test
    public void test2() throws Throwable {
        CnosDBConstant.DoubleConstant cnosDBConstant_DoubleConstant0 = new CnosDBConstant.DoubleConstant(0.0);
        CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator cnosDBBinaryArithmeticOperation_CnosDBBinaryOperator0 = CnosDBBinaryArithmeticOperation.CnosDBBinaryOperator.ADDITION;
        CnosDBBinaryArithmeticOperation cnosDBBinaryArithmeticOperation0 = new CnosDBBinaryArithmeticOperation(
                cnosDBConstant_DoubleConstant0, cnosDBConstant_DoubleConstant0,
                cnosDBBinaryArithmeticOperation_CnosDBBinaryOperator0);
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        List<CnosDBExpression> list0 = cnosDBSelect0.getOrderByClauses();
        List<CnosDBExpression> list1 = Randomly.subset(list0);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation(cnosDBBinaryArithmeticOperation0, list1, false);
        cnosDBInOperation0.getListElements();
        assertFalse(cnosDBInOperation0.isTrue());
    }

    @Test
    public void test3() throws Throwable {
        CnosDBExpression[] cnosDBExpressionArray0 = new CnosDBExpression[9];
        List<CnosDBExpression> list0 = Randomly.subset(cnosDBExpressionArray0);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation((CnosDBExpression) null, list0, true);
        cnosDBInOperation0.getExpr();
        assertTrue(cnosDBInOperation0.isTrue());
    }

    @Test
    public void test4() throws Throwable {
        CnosDBConstant.BooleanConstant cnosDBConstant_BooleanConstant0 = new CnosDBConstant.BooleanConstant(false);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation(cnosDBConstant_BooleanConstant0,
                (List<CnosDBExpression>) null, false);
        cnosDBInOperation0.getExpressionType();
        assertFalse(cnosDBInOperation0.isTrue());
    }

    @Test
    public void test5() throws Throwable {
        CnosDBExpression[] cnosDBExpressionArray0 = new CnosDBExpression[9];
        List<CnosDBExpression> list0 = Randomly.subset(cnosDBExpressionArray0);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation((CnosDBExpression) null, list0, true);
        boolean boolean0 = cnosDBInOperation0.isTrue();
        assertTrue(boolean0);
    }

    @Test
    public void test6() throws Throwable {
        CnosDBConstant.DoubleConstant cnosDBConstant_DoubleConstant0 = new CnosDBConstant.DoubleConstant(0.0);
        CnosDBExpression[] cnosDBExpressionArray0 = new CnosDBExpression[2];
        List<CnosDBExpression> list0 = Randomly.nonEmptySubset(cnosDBExpressionArray0);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation(cnosDBConstant_DoubleConstant0, list0, false);
        cnosDBInOperation0.getListElements();
        assertFalse(cnosDBInOperation0.isTrue());
    }

    @Test
    public void test7() throws Throwable {
        CnosDBConstant.BooleanConstant cnosDBConstant_BooleanConstant0 = new CnosDBConstant.BooleanConstant(false);
        CnosDBInOperation cnosDBInOperation0 = new CnosDBInOperation(cnosDBConstant_BooleanConstant0,
                (List<CnosDBExpression>) null, false);
        cnosDBInOperation0.getExpr();
        assertFalse(cnosDBInOperation0.isTrue());
    }
}
