/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 21:41:05 GMT 2025
 */

package sqlancer.evosuite.mysql.ast;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.Random;
import org.junit.jupiter.api.Test;
import sqlancer.mysql.ast.MySQLColumnReference;
import sqlancer.mysql.ast.MySQLComputableFunction;
import sqlancer.mysql.ast.MySQLConstant;
import sqlancer.mysql.ast.MySQLExpression;
import sqlancer.mysql.ast.MySQLJoin;
import sqlancer.mysql.MySQLGlobalState;
import sqlancer.mysql.MySQLSchema;

public class MySQLJoin_ESTest {

    private void verifyException(String s, Exception e) {
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test00() throws Throwable { LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new
     * LinkedList<MySQLSchema.MySQLColumn>(); MySQLSchema.MySQLIndex mySQLSchema_MySQLIndex0 =
     * mock(MySQLSchema.MySQLIndex.class, new ViolatedAssumptionAnswer()); List<MySQLSchema.MySQLIndex> list0 =
     * List.of(mySQLSchema_MySQLIndex0, mySQLSchema_MySQLIndex0, mySQLSchema_MySQLIndex0);
     * MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 =
     * MySQLSchema.MySQLTable.MySQLEngine.INNO_DB; MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new
     * MySQLSchema.MySQLTable("Vsy%Cz_2R52<", linkedList0, list0, mySQLSchema_MySQLTable_MySQLEngine0);
     * MySQLSchema.MySQLDataType mySQLSchema_MySQLDataType0 = MySQLSchema.MySQLDataType.FLOAT; MySQLSchema.MySQLColumn
     * mySQLSchema_MySQLColumn0 = new MySQLSchema.MySQLColumn("", mySQLSchema_MySQLDataType0, false, 1976931652);
     * MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant(1976931652,
     * false); MySQLColumnReference mySQLColumnReference0 = new MySQLColumnReference(mySQLSchema_MySQLColumn0,
     * mySQLConstant_MySQLIntConstant0); MySQLJoin.JoinType mySQLJoin_JoinType0 = MySQLJoin.JoinType.INNER; MySQLJoin
     * mySQLJoin0 = new MySQLJoin(mySQLSchema_MySQLTable0, mySQLColumnReference0, mySQLJoin_JoinType0);
     * MySQLSchema.MySQLTable mySQLSchema_MySQLTable1 = mySQLJoin0.getTable();
     * assertEquals(MySQLSchema.MySQLTable.MySQLEngine.INNO_DB, mySQLSchema_MySQLTable1.getEngine()); }
     */

    @Test
    public void test01() throws Throwable {
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.HEAP;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("LU", linkedList0, linkedList1,
                mySQLSchema_MySQLTable_MySQLEngine0);
        MySQLConstant mySQLConstant0 = MySQLConstant.createIntConstant((-1816L));
        MySQLJoin.JoinType mySQLJoin_JoinType0 = MySQLJoin.JoinType.INNER;
        MySQLJoin mySQLJoin0 = new MySQLJoin(mySQLSchema_MySQLTable0, mySQLConstant0, mySQLJoin_JoinType0);
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable1 = mySQLJoin0.getTable();
        assertFalse(mySQLSchema_MySQLTable1.isView());
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test02() throws Throwable { LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new
     * LinkedList<MySQLSchema.MySQLColumn>(); MySQLSchema.MySQLIndex mySQLSchema_MySQLIndex0 =
     * mock(MySQLSchema.MySQLIndex.class, new ViolatedAssumptionAnswer()); List<MySQLSchema.MySQLIndex> list0 =
     * List.of(mySQLSchema_MySQLIndex0, mySQLSchema_MySQLIndex0, mySQLSchema_MySQLIndex0);
     * MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 =
     * MySQLSchema.MySQLTable.MySQLEngine.MY_ISAM; MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new
     * MySQLSchema.MySQLTable("S'Si", linkedList0, list0, mySQLSchema_MySQLTable_MySQLEngine0); MySQLJoin.JoinType
     * mySQLJoin_JoinType0 = MySQLJoin.JoinType.STRAIGHT; MySQLJoin mySQLJoin0 = new MySQLJoin(mySQLSchema_MySQLTable0,
     * (MySQLExpression) null, mySQLJoin_JoinType0); MySQLExpression mySQLExpression0 = mySQLJoin0.getOnClause();
     * assertNull(mySQLExpression0); }
     */

    @Test
    public void test03() throws Throwable {
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.CSV;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable((String) null, linkedList0,
                linkedList1, mySQLSchema_MySQLTable_MySQLEngine0);
        MySQLSchema.MySQLTable[] mySQLSchema_MySQLTableArray0 = new MySQLSchema.MySQLTable[6];
        mySQLSchema_MySQLTableArray0[0] = mySQLSchema_MySQLTable0;
        mySQLSchema_MySQLTableArray0[1] = mySQLSchema_MySQLTable0;
        mySQLSchema_MySQLTableArray0[2] = mySQLSchema_MySQLTable0;
        mySQLSchema_MySQLTableArray0[3] = mySQLSchema_MySQLTable0;
        mySQLSchema_MySQLTableArray0[4] = mySQLSchema_MySQLTable0;
        mySQLSchema_MySQLTableArray0[5] = mySQLSchema_MySQLTableArray0[2];
        List<MySQLSchema.MySQLTable> list0 = List.of(mySQLSchema_MySQLTableArray0);
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        // Undeclared exception!
        try {
            MySQLJoin.getRandomJoinClauses(list0, mySQLGlobalState0);
            fail("Expecting exception: UnsupportedOperationException");

        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.ImmutableCollections", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        MySQLJoin mySQLJoin0 = null;
        try {
            mySQLJoin0 = new MySQLJoin((MySQLJoin) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLJoin", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        linkedList0.add((MySQLSchema.MySQLTable) null);
        linkedList0.addLast((MySQLSchema.MySQLTable) null);
        linkedList0.addLast((MySQLSchema.MySQLTable) null);
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        // Undeclared exception!
        try {
            MySQLJoin.getRandomJoinClauses(linkedList0, mySQLGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.ast.MySQLJoin", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        LinkedList<MySQLSchema.MySQLColumn> linkedList1 = new LinkedList<MySQLSchema.MySQLColumn>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.FEDERATED;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("", linkedList1,
                (List<MySQLSchema.MySQLIndex>) null, mySQLSchema_MySQLTable_MySQLEngine0);
        linkedList0.addLast(mySQLSchema_MySQLTable0);
        linkedList0.addLast(mySQLSchema_MySQLTable0);
        MySQLGlobalState mySQLGlobalState0 = new MySQLGlobalState();
        MySQLJoin.getRandomJoinClauses(linkedList0, mySQLGlobalState0);
        // Undeclared exception!
        try {
            MySQLJoin.getRandomJoinClauses(linkedList0, mySQLGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.mysql.gen.MySQLExpressionGenerator", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        LinkedList<MySQLSchema.MySQLTable> linkedList0 = new LinkedList<MySQLSchema.MySQLTable>();
        List<MySQLJoin> list0 = MySQLJoin.getRandomJoinClauses(linkedList0, (MySQLGlobalState) null);
        assertEquals(0, list0.size());
    }

    @Test
    public void test08() throws Throwable {
        LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new LinkedList<MySQLSchema.MySQLColumn>();
        LinkedList<MySQLSchema.MySQLIndex> linkedList1 = new LinkedList<MySQLSchema.MySQLIndex>();
        MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 = MySQLSchema.MySQLTable.MySQLEngine.CSV;
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new MySQLSchema.MySQLTable("PRIMARY", linkedList0, linkedList1,
                mySQLSchema_MySQLTable_MySQLEngine0);
        MySQLComputableFunction.MySQLFunction mySQLComputableFunction_MySQLFunction0 = MySQLComputableFunction.MySQLFunction.IFNULL;
        MySQLExpression[] mySQLExpressionArray0 = new MySQLExpression[2];
        MySQLComputableFunction mySQLComputableFunction0 = new MySQLComputableFunction(
                mySQLComputableFunction_MySQLFunction0, mySQLExpressionArray0);
        MySQLJoin.JoinType mySQLJoin_JoinType0 = MySQLJoin.JoinType.LEFT;
        MySQLJoin mySQLJoin0 = new MySQLJoin(mySQLSchema_MySQLTable0, mySQLComputableFunction0, mySQLJoin_JoinType0);
        MySQLExpression mySQLExpression0 = mySQLJoin0.getOnClause();
        assertSame(mySQLComputableFunction0, mySQLExpression0);
    }

    @Test
    public void test09() throws Throwable {
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                0.0);
        MySQLJoin.JoinType mySQLJoin_JoinType0 = MySQLJoin.JoinType.NATURAL;
        MySQLJoin mySQLJoin0 = new MySQLJoin((MySQLSchema.MySQLTable) null, mySQLConstant_MySQLDoubleConstant0,
                mySQLJoin_JoinType0);
        MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = mySQLJoin0.getTable();
        assertNull(mySQLSchema_MySQLTable0);
    }

    @Test
    public void test10() throws Throwable {
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant(0L, false);
        MySQLJoin.JoinType mySQLJoin_JoinType0 = MySQLJoin.JoinType.LEFT;
        MySQLJoin mySQLJoin0 = new MySQLJoin((MySQLSchema.MySQLTable) null, mySQLConstant_MySQLIntConstant0,
                mySQLJoin_JoinType0);
        mySQLJoin0.setOnClause((MySQLExpression) mySQLConstant_MySQLIntConstant0);
        assertFalse(mySQLConstant_MySQLIntConstant0.isSigned());
    }

    @Test
    public void test11() throws Throwable {
        MySQLConstant.MySQLIntConstant mySQLConstant_MySQLIntConstant0 = new MySQLConstant.MySQLIntConstant(0L, false);
        MySQLJoin.JoinType mySQLJoin_JoinType0 = MySQLJoin.JoinType.LEFT;
        MySQLJoin mySQLJoin0 = new MySQLJoin((MySQLSchema.MySQLTable) null, mySQLConstant_MySQLIntConstant0,
                mySQLJoin_JoinType0);
        mySQLJoin0.setType(mySQLJoin_JoinType0);
        assertEquals(MySQLJoin.JoinType.LEFT, mySQLJoin0.getType());
    }

    @Test
    public void test12() throws Throwable {
        MySQLConstant.MySQLDoubleConstant mySQLConstant_MySQLDoubleConstant0 = new MySQLConstant.MySQLDoubleConstant(
                0.0);
        MySQLJoin.JoinType mySQLJoin_JoinType0 = MySQLJoin.JoinType.NATURAL;
        MySQLJoin mySQLJoin0 = new MySQLJoin((MySQLSchema.MySQLTable) null, mySQLConstant_MySQLDoubleConstant0,
                mySQLJoin_JoinType0);
        MySQLJoin mySQLJoin1 = new MySQLJoin(mySQLJoin0);
        assertEquals(MySQLJoin.JoinType.NATURAL, mySQLJoin1.getType());
    }

    /*
     * Test disabled because it contains mock() function calls that are not implemented
     *
     * @Test public void test13() throws Throwable { LinkedList<MySQLSchema.MySQLColumn> linkedList0 = new
     * LinkedList<MySQLSchema.MySQLColumn>(); MySQLSchema.MySQLIndex mySQLSchema_MySQLIndex0 =
     * mock(MySQLSchema.MySQLIndex.class, new ViolatedAssumptionAnswer()); List<MySQLSchema.MySQLIndex> list0 =
     * List.of(mySQLSchema_MySQLIndex0, mySQLSchema_MySQLIndex0, mySQLSchema_MySQLIndex0);
     * MySQLSchema.MySQLTable.MySQLEngine mySQLSchema_MySQLTable_MySQLEngine0 =
     * MySQLSchema.MySQLTable.MySQLEngine.MY_ISAM; MySQLSchema.MySQLTable mySQLSchema_MySQLTable0 = new
     * MySQLSchema.MySQLTable("S'Si", linkedList0, list0, mySQLSchema_MySQLTable_MySQLEngine0); MySQLJoin.JoinType
     * mySQLJoin_JoinType0 = MySQLJoin.JoinType.STRAIGHT; MySQLJoin mySQLJoin0 = new MySQLJoin(mySQLSchema_MySQLTable0,
     * (MySQLExpression) null, mySQLJoin_JoinType0); MySQLJoin.JoinType mySQLJoin_JoinType1 = mySQLJoin0.getType();
     * assertSame(mySQLJoin_JoinType1, mySQLJoin_JoinType0); }
     */
}
