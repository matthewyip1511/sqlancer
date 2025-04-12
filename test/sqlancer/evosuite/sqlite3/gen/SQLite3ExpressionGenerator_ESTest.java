/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 00:14:07 GMT 2025
 */

package sqlancer.evosuite.sqlite3.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.Random;
import org.junit.jupiter.api.Test;
import sqlancer.common.schema.AbstractTables;
import sqlancer.common.visitor.UnaryOperation;
import sqlancer.sqlite3.ast.SQLite3Constant;
import sqlancer.sqlite3.ast.SQLite3Expression;
import sqlancer.sqlite3.ast.SQLite3Select;
import sqlancer.sqlite3.ast.SQLite3UnaryOperation;
import sqlancer.sqlite3.gen.SQLite3ExpressionGenerator;
import sqlancer.sqlite3.schema.SQLite3Schema;
import sqlancer.sqlite3.SQLite3GlobalState;

public class SQLite3ExpressionGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getRandomExpressions(1920, (-1068));
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test01() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        List<SQLite3Expression> list0 = sQLite3ExpressionGenerator0.getRandomExpressions(0, 20);
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test02() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        List<SQLite3Expression> list0 = sQLite3ExpressionGenerator0.getRandomExpressions(0);
        assertEquals(0, list0.size());
    }

    @Test
    public void test03() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = new SQLite3ExpressionGenerator(
                sQLite3ExpressionGenerator0);
        assertFalse(sQLite3ExpressionGenerator1.equals((Object) sQLite3ExpressionGenerator0));
    }

    @Test
    public void test04() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        LinkedList<SQLite3Schema.SQLite3Table> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Table>();
        AbstractTables<SQLite3Schema.SQLite3Table, SQLite3Schema.SQLite3Column> abstractTables0 = new AbstractTables<SQLite3Schema.SQLite3Table, SQLite3Schema.SQLite3Column>(
                linkedList0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }

    @Test
    public void test05() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        LinkedList<SQLite3Schema.SQLite3Column> linkedList0 = new LinkedList<SQLite3Schema.SQLite3Column>();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0.setColumns(linkedList0);
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }

    @Test
    public void test06() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3Select sQLite3Select0 = new SQLite3Select();
        SQLite3Select sQLite3Select1 = sQLite3ExpressionGenerator0.generateSelect();
        String string0 = sQLite3ExpressionGenerator0.generateUnoptimizedQueryString(sQLite3Select1,
                (SQLite3Expression) sQLite3Select0);
        assertEquals("SELECT SUM(count) FROM (SELECT ALL (((SELECT  FROM )) IS TRUE)  as count FROM )", string0);
    }

    @Test
    public void test07() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3Select sQLite3Select0 = new SQLite3Select();
        SQLite3Constant.SQLite3NullConstant sQLite3Constant_SQLite3NullConstant0 = new SQLite3Constant.SQLite3NullConstant();
        String string0 = sQLite3ExpressionGenerator0.generateOptimizedQueryString(sQLite3Select0,
                (SQLite3Expression) sQLite3Constant_SQLite3NullConstant0, true);
        assertEquals("SELECT ALL COUNT(*) FROM  WHERE (NULL)", string0);
    }

    @Test
    public void test08() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getTableRefs();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getRandomSingleCharString();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getRandomJoinClauses((List<SQLite3Schema.SQLite3Table>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test11() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3Select sQLite3Select0 = new SQLite3Select();
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateUnoptimizedQueryString(sQLite3Select0,
                    (SQLite3Expression) sQLite3Select0);
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test12() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3Select sQLite3Select0 = sQLite3ExpressionGenerator0.generateSelect();
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateUnoptimizedQueryString(sQLite3Select0, (SQLite3Expression) null);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test13() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateResultKnownExpression();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateOrderingTerm();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test15() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3Select sQLite3Select0 = new SQLite3Select();
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateOptimizedQueryString(sQLite3Select0, (SQLite3Expression) sQLite3Select0,
                    false);
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test16() throws Throwable {
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = null;
        try {
            sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator((SQLite3GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getRandomExpression(0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test18() throws Throwable {
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = null;
        try {
            sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator((SQLite3ExpressionGenerator) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test19() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateExpression();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test20() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateOptimizedQueryString((SQLite3Select) null, (SQLite3Expression) null,
                    false);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test21() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateFetchColumns(true);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test22() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateFetchColumns(false);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test23() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getAggregateFunction(true);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test24() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        List<SQLite3Expression> list0 = sQLite3ExpressionGenerator0.getRandomExpressions((-266), (-266));
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test25() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        List<SQLite3Expression> list0 = sQLite3ExpressionGenerator0.getRandomExpressions((-4394));
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test26() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getRandomExpressions(176095624);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test27() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3ExpressionGenerator.getRandomLiteralValue(sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3Constant", e);
        }
    }

    @Test
    public void test28() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3ExpressionGenerator.getRandomLiteralValue(sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test29() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3ExpressionGenerator.getRandomLiteralValue(sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test30() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3Expression sQLite3Expression0 = SQLite3ExpressionGenerator.getRandomLiteralValue(sQLite3GlobalState0);
        assertNull(sQLite3Expression0.getExplicitCollateSequence());
    }

    @Test
    public void test31() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateOrderBys();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test32() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.setTablesAndColumns(
                    (AbstractTables<SQLite3Schema.SQLite3Table, SQLite3Schema.SQLite3Column>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test33() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.setColumns((List<SQLite3Schema.SQLite3Column>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test
    public void test34() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getRandomJoinClauses();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test35() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3Expression.SQLite3PostfixUnaryOperation sQLite3Expression_SQLite3PostfixUnaryOperation0 = (SQLite3Expression.SQLite3PostfixUnaryOperation) sQLite3ExpressionGenerator0
                .isNull((SQLite3Expression) null);
        assertEquals(UnaryOperation.OperatorKind.POSTFIX,
                sQLite3Expression_SQLite3PostfixUnaryOperation0.getOperatorKind());
    }

    @Test
    public void test36() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = (SQLite3UnaryOperation) sQLite3ExpressionGenerator0
                .negatePredicate((SQLite3Expression) null);
        assertEquals(UnaryOperation.OperatorKind.PREFIX, sQLite3UnaryOperation0.getOperatorKind());
    }

    @Test
    public void test37() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateBooleanExpression();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test38() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generatePredicate();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test39() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0.allowAggregateFunctions();
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }

    @Test
    public void test40() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0.deterministicOnly();
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }

    @Test
    public void test41() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3Select sQLite3Select0 = sQLite3ExpressionGenerator0.generateSelect();
        SQLite3Expression sQLite3Expression0 = sQLite3ExpressionGenerator0.negatePredicate((SQLite3Expression) null);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateOptimizedQueryString(sQLite3Select0, sQLite3Expression0, true);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test42() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.generateUnoptimizedQueryString((SQLite3Select) null, (SQLite3Expression) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test43() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0.tryToGenerateKnownResult();
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }

    @Test
    public void test44() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0
                .setRowValue((SQLite3Schema.SQLite3RowValue) null);
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }

    @Test
    public void test45() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0.allowSubqueries();
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }

    @Test
    public void test46() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getAggregateFunction(false);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test47() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getRandomUnaryOperator((-2));
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test48() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        // Undeclared exception!
        try {
            SQLite3ExpressionGenerator.getRandomLiteralValue(sQLite3GlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test49() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        // Undeclared exception!
        try {
            sQLite3ExpressionGenerator0.getHavingClause();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.gen.SQLite3ExpressionGenerator", e);
        }
    }

    @Test
    public void test50() throws Throwable {
        SQLite3GlobalState sQLite3GlobalState0 = new SQLite3GlobalState();
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator0 = new SQLite3ExpressionGenerator(sQLite3GlobalState0);
        SQLite3ExpressionGenerator sQLite3ExpressionGenerator1 = sQLite3ExpressionGenerator0.allowMatchClause();
        assertNotSame(sQLite3ExpressionGenerator1, sQLite3ExpressionGenerator0);
    }
}
