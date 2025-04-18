/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:03:26 GMT 2025
 */

package sqlancer.evosuite.presto;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.ast.newast.NewBetweenOperatorNode;
import sqlancer.common.ast.newast.NewBinaryOperatorNode;
import sqlancer.h2.H2ExpressionGenerator;
import sqlancer.presto.ast.PrestoAggregateFunction;
import sqlancer.presto.ast.PrestoAtTimeZoneOperator;
import sqlancer.presto.ast.PrestoBinaryOperation;
import sqlancer.presto.ast.PrestoCastFunction;
import sqlancer.presto.ast.PrestoConditionalFunction;
import sqlancer.presto.ast.PrestoConstant;
import sqlancer.presto.ast.PrestoDateFunction;
import sqlancer.presto.ast.PrestoExpression;
import sqlancer.presto.ast.PrestoFunctionNode;
import sqlancer.presto.ast.PrestoFunctionWithoutParenthesis;
import sqlancer.presto.ast.PrestoJoin;
import sqlancer.presto.ast.PrestoMultiValuedComparison;
import sqlancer.presto.ast.PrestoMultiValuedComparisonOperator;
import sqlancer.presto.ast.PrestoMultiValuedComparisonType;
import sqlancer.presto.ast.PrestoQuantifiedComparison;
import sqlancer.presto.ast.PrestoSelect;
import sqlancer.presto.ast.PrestoTableReference;
import sqlancer.presto.PrestoSchema;
import sqlancer.presto.PrestoToStringVisitor;

