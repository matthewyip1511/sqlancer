/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:08:06 GMT 2025
 */

package sqlancer.evosuite.duckdb.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.ast.BinaryOperatorNode;
import sqlancer.common.schema.AbstractTables;
import sqlancer.duckdb.ast.DuckDBConstant;
import sqlancer.duckdb.ast.DuckDBExpression;
import sqlancer.duckdb.ast.DuckDBJoin;
import sqlancer.duckdb.ast.DuckDBSelect;
import sqlancer.duckdb.DuckDBProvider;
import sqlancer.duckdb.DuckDBSchema;
import sqlancer.duckdb.gen.DuckDBExpressionGenerator;

public class DuckDBExpressionGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    // @Test
    // public void test00() throws Throwable {
    // DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
    // DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
    // duckDBProvider_DuckDBGlobalState0);
    // DuckDBExpression duckDBExpression0 = duckDBExpressionGenerator0.negatePredicate((DuckDBExpression) null);
    // DuckDBSchema.DuckDBCompositeDataType duckDBSchema_DuckDBCompositeDataType0 = DuckDBSchema.DuckDBCompositeDataType
    // .getRandomWithoutNull();
    // DuckDBExpressionGenerator.DuckDBCastOperation duckDBExpressionGenerator_DuckDBCastOperation0 = new
    // DuckDBExpressionGenerator.DuckDBCastOperation(
    // duckDBExpression0, duckDBSchema_DuckDBCompositeDataType0);
    // }

    @Test
    public void test01() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        LinkedList<DuckDBSchema.DuckDBTable> linkedList0 = new LinkedList<DuckDBSchema.DuckDBTable>();
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                linkedList0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        List<DuckDBExpression> list0 = duckDBExpressionGenerator1.getTableRefs();
        assertEquals(0, list0.size());
    }

    @Test
    public void test02() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        LinkedList<DuckDBSchema.DuckDBTable> linkedList0 = new LinkedList<DuckDBSchema.DuckDBTable>();
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                linkedList0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        LinkedList<DuckDBSchema.DuckDBColumn> linkedList1 = new LinkedList<DuckDBSchema.DuckDBColumn>();
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("", linkedList1, true);
        linkedList0.addLast(duckDBSchema_DuckDBTable0);
        List<DuckDBExpression> list0 = duckDBExpressionGenerator1.getTableRefs();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test03() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        LinkedList<DuckDBSchema.DuckDBTable> linkedList0 = new LinkedList<DuckDBSchema.DuckDBTable>();
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                linkedList0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        List<DuckDBJoin> list0 = duckDBExpressionGenerator1.getRandomJoinClauses();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test04() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBSchema.DuckDBColumn duckDBSchema_DuckDBColumn0 = new DuckDBSchema.DuckDBColumn("i0>",
                (DuckDBSchema.DuckDBCompositeDataType) null, false, false);
        List<DuckDBSchema.DuckDBColumn> list0 = List.of(duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0);
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("double precision", list0,
                false);
        List<DuckDBSchema.DuckDBTable> list1 = List.of(duckDBSchema_DuckDBTable0, duckDBSchema_DuckDBTable0,
                duckDBSchema_DuckDBTable0);
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                list1);
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        duckDBExpressionGenerator0.setTablesAndColumns(abstractTables0);
        List<DuckDBExpression> list2 = duckDBExpressionGenerator0.generateFetchColumns(true);
        assertEquals(1, list2.size());
    }

    @Test
    public void test05() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBSchema.DuckDBColumn duckDBSchema_DuckDBColumn0 = new DuckDBSchema.DuckDBColumn("i0>",
                (DuckDBSchema.DuckDBCompositeDataType) null, false, false);
        List<DuckDBSchema.DuckDBColumn> list0 = List.of(duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0);
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("double precision", list0,
                false);
        List<DuckDBSchema.DuckDBTable> list1 = List.of(duckDBSchema_DuckDBTable0, duckDBSchema_DuckDBTable0,
                duckDBSchema_DuckDBTable0);
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                list1);
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        duckDBExpressionGenerator1.generateColumn();
        List<DuckDBJoin> list2 = duckDBExpressionGenerator1.getRandomJoinClauses();
        assertFalse(list2.isEmpty());
    }

    @Test
    public void test06() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0
                    .setTablesAndColumns((AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateOrderBys();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBSchema.DuckDBColumn duckDBSchema_DuckDBColumn0 = new DuckDBSchema.DuckDBColumn("i0>",
                (DuckDBSchema.DuckDBCompositeDataType) null, false, false);
        List<DuckDBSchema.DuckDBColumn> list0 = List.of(duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0);
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("double precision", list0,
                false);
        List<DuckDBSchema.DuckDBTable> list1 = List.of(duckDBSchema_DuckDBTable0, duckDBSchema_DuckDBTable0,
                duckDBSchema_DuckDBTable0);
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                list1);
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        List<DuckDBExpression> list2 = duckDBSelect0.getOrderByClauses();
        duckDBSelect0.setFromTables(list2);
        // Undeclared exception!
        duckDBExpressionGenerator1.generateOptimizedQueryString(duckDBSelect0, (DuckDBExpression) duckDBSelect0, false);
    }

    @Test
    public void test09() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        LinkedList<DuckDBSchema.DuckDBTable> linkedList0 = new LinkedList<DuckDBSchema.DuckDBTable>();
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                linkedList0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        // Undeclared exception!
        try {
            duckDBExpressionGenerator1.generateOptimizedQueryString(duckDBSelect0, (DuckDBExpression) duckDBSelect0,
                    false);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        LinkedList<DuckDBSchema.DuckDBColumn> linkedList0 = new LinkedList<DuckDBSchema.DuckDBColumn>();
        duckDBExpressionGenerator0.setColumns((List<DuckDBSchema.DuckDBColumn>) linkedList0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateFetchColumns(false);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // [] 1
            //
        }
    }

    @Test
    public void test11() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateExpression(287);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        LinkedList<DuckDBSchema.DuckDBTable> linkedList0 = new LinkedList<DuckDBSchema.DuckDBTable>();
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                linkedList0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator1.generateColumn();
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test13() throws Throwable {
        DuckDBExpressionGenerator.DuckDBAggregateFunction duckDBExpressionGenerator_DuckDBAggregateFunction0 = DuckDBExpressionGenerator.DuckDBAggregateFunction
                .getRandom();
        assertEquals(DuckDBExpressionGenerator.DuckDBAggregateFunction.MAX,
                duckDBExpressionGenerator_DuckDBAggregateFunction0);
    }

    @Test
    public void test14() throws Throwable {
        DuckDBExpressionGenerator.DuckDBAggregateFunction duckDBExpressionGenerator_DuckDBAggregateFunction0 = DuckDBExpressionGenerator.DuckDBAggregateFunction.STRING_AGG;
        int int0 = duckDBExpressionGenerator_DuckDBAggregateFunction0.getNrArgs();
        assertEquals(1, int0);
    }

    @Test
    public void test15() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBExpressionGenerator.DuckDBAggregateFunction duckDBExpressionGenerator_DuckDBAggregateFunction0 = DuckDBExpressionGenerator.DuckDBAggregateFunction.AVG;
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateArgsForAggregate(duckDBExpressionGenerator_DuckDBAggregateFunction0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test16() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateFetchColumns(false);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.Randomly", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBSchema.DuckDBColumn duckDBSchema_DuckDBColumn0 = new DuckDBSchema.DuckDBColumn("i0>",
                (DuckDBSchema.DuckDBCompositeDataType) null, false, false);
        List<DuckDBSchema.DuckDBColumn> list0 = List.of(duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0);
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("double precision", list0,
                false);
        duckDBSchema_DuckDBTable0.getRandomColumn();
        List<DuckDBSchema.DuckDBTable> list1 = List.of(duckDBSchema_DuckDBTable0, duckDBSchema_DuckDBTable0,
                duckDBSchema_DuckDBTable0);
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                list1);
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        // Undeclared exception!
        try {
            duckDBExpressionGenerator1.generateOptimizedQueryString(duckDBSelect0, (DuckDBExpression) duckDBSelect0,
                    false);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test18() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBSchema.DuckDBColumn duckDBSchema_DuckDBColumn0 = new DuckDBSchema.DuckDBColumn("i0>",
                (DuckDBSchema.DuckDBCompositeDataType) null, false, false);
        List<DuckDBSchema.DuckDBColumn> list0 = List.of(duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0,
                duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0, duckDBSchema_DuckDBColumn0);
        DuckDBSchema.DuckDBTable duckDBSchema_DuckDBTable0 = new DuckDBSchema.DuckDBTable("double precision", list0,
                false);
        List<DuckDBSchema.DuckDBTable> list1 = List.of(duckDBSchema_DuckDBTable0, duckDBSchema_DuckDBTable0,
                duckDBSchema_DuckDBTable0);
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                list1);
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        // Undeclared exception!
        try {
            duckDBExpressionGenerator1.generateOptimizedQueryString(duckDBSelect0, (DuckDBExpression) duckDBSelect0,
                    false);
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
        DuckDBExpressionGenerator.DBFunction duckDBExpressionGenerator_DBFunction0 = DuckDBExpressionGenerator.DBFunction.CONCAT;
        int int0 = duckDBExpressionGenerator_DBFunction0.getNrArgs();
        assertEquals(1, int0);
    }

    @Test
    public void test20() throws Throwable {
        DuckDBExpressionGenerator.DBFunction duckDBExpressionGenerator_DBFunction0 = DuckDBExpressionGenerator.DBFunction.CBRT;
        int int0 = duckDBExpressionGenerator_DBFunction0.getNrArgs();
        assertEquals(1, int0);
    }

    @Test
    public void test21() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test22() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateLeafNode();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test23() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test24() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test25() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBSchema.DuckDBCompositeDataType.getRandomWithoutNull();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateLeafNode();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test26() throws Throwable {
        DuckDBExpressionGenerator.DuckDBCollate.getRandom();
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBConstant.DuckDBNullConstant duckDBConstant_DuckDBNullConstant0 = (DuckDBConstant.DuckDBNullConstant) duckDBExpressionGenerator0
                .generateConstant();
        assertEquals("NULL", duckDBConstant_DuckDBNullConstant0.toString());
    }

    @Test
    public void test27() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateConstant();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test28() throws Throwable {
        BinaryOperatorNode.Operator binaryOperatorNode_Operator0 = DuckDBExpressionGenerator.DuckDBBinaryLogicalOperator
                .getRandom();
        assertEquals(DuckDBExpressionGenerator.DuckDBBinaryLogicalOperator.AND, binaryOperatorNode_Operator0);
    }

    @Test
    public void test29() throws Throwable {
        DuckDBExpressionGenerator.DuckDBBinaryLogicalOperator duckDBExpressionGenerator_DuckDBBinaryLogicalOperator0 = DuckDBExpressionGenerator.DuckDBBinaryLogicalOperator.OR;
        String string0 = duckDBExpressionGenerator_DuckDBBinaryLogicalOperator0.getTextRepresentation();
        assertEquals("OR", string0);
    }

    @Test
    public void test30() throws Throwable {
        DuckDBExpressionGenerator.DuckDBCollate duckDBExpressionGenerator_DuckDBCollate0 = DuckDBExpressionGenerator.DuckDBCollate
                .getRandom();
        String string0 = duckDBExpressionGenerator_DuckDBCollate0.getTextRepresentation();
        assertEquals("COLLATE NOCASE", string0);
    }

    @Test
    public void test31() throws Throwable {
        BinaryOperatorNode.Operator binaryOperatorNode_Operator0 = DuckDBExpressionGenerator.DuckDBBinaryArithmeticOperator
                .getRandom();
        assertEquals("||", binaryOperatorNode_Operator0.getTextRepresentation());
    }

    @Test
    public void test32() throws Throwable {
        DuckDBExpressionGenerator.DuckDBBinaryArithmeticOperator duckDBExpressionGenerator_DuckDBBinaryArithmeticOperator0 = DuckDBExpressionGenerator.DuckDBBinaryArithmeticOperator.DIV;
        String string0 = duckDBExpressionGenerator_DuckDBBinaryArithmeticOperator0.getTextRepresentation();
        assertEquals("/", string0);
    }

    @Test
    public void test33() throws Throwable {
        DuckDBExpressionGenerator.DuckDBBinaryComparisonOperator duckDBExpressionGenerator_DuckDBBinaryComparisonOperator0 = DuckDBExpressionGenerator.DuckDBBinaryComparisonOperator.EQUALS;
        String string0 = duckDBExpressionGenerator_DuckDBBinaryComparisonOperator0.getTextRepresentation();
        assertEquals("=", string0);
    }

    @Test
    public void test34() throws Throwable {
        BinaryOperatorNode.Operator binaryOperatorNode_Operator0 = DuckDBExpressionGenerator.DuckDBBinaryComparisonOperator
                .getRandom();
        assertEquals(DuckDBExpressionGenerator.DuckDBBinaryComparisonOperator.EQUALS, binaryOperatorNode_Operator0);
    }

    @Test
    public void test35() throws Throwable {
        DuckDBExpressionGenerator.DuckDBUnaryPostfixOperator duckDBExpressionGenerator_DuckDBUnaryPostfixOperator0 = DuckDBExpressionGenerator.DuckDBUnaryPostfixOperator
                .getRandom();
        assertEquals("IS NULL", duckDBExpressionGenerator_DuckDBUnaryPostfixOperator0.getTextRepresentation());
    }

    @Test
    public void test36() throws Throwable {
        DuckDBExpressionGenerator.DuckDBUnaryPostfixOperator duckDBExpressionGenerator_DuckDBUnaryPostfixOperator0 = DuckDBExpressionGenerator.DuckDBUnaryPostfixOperator.IS_NOT_NULL;
        String string0 = duckDBExpressionGenerator_DuckDBUnaryPostfixOperator0.getTextRepresentation();
        assertEquals("IS NOT NULL", string0);
    }

    @Test
    public void test37() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBSelect duckDBSelect0 = duckDBExpressionGenerator0.generateSelect();
        DuckDBConstant.DuckDBNullConstant duckDBConstant_DuckDBNullConstant0 = new DuckDBConstant.DuckDBNullConstant();
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateUnoptimizedQueryString(duckDBSelect0,
                    (DuckDBExpression) duckDBConstant_DuckDBNullConstant0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test38() throws Throwable {
        DuckDBExpressionGenerator.DuckDBUnaryPrefixOperator duckDBExpressionGenerator_DuckDBUnaryPrefixOperator0 = DuckDBExpressionGenerator.DuckDBUnaryPrefixOperator
                .getRandom();
        String string0 = duckDBExpressionGenerator_DuckDBUnaryPrefixOperator0.getTextRepresentation();
        assertEquals("NOT", string0);
    }

    @Test
    public void test39() throws Throwable {
        DuckDBExpressionGenerator.DBFunction duckDBExpressionGenerator_DBFunction0 = DuckDBExpressionGenerator.DBFunction
                .getRandom();
        assertEquals(DuckDBExpressionGenerator.DBFunction.ACOS, duckDBExpressionGenerator_DBFunction0);
    }

    @Test
    public void test40() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateColumn();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.Randomly", e);
        }
    }

    @Test
    public void test41() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.getRandomJoinClauses();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test42() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateUnoptimizedQueryString((DuckDBSelect) null, (DuckDBExpression) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.DuckDBToStringVisitor", e);
        }
    }

    @Test
    public void test43() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        DuckDBExpression duckDBExpression0 = duckDBExpressionGenerator0.isNull((DuckDBExpression) duckDBSelect0);
        assertNotNull(duckDBExpression0);
    }

    @Test
    public void test44() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        LinkedList<DuckDBSchema.DuckDBTable> linkedList0 = new LinkedList<DuckDBSchema.DuckDBTable>();
        AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn> abstractTables0 = new AbstractTables<DuckDBSchema.DuckDBTable, DuckDBSchema.DuckDBColumn>(
                linkedList0);
        DuckDBExpressionGenerator duckDBExpressionGenerator1 = duckDBExpressionGenerator0
                .setTablesAndColumns(abstractTables0);
        DuckDBSelect duckDBSelect0 = new DuckDBSelect();
        // Undeclared exception!
        try {
            duckDBExpressionGenerator1.generateOptimizedQueryString(duckDBSelect0, (DuckDBExpression) duckDBSelect0,
                    true);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.ast.SelectBase", e);
        }
    }

    @Test
    public void test45() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateBooleanExpression();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test46() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.generateAggregate();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }

    @Test
    public void test47() throws Throwable {
        DuckDBProvider.DuckDBGlobalState duckDBProvider_DuckDBGlobalState0 = new DuckDBProvider.DuckDBGlobalState();
        DuckDBExpressionGenerator duckDBExpressionGenerator0 = new DuckDBExpressionGenerator(
                duckDBProvider_DuckDBGlobalState0);
        // Undeclared exception!
        try {
            duckDBExpressionGenerator0.getTableRefs();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.duckdb.gen.DuckDBExpressionGenerator", e);
        }
    }
}
