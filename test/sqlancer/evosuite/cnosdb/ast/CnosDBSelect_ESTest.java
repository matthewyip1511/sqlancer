/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:04:36 GMT 2025
 */

package sqlancer.evosuite.cnosdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import sqlancer.cnosdb.ast.CnosDBExpression;
import sqlancer.cnosdb.ast.CnosDBJoin;
import sqlancer.cnosdb.ast.CnosDBSelect;
import sqlancer.cnosdb.ast.CnosDBSimilarTo;
import sqlancer.cnosdb.CnosDBSchema;
import sqlancer.Randomly;
import sqlancer.common.ast.JoinBase;

public class CnosDBSelect_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        cnosDBSelect0.setJoinClauses((List<JoinBase<CnosDBExpression>>) null);
        List<JoinBase<CnosDBExpression>> list0 = cnosDBSelect0.getJoinClauses();
        assertNull(list0);
    }

    @Test
    public void test01() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBJoin[] cnosDBJoinArray0 = new CnosDBJoin[2];
        List<JoinBase<CnosDBExpression>> list0 = Randomly.subset(0, cnosDBJoinArray0);
        cnosDBSelect0.setJoinClauses(list0);
        List<JoinBase<CnosDBExpression>> list1 = cnosDBSelect0.getJoinClauses();
        assertEquals(0, list1.size());
    }

    @Test
    public void test02() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        // Undeclared exception!
        try {
            cnosDBSelect0.setDistinctOnClause((CnosDBExpression) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.cnosdb.ast.CnosDBSelect", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBSelect.SelectType cnosDBSelect_SelectType0 = CnosDBSelect.SelectType.DISTINCT;
        cnosDBSelect0.setSelectOption(cnosDBSelect_SelectType0);
        CnosDBSimilarTo cnosDBSimilarTo0 = new CnosDBSimilarTo(cnosDBSelect0, cnosDBSelect0);
        cnosDBSelect0.setDistinctOnClause(cnosDBSimilarTo0);
        CnosDBExpression cnosDBExpression0 = cnosDBSelect0.getDistinctOnClause();
        assertSame(cnosDBExpression0, cnosDBSimilarTo0);
    }

    @Test
    public void test04() throws Throwable {
        CnosDBSelect.SelectType cnosDBSelect_SelectType0 = CnosDBSelect.SelectType.getRandom();
        assertEquals(CnosDBSelect.SelectType.DISTINCT, cnosDBSelect_SelectType0);
    }

    @Test
    public void test05() throws Throwable {
        LinkedList<CnosDBSchema.CnosDBColumn> linkedList0 = new LinkedList<CnosDBSchema.CnosDBColumn>();
        CnosDBSchema.CnosDBTable cnosDBSchema_CnosDBTable0 = new CnosDBSchema.CnosDBTable(
                "sqlancer.clickhouse.ClickHouseOptions", linkedList0);
        CnosDBSelect.CnosDBFromTable cnosDBSelect_CnosDBFromTable0 = new CnosDBSelect.CnosDBFromTable(
                cnosDBSchema_CnosDBTable0);
        cnosDBSelect_CnosDBFromTable0.getExpressionType();
    }

    @Test
    public void test06() throws Throwable {
        LinkedList<CnosDBSchema.CnosDBColumn> linkedList0 = new LinkedList<CnosDBSchema.CnosDBColumn>();
        CnosDBSchema.CnosDBTable cnosDBSchema_CnosDBTable0 = new CnosDBSchema.CnosDBTable(
                "sqlancer.clickhouse.ClickHouseOptions", linkedList0);
        CnosDBSelect.CnosDBFromTable cnosDBSelect_CnosDBFromTable0 = new CnosDBSelect.CnosDBFromTable(
                cnosDBSchema_CnosDBTable0);
        CnosDBSchema.CnosDBTable cnosDBSchema_CnosDBTable1 = cnosDBSelect_CnosDBFromTable0.getTable();
        assertFalse(cnosDBSchema_CnosDBTable1.isView());
    }

    @Test
    public void test07() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBSelect.CnosDBSubquery cnosDBSelect_CnosDBSubquery0 = new CnosDBSelect.CnosDBSubquery(cnosDBSelect0, " q");
        cnosDBSelect_CnosDBSubquery0.getExpressionType();
    }

    @Test
    public void test08() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBSelect.CnosDBSubquery cnosDBSelect_CnosDBSubquery0 = new CnosDBSelect.CnosDBSubquery(cnosDBSelect0, " q");
        String string0 = cnosDBSelect_CnosDBSubquery0.getName();
        assertEquals(" q", string0);
    }

    @Test
    public void test09() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBSelect.CnosDBSubquery cnosDBSelect_CnosDBSubquery0 = new CnosDBSelect.CnosDBSubquery(cnosDBSelect0, " q");
        CnosDBSelect cnosDBSelect1 = cnosDBSelect_CnosDBSubquery0.getSelect();
        assertNull(cnosDBSelect1.getExpressionType());
    }

    @Test
    public void test10() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBExpression cnosDBExpression0 = cnosDBSelect0.getDistinctOnClause();
        assertNull(cnosDBExpression0);
    }

    @Test
    public void test11() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBSelect.SelectType cnosDBSelect_SelectType0 = cnosDBSelect0.getSelectOption();
        assertEquals(CnosDBSelect.SelectType.ALL, cnosDBSelect_SelectType0);
    }

    @Test
    public void test12() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBJoin[] cnosDBJoinArray0 = new CnosDBJoin[3];
        List<JoinBase<CnosDBExpression>> list0 = Randomly.nonEmptySubset(cnosDBJoinArray0);
        cnosDBSelect0.setJoinClauses(list0);
        List<JoinBase<CnosDBExpression>> list1 = cnosDBSelect0.getJoinClauses();
        assertSame(list1, list0);
    }

    @Test
    public void test13() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        cnosDBSelect0.getExpressionType();
    }

    @Test
    public void test14() throws Throwable {
        CnosDBSelect cnosDBSelect0 = new CnosDBSelect();
        CnosDBSelect.SelectType cnosDBSelect_SelectType0 = CnosDBSelect.SelectType.DISTINCT;
        cnosDBSelect0.setSelectType(cnosDBSelect_SelectType0);
        assertNull(cnosDBSelect0.getExpressionType());
    }
}