public class PrestoToStringVisitor_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoExpression prestoExpression0 = PrestoConstant.createVarbinaryConstant("4$*z-wW");
        LinkedList<PrestoExpression> linkedList0 = new LinkedList<PrestoExpression>();
        PrestoMultiValuedComparisonType prestoMultiValuedComparisonType0 = PrestoMultiValuedComparisonType.SOME;
        PrestoMultiValuedComparisonOperator prestoMultiValuedComparisonOperator0 = PrestoMultiValuedComparisonOperator.SMALLER;
        PrestoMultiValuedComparison prestoMultiValuedComparison0 = new PrestoMultiValuedComparison(prestoExpression0,
                linkedList0, prestoMultiValuedComparisonType0, prestoMultiValuedComparisonOperator0);
        prestoToStringVisitor0.visit(prestoMultiValuedComparison0);
        assertEquals(PrestoMultiValuedComparisonOperator.SMALLER, prestoMultiValuedComparison0.getOp());
    }

    @Test
    public void test01() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoExpression prestoExpression0 = PrestoConstant.createIntervalYearToMonth(1L);
        PrestoAtTimeZoneOperator prestoAtTimeZoneOperator0 = new PrestoAtTimeZoneOperator(prestoExpression0,
                prestoExpression0);
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.VARBINARY;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoSchema_PrestoDataType0.get();
        PrestoCastFunction prestoCastFunction0 = new PrestoCastFunction(prestoAtTimeZoneOperator0,
                prestoSchema_PrestoCompositeDataType0);
        prestoToStringVisitor0.visit(prestoCastFunction0);
    }

    @Test
    public void test02() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoExpression prestoExpression0 = PrestoConstant.createVarbinaryConstant("4$*z-wW");
        PrestoSelect prestoSelect0 = new PrestoSelect();
        PrestoMultiValuedComparisonType prestoMultiValuedComparisonType0 = PrestoMultiValuedComparisonType.ALL;
        PrestoMultiValuedComparisonOperator prestoMultiValuedComparisonOperator0 = PrestoMultiValuedComparisonOperator.SMALLER;
        PrestoQuantifiedComparison prestoQuantifiedComparison0 = new PrestoQuantifiedComparison(prestoExpression0,
                prestoSelect0, prestoMultiValuedComparisonType0, prestoMultiValuedComparisonOperator0);
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit(prestoQuantifiedComparison0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        LinkedList<PrestoSchema.PrestoColumn> linkedList0 = new LinkedList<PrestoSchema.PrestoColumn>();
        PrestoSchema.PrestoTable prestoSchema_PrestoTable0 = new PrestoSchema.PrestoTable("", linkedList0, false);
        PrestoTableReference prestoTableReference0 = new PrestoTableReference(prestoSchema_PrestoTable0);
        String string0 = PrestoToStringVisitor.asString(prestoTableReference0);
        assertEquals("", string0);
    }

    @Test
    public void test04() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoConditionalFunction prestoConditionalFunction0 = PrestoConditionalFunction.IF_TRUE_FALSE;
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visitSpecific((PrestoExpression) prestoConditionalFunction0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // class sqlancer.presto.ast.PrestoConditionalFunction$2
            //
        }
    }

    @Test
    public void test05() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoAggregateFunction prestoAggregateFunction0 = PrestoAggregateFunction.GEOMETRIC_MEAN;
        PrestoSelect prestoSelect0 = new PrestoSelect();
        PrestoMultiValuedComparisonType prestoMultiValuedComparisonType0 = PrestoMultiValuedComparisonType.ANY;
        PrestoMultiValuedComparisonOperator prestoMultiValuedComparisonOperator0 = PrestoMultiValuedComparisonOperator.EQUALS;
        PrestoQuantifiedComparison prestoQuantifiedComparison0 = new PrestoQuantifiedComparison(
                prestoAggregateFunction0, prestoSelect0, prestoMultiValuedComparisonType0,
                prestoMultiValuedComparisonOperator0);
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit(prestoQuantifiedComparison0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // class sqlancer.presto.ast.PrestoAggregateFunction$6
            //
        }
    }

    @Test
    public void test06() throws Throwable {
        PrestoSelect prestoSelect0 = new PrestoSelect();
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        List<PrestoExpression> list0 = prestoSelect0.getGroupByClause();
        PrestoMultiValuedComparisonType prestoMultiValuedComparisonType0 = PrestoMultiValuedComparisonType.ANY;
        PrestoMultiValuedComparisonOperator prestoMultiValuedComparisonOperator0 = PrestoMultiValuedComparisonOperator.GREATER_EQUALS;
        PrestoMultiValuedComparison prestoMultiValuedComparison0 = new PrestoMultiValuedComparison(prestoSelect0, list0,
                prestoMultiValuedComparisonType0, prestoMultiValuedComparisonOperator0);
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit(prestoMultiValuedComparison0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoDateFunction prestoDateFunction0 = PrestoDateFunction.FROM_ISO8601_TIMESTAMP;
        List<PrestoExpression> list0 = List.of((PrestoExpression) prestoDateFunction0,
                (PrestoExpression) prestoDateFunction0, (PrestoExpression) prestoDateFunction0);
        PrestoMultiValuedComparisonType prestoMultiValuedComparisonType0 = PrestoMultiValuedComparisonType.ALL;
        PrestoMultiValuedComparisonOperator prestoMultiValuedComparisonOperator0 = PrestoMultiValuedComparisonOperator.GREATER;
        PrestoMultiValuedComparison prestoMultiValuedComparison0 = new PrestoMultiValuedComparison(prestoDateFunction0,
                list0, prestoMultiValuedComparisonType0, prestoMultiValuedComparisonOperator0);
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit(prestoMultiValuedComparison0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // class sqlancer.presto.ast.PrestoDateFunction
            //
        }
    }

    @Test
    public void test08() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoSelect prestoSelect0 = new PrestoSelect();
        PrestoCastFunction prestoCastFunction0 = new PrestoCastFunction(prestoSelect0,
                (PrestoSchema.PrestoCompositeDataType) null);
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit(prestoCastFunction0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoConditionalFunction prestoConditionalFunction0 = PrestoConditionalFunction.IF_TRUE_FALSE;
        PrestoCastFunction prestoCastFunction0 = new PrestoCastFunction(prestoConditionalFunction0,
                (PrestoSchema.PrestoCompositeDataType) null);
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit(prestoCastFunction0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // class sqlancer.presto.ast.PrestoConditionalFunction$2
            //
        }
    }

    @Test
    public void test10() throws Throwable {
        LinkedList<PrestoExpression> linkedList0 = new LinkedList<PrestoExpression>();
        PrestoFunctionNode<Object> prestoFunctionNode0 = new PrestoFunctionNode<Object>(linkedList0, linkedList0);
        linkedList0.add((PrestoExpression) prestoFunctionNode0);
        // Undeclared exception!
        try {
            PrestoToStringVisitor.asString(prestoFunctionNode0);
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test11() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoSelect prestoSelect0 = new PrestoSelect();
        PrestoMultiValuedComparisonType prestoMultiValuedComparisonType0 = PrestoMultiValuedComparisonType.SOME;
        PrestoMultiValuedComparisonOperator prestoMultiValuedComparisonOperator0 = PrestoMultiValuedComparisonOperator.GREATER_EQUALS;
        PrestoQuantifiedComparison prestoQuantifiedComparison0 = new PrestoQuantifiedComparison(prestoSelect0,
                prestoSelect0, prestoMultiValuedComparisonType0, prestoMultiValuedComparisonOperator0);
        NewBetweenOperatorNode<PrestoExpression> newBetweenOperatorNode0 = new NewBetweenOperatorNode<PrestoExpression>(
                prestoQuantifiedComparison0, prestoQuantifiedComparison0, prestoSelect0, true);
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit(newBetweenOperatorNode0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    // @Test
    // public void test12() throws Throwable {
    // PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
    // PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
    // .getRandomWithoutNull();
    // PrestoExpression prestoExpression0 = PrestoConstant.createIntConstant(prestoSchema_PrestoCompositeDataType0,
    // 9223372036854775807L, false);
    // PrestoSelect prestoSelect0 = new PrestoSelect();
    // List<PrestoExpression> list0 = prestoSelect0.getJoinList();
    // PrestoMultiValuedComparisonType prestoMultiValuedComparisonType0 = PrestoMultiValuedComparisonType.SOME;
    // PrestoMultiValuedComparisonOperator prestoMultiValuedComparisonOperator0 =
    // PrestoMultiValuedComparisonOperator.SMALLER;
    // PrestoMultiValuedComparison prestoMultiValuedComparison0 = new PrestoMultiValuedComparison(prestoExpression0,
    // list0, prestoMultiValuedComparisonType0, prestoMultiValuedComparisonOperator0);
    // NewOrderingTerm.Ordering newOrderingTerm_Ordering0 = NewOrderingTerm.Ordering.DESC;
    // NewOrderingTerm<PrestoExpression> newOrderingTerm0 = new NewOrderingTerm<PrestoExpression>(
    // prestoMultiValuedComparison0, newOrderingTerm_Ordering0);
    // prestoToStringVisitor0.visit(newOrderingTerm0);
    // assertEquals(NewOrderingTerm.Ordering.DESC, newOrderingTerm0.getOrdering());
    // }

    @Test
    public void test13() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        LinkedList<PrestoSchema.PrestoColumn> linkedList0 = new LinkedList<PrestoSchema.PrestoColumn>();
        PrestoSchema.PrestoTable prestoSchema_PrestoTable0 = new PrestoSchema.PrestoTable("\"!U;t?37@j8r.d7",
                linkedList0, false);
        PrestoTableReference prestoTableReference0 = new PrestoTableReference(prestoSchema_PrestoTable0);
        PrestoAtTimeZoneOperator prestoAtTimeZoneOperator0 = new PrestoAtTimeZoneOperator(prestoTableReference0,
                prestoTableReference0);
        prestoToStringVisitor0.visitSpecific((PrestoExpression) prestoAtTimeZoneOperator0);
    }

    @Test
    public void test14() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visitSpecific((PrestoExpression) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.PrestoToStringVisitor", e);
        }
    }

    @Test
    public void test15() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoConstant.PrestoFloatConstant prestoConstant_PrestoFloatConstant0 = new PrestoConstant.PrestoFloatConstant(
                (-120.3));
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.JSON;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = PrestoSchema.PrestoCompositeDataType
                .fromDataType(prestoSchema_PrestoDataType0);
        PrestoCastFunction prestoCastFunction0 = new PrestoCastFunction(prestoConstant_PrestoFloatConstant0,
                prestoSchema_PrestoCompositeDataType0);
        prestoToStringVisitor0.visitSpecific((PrestoExpression) prestoCastFunction0);
    }

    @Test
    public void test16() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoSelect prestoSelect0 = new PrestoSelect();
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visitSpecific((PrestoExpression) prestoSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoExpression prestoExpression0 = PrestoConstant.createVarbinaryConstant("4$*z-wW");
        H2ExpressionGenerator.H2BinaryLogicalOperator h2ExpressionGenerator_H2BinaryLogicalOperator0 = H2ExpressionGenerator.H2BinaryLogicalOperator.AND;
        PrestoBinaryOperation prestoBinaryOperation0 = new PrestoBinaryOperation(prestoExpression0, prestoExpression0,
                h2ExpressionGenerator_H2BinaryLogicalOperator0);
        prestoToStringVisitor0.visit((NewBinaryOperatorNode<PrestoExpression>) prestoBinaryOperation0);
    }

    @Test
    public void test18() throws Throwable {
        PrestoSelect prestoSelect0 = new PrestoSelect();
        prestoSelect0.setDistinct(true);
        // Undeclared exception!
        try {
            PrestoToStringVisitor.asString(prestoSelect0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test19() throws Throwable {
        LinkedList<PrestoSchema.PrestoColumn> linkedList0 = new LinkedList<PrestoSchema.PrestoColumn>();
        PrestoSchema.PrestoTable prestoSchema_PrestoTable0 = new PrestoSchema.PrestoTable((String) null, linkedList0,
                true);
        PrestoTableReference prestoTableReference0 = new PrestoTableReference(prestoSchema_PrestoTable0);
        PrestoJoin prestoJoin0 = PrestoJoin.createRightOuterJoin(prestoTableReference0, prestoTableReference0,
                (PrestoExpression) null);
        String string0 = PrestoToStringVisitor.asString(prestoJoin0);
        assertEquals("null RIGHT  JOIN null", string0);
    }

    @Test
    public void test20() throws Throwable {
        LinkedList<PrestoSchema.PrestoColumn> linkedList0 = new LinkedList<PrestoSchema.PrestoColumn>();
        PrestoSchema.PrestoTable prestoSchema_PrestoTable0 = new PrestoSchema.PrestoTable("ESCE", linkedList0, false);
        PrestoTableReference prestoTableReference0 = new PrestoTableReference(prestoSchema_PrestoTable0);
        PrestoJoin prestoJoin0 = PrestoJoin.createRightOuterJoin(prestoTableReference0, prestoTableReference0,
                prestoTableReference0);
        String string0 = PrestoToStringVisitor.asString(prestoJoin0);
        assertEquals("ESCE RIGHT  JOIN ESCE ON ESCE", string0);
    }

    @Test
    public void test21() throws Throwable {
        PrestoDateFunction prestoDateFunction0 = PrestoDateFunction.CURRENT_TIME_NA;
        PrestoSchema.PrestoDataType prestoSchema_PrestoDataType0 = PrestoSchema.PrestoDataType.BOOLEAN;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoSchema_PrestoDataType0.get();
        PrestoCastFunction prestoCastFunction0 = new PrestoCastFunction(prestoDateFunction0,
                prestoSchema_PrestoCompositeDataType0);
        // Undeclared exception!
        try {
            PrestoToStringVisitor.asString(prestoCastFunction0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // class sqlancer.presto.ast.PrestoDateFunction$4
            //
        }
    }

    // @Test
    // public void test22() throws Throwable {
    // PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
    // PrestoJoin prestoJoin0 = PrestoJoin.createInnerJoin((PrestoTableReference) null, (PrestoTableReference) null,
    // (PrestoExpression) null);
    // // Undeclared exception!
    // try {
    // prestoToStringVisitor0.visitSpecific((PrestoExpression) prestoJoin0);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.presto.PrestoToStringVisitor", e);
    // }
    // }

    @Test
    public void test23() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit((PrestoMultiValuedComparison) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.PrestoToStringVisitor", e);
        }
    }

    @Test
    public void test24() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        PrestoAggregateFunction prestoAggregateFunction0 = PrestoAggregateFunction.COUNT_NOARGS;
        PrestoSchema.PrestoCompositeDataType prestoSchema_PrestoCompositeDataType0 = prestoAggregateFunction0
                .getCompositeReturnType();
        PrestoFunctionWithoutParenthesis prestoFunctionWithoutParenthesis0 = new PrestoFunctionWithoutParenthesis(
                "ESeE", prestoSchema_PrestoCompositeDataType0);
        prestoToStringVisitor0.visitSpecific((PrestoExpression) prestoFunctionWithoutParenthesis0);
        assertEquals("ESeE", prestoFunctionWithoutParenthesis0.getExpr());
    }

    // @Test
    // public void test25() throws Throwable {
    // // Undeclared exception!
    // try {
    // PrestoToStringVisitor.asString((PrestoExpression) null);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.presto.PrestoToStringVisitor", e);
    // }
    // }

    @Test
    public void test26() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit((PrestoQuantifiedComparison) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.PrestoToStringVisitor", e);
        }
    }

    @Test
    public void test27() throws Throwable {
        PrestoToStringVisitor prestoToStringVisitor0 = new PrestoToStringVisitor();
        // Undeclared exception!
        try {
            prestoToStringVisitor0.visit((PrestoCastFunction) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.presto.PrestoToStringVisitor", e);
        }
    }
}
