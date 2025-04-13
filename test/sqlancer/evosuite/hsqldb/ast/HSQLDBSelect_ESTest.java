/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:43:52 GMT 2025
 */

package sqlancer.evosuite.hsqldb.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

import sqlancer.common.ast.JoinBase;
import sqlancer.hsqldb.ast.HSQLDBExpression;
import sqlancer.hsqldb.ast.HSQLDBSelect;
import sqlancer.Randomly;

public class HSQLDBSelect_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        hSQLDBSelect0.setDistinct(true);
        boolean boolean0 = hSQLDBSelect0.isDistinct();
        assertTrue(boolean0);
    }

//    @Test
//    public void test1() throws Throwable {
//        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
//        HSQLDBExpression[] hSQLDBExpressionArray0 = new HSQLDBExpression[5];
//        List<HSQLDBExpression> list0 = Randomly.nonEmptySubset(hSQLDBExpressionArray0);
//        hSQLDBSelect0.setJoinList(list0);
//        List<JoinBase<HSQLDBExpression>> list1 = hSQLDBSelect0.getJoinClauses();
//        assertEquals(1, list1.size());
//    }

    @Test
    public void test2() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        hSQLDBSelect0.setJoinList((List<HSQLDBExpression>) null);
        // Undeclared exception!
        try {
            hSQLDBSelect0.getJoinClauses();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.hsqldb.ast.HSQLDBSelect", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        List<HSQLDBExpression> list0 = List.of((HSQLDBExpression) hSQLDBSelect0);
        hSQLDBSelect0.setJoinList(list0);
        // Undeclared exception!
        try {
            hSQLDBSelect0.getJoinClauses();
            fail("Expecting exception: ClassCastException");

        } catch (ClassCastException e) {
            //
            // class sqlancer.hsqldb.ast.HSQLDBSelect cannot be cast to class sqlancer.hsqldb.ast.HSQLDBJoin
            // (sqlancer.hsqldb.ast.HSQLDBSelect and sqlancer.hsqldb.ast.HSQLDBJoin are in unnamed module of loader
            // org.evosuite.instrumentation.InstrumentingClassLoader @765f2cd0)
            //
            verifyException("sqlancer.hsqldb.ast.HSQLDBSelect", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        List<HSQLDBExpression> list0 = List.of((HSQLDBExpression) hSQLDBSelect0, (HSQLDBExpression) hSQLDBSelect0,
                (HSQLDBExpression) hSQLDBSelect0, (HSQLDBExpression) hSQLDBSelect0, (HSQLDBExpression) hSQLDBSelect0,
                (HSQLDBExpression) hSQLDBSelect0, (HSQLDBExpression) hSQLDBSelect0, (HSQLDBExpression) hSQLDBSelect0);
        hSQLDBSelect0.setFetchColumns(list0);
        // Undeclared exception!
        try {
            hSQLDBSelect0.asString();
            fail("Expecting exception: StackOverflowError");

        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test5() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        boolean boolean0 = hSQLDBSelect0.isDistinct();
        assertFalse(boolean0);
    }

    @Test
    public void test6() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        // Undeclared exception!
        try {
            hSQLDBSelect0.setJoinClauses((List<JoinBase<HSQLDBExpression>>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.hsqldb.ast.HSQLDBSelect", e);
        }
    }

    @Test
    public void test7() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        // Undeclared exception!
        try {
            hSQLDBSelect0.asString();
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test8() throws Throwable {
        HSQLDBSelect hSQLDBSelect0 = new HSQLDBSelect();
        List<JoinBase<HSQLDBExpression>> list0 = hSQLDBSelect0.getJoinClauses();
        hSQLDBSelect0.setJoinClauses(list0);
        assertTrue(list0.isEmpty());
    }
}
