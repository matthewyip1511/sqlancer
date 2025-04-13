/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:11:56 GMT 2025
 */

package sqlancer.evosuite.sqlite3.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.Randomly;
import sqlancer.sqlite3.ast.SQLite3Constant;
import sqlancer.sqlite3.ast.SQLite3Expression;
import sqlancer.sqlite3.ast.SQLite3InOperation;
import sqlancer.sqlite3.ast.SQLite3WindowFunctionExpression;

public class SQLite3WindowFunctionExpression_ESTest {

    @Test
    public void test00() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.EXPR_FOLLOWING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1);
        assertNull(sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0.getExplicitCollateSequence());
    }

    @Test
    public void test01() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.CURRENT_ROW;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0.getExplicitCollateSequence();
    }

    @Test
    public void test02() throws Throwable {
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createBinaryConstant("");
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3Constant0);
        sQLite3WindowFunctionExpression0.setPartitionBy((List<SQLite3Expression>) null);
        List<SQLite3Expression> list0 = sQLite3WindowFunctionExpression0.getPartitionBy();
        assertNull(list0);
    }

    @Test
    public void test03() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        sQLite3WindowFunctionExpression0.setOrderBy((List<SQLite3Expression>) null);
        List<SQLite3Expression> list0 = sQLite3WindowFunctionExpression0.getOrderBy();
        assertNull(list0);
    }

    @Test
    public void test04() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.UNBOUNDED_FOLLOWING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0);
        SQLite3WindowFunctionExpression.SQLite3FrameSpecKind sQLite3WindowFunctionExpression_SQLite3FrameSpecKind0 = SQLite3WindowFunctionExpression.SQLite3FrameSpecKind.ROWS;
        sQLite3WindowFunctionExpression0.setFrameSpecKind(sQLite3WindowFunctionExpression_SQLite3FrameSpecKind0);
        SQLite3WindowFunctionExpression.SQLite3FrameSpecKind sQLite3WindowFunctionExpression_SQLite3FrameSpecKind1 = sQLite3WindowFunctionExpression0
                .getFrameSpecKind();
        assertSame(sQLite3WindowFunctionExpression_SQLite3FrameSpecKind1,
                sQLite3WindowFunctionExpression_SQLite3FrameSpecKind0);
    }

    @Test
    public void test05() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.CURRENT_ROW;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        sQLite3WindowFunctionExpression0
                .setFrameSpec(sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1 = (SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm) sQLite3WindowFunctionExpression0
                .getFrameSpec();
        assertEquals(
                SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.CURRENT_ROW,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1.getKind());
    }

    @Test
    public void test06() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.UNBOUNDED_FOLLOWING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude0 = SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude.EXCLUDE_GROUP;
        sQLite3WindowFunctionExpression0.setExclude(sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude0);
        SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude1 = sQLite3WindowFunctionExpression0
                .getExclude();
        assertEquals("EXCLUDE GROUP", sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude1.getString());
    }

    @Test
    public void test07() throws Throwable {
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createBinaryConstant("");
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3Constant0);
        SQLite3Constant.SQLite3BinaryConstant sQLite3Constant_SQLite3BinaryConstant0 = (SQLite3Constant.SQLite3BinaryConstant) sQLite3WindowFunctionExpression0
                .getBaseWindowFunction();
        assertFalse(sQLite3Constant_SQLite3BinaryConstant0.isNull());
    }

    @Test
    public void test08() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.UNBOUNDED_FOLLOWING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        List<SQLite3Expression> list0 = sQLite3WindowFunctionExpression0.getOrderBy();
        SQLite3InOperation sQLite3Expression_InOperation0 = new SQLite3InOperation(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0, list0);
        sQLite3Expression_InOperation0.getExplicitCollateSequence();
    }

    @Test
    public void test09() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.UNBOUNDED_FOLLOWING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind1 = sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0
                .getKind();
        assertEquals(
                SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.UNBOUNDED_FOLLOWING,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind1);
    }

    @Test
    public void test10() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.EXPR_FOLLOWING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3Expression sQLite3Expression0 = sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0
                .getExpression();
        assertNull(sQLite3Expression0);
    }

    @Test
    public void test11() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        sQLite3WindowFunctionExpression0.getFrameSpecKind();
    }

    @Test
    public void test12() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        sQLite3WindowFunctionExpression0.getExclude();
    }

    @Test
    public void test13() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[2];
        List<SQLite3Expression> list0 = Randomly.nonEmptySubset(sQLite3ExpressionArray0);
        sQLite3WindowFunctionExpression0.setPartitionBy(list0);
        List<SQLite3Expression> list1 = sQLite3WindowFunctionExpression0.getPartitionBy();
        assertFalse(list1.isEmpty());
    }

    @Test
    public void test14() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        SQLite3Expression sQLite3Expression0 = sQLite3WindowFunctionExpression0.getFilterClause();
        assertNull(sQLite3Expression0);
    }

    @Test
    public void test15() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        SQLite3Expression sQLite3Expression0 = sQLite3WindowFunctionExpression0.getBaseWindowFunction();
        assertNull(sQLite3Expression0);
    }

    @Test
    public void test16() throws Throwable {
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createBinaryConstant("");
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3Constant0);
        sQLite3WindowFunctionExpression0.setFilterClause(sQLite3Constant0);
        SQLite3Expression sQLite3Expression0 = sQLite3WindowFunctionExpression0.getFilterClause();
        assertSame(sQLite3Constant0, sQLite3Expression0);
    }

    @Test
    public void test17() throws Throwable {
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createIntConstant(239L);
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3Constant0);
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[3];
        List<SQLite3Expression> list0 = Randomly.nonEmptySubset(sQLite3ExpressionArray0);
        sQLite3WindowFunctionExpression0.setOrderBy(list0);
        List<SQLite3Expression> list1 = sQLite3WindowFunctionExpression0.getOrderBy();
        assertSame(list1, list0);
    }

    @Test
    public void test18() throws Throwable {
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                0.0);
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                sQLite3Constant_SQLite3RealConstant0);
        SQLite3Expression sQLite3Expression0 = sQLite3WindowFunctionExpression0.getFrameSpec();
        assertNull(sQLite3Expression0);
    }

    @Test
    public void test19() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        List<SQLite3Expression> list0 = sQLite3WindowFunctionExpression0.getPartitionBy();
        assertEquals(0, list0.size());
    }

    @Test
    public void test20() throws Throwable {
        SQLite3WindowFunctionExpression sQLite3WindowFunctionExpression0 = new SQLite3WindowFunctionExpression(
                (SQLite3Expression) null);
        sQLite3WindowFunctionExpression0.getExplicitCollateSequence();
    }

    @Test
    public void test21() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.EXPR_PRECEDING;
        String string0 = sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0
                .getString();
        assertEquals("PRECEDING", string0);
    }

    // @Test
    // public void test22() throws Throwable {
    // SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude0
    // = SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude
    // .getRandom();
    // assertEquals(SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude.EXCLUDE_NO_OTHERS,
    // sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude0);
    // }

    @Test
    public void test23() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude0 = SQLite3WindowFunctionExpression.SQLite3FrameSpecExclude.EXCLUDE_NO_OTHERS;
        String string0 = sQLite3WindowFunctionExpression_SQLite3FrameSpecExclude0.getString();
        assertEquals("EXCLUDE NO OTHERS", string0);
    }

    @Test
    public void test24() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.UNBOUNDED_FOLLOWING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1 = sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0
                .getLeft();
        assertSame(sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1);
    }

    @Test
    public void test25() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.UNBOUNDED_PRECEDING;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0.getExplicitCollateSequence();
    }

    @Test
    public void test26() throws Throwable {
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0 = SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm.SQLite3WindowFunctionFrameSpecTermKind.CURRENT_ROW;
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm_SQLite3WindowFunctionFrameSpecTermKind0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0 = new SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecBetween(
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
        SQLite3WindowFunctionExpression.SQLite3WindowFunctionFrameSpecTerm sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1 = sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecBetween0
                .getRight();
        assertSame(sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm1,
                sQLite3WindowFunctionExpression_SQLite3WindowFunctionFrameSpecTerm0);
    }

//    @Test
//    public void test27() throws Throwable {
//        SQLite3WindowFunctionExpression.SQLite3FrameSpecKind sQLite3WindowFunctionExpression_SQLite3FrameSpecKind0 = SQLite3WindowFunctionExpression.SQLite3FrameSpecKind
//                .getRandom();
//        assertEquals(SQLite3WindowFunctionExpression.SQLite3FrameSpecKind.RANGE,
//                sQLite3WindowFunctionExpression_SQLite3FrameSpecKind0);
//    }
}
