/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:26:56 GMT 2025
 */

package sqlancer.evosuite.oceanbase.gen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.Random;
import org.junit.jupiter.api.Test;
import sqlancer.oceanbase.ast.OceanBaseSelect;
import sqlancer.oceanbase.gen.OceanBaseHintGenerator;
import sqlancer.oceanbase.OceanBaseSchema;

public class OceanBaseHintGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
        LinkedList<OceanBaseSchema.OceanBaseColumn> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseColumn>();
        LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList1 = new LinkedList<OceanBaseSchema.OceanBaseIndex>();
        OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new OceanBaseSchema.OceanBaseTable(
                "NO_NL_JOIN", linkedList0, linkedList1);
        List<OceanBaseSchema.OceanBaseTable> list0 = List.of(oceanBaseSchema_OceanBaseTable0,
                oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0);
        OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0);
        assertEquals(3, list0.size());
    }

/*
 * Test disabled because it contains mock() function calls that are not implemented
 *
 * @Test public void test01() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseColumn>(); LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList1 = new
 * LinkedList<OceanBaseSchema.OceanBaseIndex>(); OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new
 * OceanBaseSchema.OceanBaseTable( "9ft&eh({/))9<", linkedList0, linkedList1); OceanBaseSchema.OceanBaseIndex
 * oceanBaseSchema_OceanBaseIndex0 = mock(OceanBaseSchema.OceanBaseIndex.class, new ViolatedAssumptionAnswer());
 * doReturn((String) null).when(oceanBaseSchema_OceanBaseIndex0).getIndexName();
 * linkedList1.add(oceanBaseSchema_OceanBaseIndex0); List<OceanBaseSchema.OceanBaseTable> list0 =
 * List.of(oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0); OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0);
 * assertFalse(list0.isEmpty()); }
 *
 * @Test public void test02() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = mock(OceanBaseSchema.OceanBaseColumn.class, new
 * ViolatedAssumptionAnswer()); List<OceanBaseSchema.OceanBaseColumn> list0 = List.of(oceanBaseSchema_OceanBaseColumn0);
 * LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseIndex>();
 * OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new OceanBaseSchema.OceanBaseTable("c", list0,
 * linkedList0); List<OceanBaseSchema.OceanBaseTable> list1 = List.of(oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * list1); assertEquals(OceanBaseSelect.SelectType.ALL, oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test03() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = mock(OceanBaseSchema.OceanBaseColumn.class, new
 * ViolatedAssumptionAnswer()); List<OceanBaseSchema.OceanBaseColumn> list0 = List.of(oceanBaseSchema_OceanBaseColumn0);
 * OceanBaseSchema.OceanBaseIndex oceanBaseSchema_OceanBaseIndex0 = mock(OceanBaseSchema.OceanBaseIndex.class, new
 * ViolatedAssumptionAnswer()); OceanBaseSchema.OceanBaseIndex oceanBaseSchema_OceanBaseIndex1 =
 * mock(OceanBaseSchema.OceanBaseIndex.class, new ViolatedAssumptionAnswer()); OceanBaseSchema.OceanBaseIndex
 * oceanBaseSchema_OceanBaseIndex2 = mock(OceanBaseSchema.OceanBaseIndex.class, new ViolatedAssumptionAnswer());
 * List<OceanBaseSchema.OceanBaseIndex> list1 = List.of(oceanBaseSchema_OceanBaseIndex0,
 * oceanBaseSchema_OceanBaseIndex0, oceanBaseSchema_OceanBaseIndex1, oceanBaseSchema_OceanBaseIndex1,
 * oceanBaseSchema_OceanBaseIndex1, oceanBaseSchema_OceanBaseIndex1, oceanBaseSchema_OceanBaseIndex1,
 * oceanBaseSchema_OceanBaseIndex0, oceanBaseSchema_OceanBaseIndex2); OceanBaseSchema.OceanBaseTable
 * oceanBaseSchema_OceanBaseTable0 = new OceanBaseSchema.OceanBaseTable(")", list0, list1);
 * List<OceanBaseSchema.OceanBaseTable> list2 = List.of(oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * list2); OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list2); assertEquals(8, list2.size()); }
 *
 * @Test public void test04() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseColumn>(); LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList1 = new
 * LinkedList<OceanBaseSchema.OceanBaseIndex>(); OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new
 * OceanBaseSchema.OceanBaseTable( "sqlancer.oceanbase.ast.OceanBaseComputableFunction", linkedList0, linkedList1);
 * List<OceanBaseSchema.OceanBaseTable> list0 = List.of(oceanBaseSchema_OceanBaseTable0);
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0); assertFalse(list0.isEmpty()); }
 *
 * @Test public void test05() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = mock(OceanBaseSchema.OceanBaseColumn.class, new
 * ViolatedAssumptionAnswer()); List<OceanBaseSchema.OceanBaseColumn> list0 = List.of(oceanBaseSchema_OceanBaseColumn0);
 * LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseIndex>();
 * OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new OceanBaseSchema.OceanBaseTable("c", list0,
 * linkedList0); List<OceanBaseSchema.OceanBaseTable> list1 = List.of(oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0); OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list1);
 * LinkedList<OceanBaseSchema.OceanBaseTable> linkedList1 = new LinkedList<OceanBaseSchema.OceanBaseTable>();
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, linkedList1);
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, linkedList1);
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list1); assertEquals(OceanBaseSelect.SelectType.ALL,
 * oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test06() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseTable>();
 * linkedList0); fail("Expecting exception: IndexOutOfBoundsException");
 *
 * } catch (IndexOutOfBoundsException e) { // // Index: 0, Size: 0 // verifyException("java.util.LinkedList", e); } }
 *
 * @Test public void test07() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0);
 * fail("Expecting exception: ArrayIndexOutOfBoundsException");
 *
 * } catch (ArrayIndexOutOfBoundsException e) { // // no message in exception (getMessage() returned null) // } }
 *
 * @Test public void test08() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * OceanBaseSchema.OceanBaseColumn oceanBaseSchema_OceanBaseColumn0 = mock(OceanBaseSchema.OceanBaseColumn.class, new
 * ViolatedAssumptionAnswer()); List<OceanBaseSchema.OceanBaseColumn> list0 = List.of(oceanBaseSchema_OceanBaseColumn0);
 * LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseIndex>();
 * OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new OceanBaseSchema.OceanBaseTable("c", list0,
 * linkedList0); List<OceanBaseSchema.OceanBaseTable> list1 = List.of(oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0); OceanBaseHintGenerator oceanBaseHintGenerator0 = new
 * OceanBaseHintGenerator(oceanBaseSelect0, list1); }
 *
 * @Test public void test09() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseColumn>(); LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList1 = new
 * LinkedList<OceanBaseSchema.OceanBaseIndex>(); OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new
 * OceanBaseSchema.OceanBaseTable("t%d", linkedList0, linkedList1); linkedList1.add((OceanBaseSchema.OceanBaseIndex)
 * null); List<OceanBaseSchema.OceanBaseTable> list0 = List.of(oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0); // Undeclared exception! try {
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0); fail("Expecting exception: NullPointerException");
 *
 * } catch (NullPointerException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.oceanbase.gen.OceanBaseHintGenerator", e); } }
 *
 * @Test public void test10() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable>(); OceanBaseHintGenerator.generateHints(oceanBaseSelect0, linkedList0);
 * assertEquals(OceanBaseSelect.SelectType.ALL, oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test11() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable>(); OceanBaseHintGenerator.generateHints(oceanBaseSelect0, linkedList0);
 * assertEquals(OceanBaseSelect.SelectType.ALL, oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test12() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseTable>();
 * linkedList0); fail("Expecting exception: AssertionError");
 *
 * } catch (AssertionError e) { // // [] 1 // } }
 *
 * @Test public void test13() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * (List<OceanBaseSchema.OceanBaseTable>) null); assertEquals(OceanBaseSelect.SelectType.ALL,
 * oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test14() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseColumn>(); LinkedList<OceanBaseSchema.OceanBaseIndex> linkedList1 = new
 * LinkedList<OceanBaseSchema.OceanBaseIndex>(); OceanBaseSchema.OceanBaseTable oceanBaseSchema_OceanBaseTable0 = new
 * OceanBaseSchema.OceanBaseTable("t%d", linkedList0, linkedList1); List<OceanBaseSchema.OceanBaseTable> list0 =
 * List.of(oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0,
 * oceanBaseSchema_OceanBaseTable0, oceanBaseSchema_OceanBaseTable0); // Undeclared exception! try {
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0); fail("Expecting exception: RuntimeException");
 *
 * } catch (RuntimeException e) { // // no message in exception (getMessage() returned null) //
 * verifyException("sqlancer.oceanbase.gen.OceanBaseHintGenerator", e); } }
 *
 * @Test public void test15() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseTable>();
 * assertEquals(OceanBaseSelect.SelectType.ALL, oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test16() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * (List<OceanBaseSchema.OceanBaseTable>) null); assertEquals(OceanBaseSelect.SelectType.ALL,
 * oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test17() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable> linkedList0 = new LinkedList<OceanBaseSchema.OceanBaseTable>();
 * assertEquals(OceanBaseSelect.SelectType.ALL, oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test18() throws Throwable { List<OceanBaseSchema.OceanBaseTable> list0 = List.of();
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0); assertEquals(OceanBaseSelect.SelectType.ALL,
 * oceanBaseSelect0.getFromOptions()); }
 *
 * @Test public void test19() throws Throwable { List<OceanBaseSchema.OceanBaseTable> list0 = List.of();
 * OceanBaseHintGenerator.generateHints(oceanBaseSelect0, list0); assertEquals(0, list0.size()); }
 *
 * @Test public void test20() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable>(); OceanBaseHintGenerator.generateHints(oceanBaseSelect0, linkedList0);
 * assertEquals(0, linkedList0.size()); }
 *
 * @Test public void test21() throws Throwable { OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
 * LinkedList<OceanBaseSchema.OceanBaseTable>(); OceanBaseHintGenerator.generateHints(oceanBaseSelect0, linkedList0);
 * assertEquals(0, linkedList0.size()); } }
 */
