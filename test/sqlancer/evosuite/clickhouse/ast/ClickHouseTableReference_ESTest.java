/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:17:35 GMT 2025
 */

package sqlancer.evosuite.clickhouse.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import sqlancer.clickhouse.ast.ClickHouseColumnReference;
import sqlancer.clickhouse.ast.ClickHouseTableReference;
import sqlancer.clickhouse.ClickHouseSchema;
import sqlancer.common.schema.TableIndex;

public class ClickHouseTableReference_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                (String) null, linkedList0, linkedList1, true);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, (String) null);
        String string0 = clickHouseTableReference0.getTableName();
        assertNull(string0);
    }

    @Test
    public void test01() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable("",
                linkedList0, linkedList1, false);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, "");
        String string0 = clickHouseTableReference0.getTableName();
        assertEquals("", string0);
    }

    @Test
    public void test02() throws Throwable {
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                (ClickHouseSchema.ClickHouseTable) null, "");
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = clickHouseTableReference0.getTable();
        assertNull(clickHouseSchema_ClickHouseTable0);
    }

    @Test
    public void test03() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                "Uvy[", linkedList0, (List<TableIndex>) null, true);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, "Uvy[");
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable1 = clickHouseTableReference0.getTable();
        assertSame(clickHouseSchema_ClickHouseTable1, clickHouseSchema_ClickHouseTable0);
    }

    @Test
    public void test04() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                "MATERIALIZED VIEW", linkedList0, linkedList1, false);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, "MATERIALIZED VIEW");
        linkedList1.add((TableIndex) null);
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable1 = clickHouseTableReference0.getTable();
        assertFalse(clickHouseSchema_ClickHouseTable1.isView());
    }

//    @Test
//    public void test05() throws Throwable {
//        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = mock(
//                ClickHouseSchema.ClickHouseTable.class, new ViolatedAssumptionAnswer());
//        ClickHouseSchema.ClickHouseColumn clickHouseSchema_ClickHouseColumn0 = new ClickHouseSchema.ClickHouseColumn(
//                "nL g3\"rLf>QS4le`{", (ClickHouseSchema.ClickHouseLancerDataType) null, true, true,
//                clickHouseSchema_ClickHouseTable0);
//        List<ClickHouseSchema.ClickHouseColumn> list0 = List.of(clickHouseSchema_ClickHouseColumn0,
//                clickHouseSchema_ClickHouseColumn0, clickHouseSchema_ClickHouseColumn0,
//                clickHouseSchema_ClickHouseColumn0, clickHouseSchema_ClickHouseColumn0,
//                clickHouseSchema_ClickHouseColumn0, clickHouseSchema_ClickHouseColumn0);
//        LinkedList<TableIndex> linkedList0 = new LinkedList<TableIndex>();
//        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable1 = new ClickHouseSchema.ClickHouseTable(
//                "nL g3\"rLf>QS4le`{", list0, linkedList0, true);
//        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
//                clickHouseSchema_ClickHouseTable1, "nL g3\"rLf>QS4le`{");
//        List<ClickHouseColumnReference> list1 = clickHouseTableReference0.getColumnReferences();
//        assertFalse(list1.isEmpty());
//    }

    @Test
    public void test06() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                "Uvy[", linkedList0, (List<TableIndex>) null, true);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, (String) null);
        String string0 = clickHouseTableReference0.getAlias();
        assertNull(string0);
    }

    @Test
    public void test07() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable("",
                linkedList0, linkedList1, false);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, "");
        String string0 = clickHouseTableReference0.getAlias();
        assertEquals("", string0);
    }

    @Test
    public void test08() throws Throwable {
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                (ClickHouseSchema.ClickHouseTable) null, "");
        // Undeclared exception!
        try {
            clickHouseTableReference0.getColumnReferences();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.clickhouse.ast.ClickHouseTableReference", e);
        }
    }

    @Test
    public void test09() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                "Uvy[", linkedList0, (List<TableIndex>) null, true);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, (String) null);
        String string0 = clickHouseTableReference0.getTableName();
        assertEquals("Uvy[", string0);
    }

    @Test
    public void test10() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                "MATERIALIZED VIEW", linkedList0, linkedList1, false);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, "MATERIALIZED VIEW");
        List<ClickHouseColumnReference> list0 = clickHouseTableReference0.getColumnReferences();
        assertEquals(0, list0.size());
    }

    @Test
    public void test11() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                "Uvy[", linkedList0, (List<TableIndex>) null, true);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, "Uvy[");
        String string0 = clickHouseTableReference0.getAlias();
        assertEquals("Uvy[", string0);
    }

    @Test
    public void test12() throws Throwable {
        LinkedList<ClickHouseSchema.ClickHouseColumn> linkedList0 = new LinkedList<ClickHouseSchema.ClickHouseColumn>();
        LinkedList<TableIndex> linkedList1 = new LinkedList<TableIndex>();
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable0 = new ClickHouseSchema.ClickHouseTable(
                "MATERIALIZED VIEW", linkedList0, linkedList1, false);
        ClickHouseTableReference clickHouseTableReference0 = new ClickHouseTableReference(
                clickHouseSchema_ClickHouseTable0, "MATERIALIZED VIEW");
        ClickHouseSchema.ClickHouseTable clickHouseSchema_ClickHouseTable1 = clickHouseTableReference0.getTable();
        assertFalse(clickHouseSchema_ClickHouseTable1.hasIndexes());
    }
}
