/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 16:58:30 GMT 2025
 */

package sqlancer.evosuite.sqlite3.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.visitor.UnaryOperation;
import sqlancer.sqlite3.ast.SQLite3BetweenOperation;
import sqlancer.sqlite3.ast.SQLite3BinaryComparisonOperation;
import sqlancer.sqlite3.ast.SQLite3CollateOperation;
import sqlancer.sqlite3.ast.SQLite3ColumnName;
import sqlancer.sqlite3.ast.SQLite3Constant;
import sqlancer.sqlite3.ast.SQLite3Expression;
import sqlancer.sqlite3.ast.SQLite3Function;
import sqlancer.sqlite3.ast.SQLite3TypeAffinity;
import sqlancer.sqlite3.ast.SQLite3UnaryOperation;
import sqlancer.sqlite3.schema.SQLite3DataType;
import sqlancer.sqlite3.schema.SQLite3Schema;

public class SQLite3UnaryOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        sQLite3UnaryOperation_UnaryOperator0.getRandomOperator();
        sQLite3UnaryOperation_UnaryOperator0.getRandomOperator();
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator1 = sQLite3UnaryOperation_UnaryOperator0
                .getRandomOperator();
        SQLite3Constant.SQLite3IntConstant sQLite3Constant_SQLite3IntConstant0 = new SQLite3Constant.SQLite3IntConstant(
                1296L);
        SQLite3Constant sQLite3Constant0 = sQLite3UnaryOperation_UnaryOperator1
                .apply(sQLite3Constant_SQLite3IntConstant0);
        assertEquals((-1297L), sQLite3Constant0.asInt());
    }

    @Test
    public void test01() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3DataType sQLite3DataType0 = SQLite3DataType.TEXT;
        SQLite3Schema.SQLite3Column.SQLite3CollateSequence sQLite3Schema_SQLite3Column_SQLite3CollateSequence0 = SQLite3Schema.SQLite3Column.SQLite3CollateSequence.NOCASE;
        SQLite3Schema.SQLite3Column sQLite3Schema_SQLite3Column0 = new SQLite3Schema.SQLite3Column("", sQLite3DataType0,
                true, true, sQLite3Schema_SQLite3Column_SQLite3CollateSequence0);
        byte[] byteArray0 = new byte[7];
        SQLite3Constant.SQLite3BinaryConstant sQLite3Constant_SQLite3BinaryConstant0 = new SQLite3Constant.SQLite3BinaryConstant(
                byteArray0);
        SQLite3ColumnName sQLite3Expression_SQLite3ColumnName0 = new SQLite3ColumnName(sQLite3Schema_SQLite3Column0,
                sQLite3Constant_SQLite3BinaryConstant0);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Expression_SQLite3ColumnName0);
        SQLite3Schema.SQLite3Column.SQLite3CollateSequence sQLite3Schema_SQLite3Column_SQLite3CollateSequence1 = sQLite3UnaryOperation0
                .getImplicitCollateSequence();
        assertSame(sQLite3Schema_SQLite3Column_SQLite3CollateSequence1,
                sQLite3Schema_SQLite3Column_SQLite3CollateSequence0);
    }

    @Test
    public void test02() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                (SQLite3Expression) null);
        SQLite3Expression sQLite3Expression0 = sQLite3UnaryOperation0.getExpression();
        assertNull(sQLite3Expression0);
    }

    @Test
    public void test03() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3Function.ComputableFunction sQLite3Function_ComputableFunction0 = SQLite3Function.ComputableFunction.LIKELY;
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[1];
        SQLite3Function sQLite3Function0 = new SQLite3Function(sQLite3Function_ComputableFunction0,
                sQLite3ExpressionArray0);
        SQLite3Schema.SQLite3Column.SQLite3CollateSequence sQLite3Schema_SQLite3Column_SQLite3CollateSequence0 = SQLite3Schema.SQLite3Column.SQLite3CollateSequence.BINARY;
        SQLite3CollateOperation sQLite3Expression_CollateOperation0 = new SQLite3CollateOperation(sQLite3Function0,
                sQLite3Schema_SQLite3Column_SQLite3CollateSequence0);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Expression_CollateOperation0);
        SQLite3Schema.SQLite3Column.SQLite3CollateSequence sQLite3Schema_SQLite3Column_SQLite3CollateSequence1 = sQLite3UnaryOperation0
                .getExplicitCollateSequence();
        assertSame(sQLite3Schema_SQLite3Column_SQLite3CollateSequence1,
                sQLite3Schema_SQLite3Column_SQLite3CollateSequence0);
    }

    @Test
    public void test04() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3BinaryComparisonOperation.BinaryComparisonOperator sQLite3Expression_BinaryComparisonOperation_BinaryComparisonOperator0 = SQLite3BinaryComparisonOperation.BinaryComparisonOperator.SMALLER_EQUALS;
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                0.0);
        SQLite3TypeAffinity sQLite3Expression_TypeAffinity0 = SQLite3TypeAffinity.INTEGER;
        SQLite3Constant sQLite3Constant0 = sQLite3Expression_BinaryComparisonOperation_BinaryComparisonOperator0
                .applyOperand(sQLite3Constant_SQLite3RealConstant0, sQLite3Expression_TypeAffinity0,
                        sQLite3Constant_SQLite3RealConstant0, sQLite3Expression_TypeAffinity0,
                        sQLite3Constant_SQLite3RealConstant0, sQLite3Constant_SQLite3RealConstant0, false);
        SQLite3ColumnName sQLite3Expression_SQLite3ColumnName0 = new SQLite3ColumnName(
                (SQLite3Schema.SQLite3Column) null, sQLite3Constant0);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Expression_SQLite3ColumnName0);
        // Undeclared exception!
        try {
            sQLite3UnaryOperation0.getImplicitCollateSequence();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3Expression$SQLite3ColumnName", e);
        }
    }

    @Test
    public void test05() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NOT;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                (SQLite3Expression) null);
        // Undeclared exception!
        try {
            sQLite3UnaryOperation0.getExplicitCollateSequence();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3UnaryOperation", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createRealConstant((-9223372036854775808L));
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant0);
        // Undeclared exception!
        try {
            sQLite3UnaryOperation0.getExpectedValue();
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3Cast", e);
        }
    }

    @Test
    public void test07() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                (SQLite3Expression) null);
        // Undeclared exception!
        try {
            sQLite3UnaryOperation0.getExpectedValue();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3UnaryOperation", e);
        }
    }

    @Test
    public void test08() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NOT;
        SQLite3DataType sQLite3DataType0 = SQLite3DataType.NULL;
        SQLite3Schema.SQLite3Column.SQLite3CollateSequence sQLite3Schema_SQLite3Column_SQLite3CollateSequence0 = SQLite3Schema.SQLite3Column.SQLite3CollateSequence.NOCASE;
        SQLite3Schema.SQLite3Column sQLite3Schema_SQLite3Column0 = new SQLite3Schema.SQLite3Column((String) null,
                sQLite3DataType0, true, sQLite3Schema_SQLite3Column_SQLite3CollateSequence0, true);
        SQLite3Constant.SQLite3IntConstant sQLite3Constant_SQLite3IntConstant0 = new SQLite3Constant.SQLite3IntConstant(
                1000L);
        SQLite3ColumnName sQLite3Expression_SQLite3ColumnName0 = new SQLite3ColumnName(sQLite3Schema_SQLite3Column0,
                sQLite3Constant_SQLite3IntConstant0);
        byte[] byteArray0 = new byte[6];
        SQLite3Constant.SQLite3BinaryConstant sQLite3Constant_SQLite3BinaryConstant0 = new SQLite3Constant.SQLite3BinaryConstant(
                byteArray0);
        SQLite3BinaryComparisonOperation.BinaryComparisonOperator sQLite3Expression_BinaryComparisonOperation_BinaryComparisonOperator0 = SQLite3BinaryComparisonOperation.BinaryComparisonOperator.IS_NOT;
        SQLite3BinaryComparisonOperation sQLite3Expression_BinaryComparisonOperation0 = new SQLite3BinaryComparisonOperation(
                sQLite3Expression_SQLite3ColumnName0, sQLite3Constant_SQLite3BinaryConstant0,
                sQLite3Expression_BinaryComparisonOperation_BinaryComparisonOperator0);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Expression_BinaryComparisonOperation0);
        // Undeclared exception!
        try {
            sQLite3UnaryOperation0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null: NULL
            //
        }
    }

    @Test
    public void test09() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        SQLite3Function.ComputableFunction sQLite3Function_ComputableFunction0 = SQLite3Function.ComputableFunction.LIKELY;
        SQLite3Expression[] sQLite3ExpressionArray0 = new SQLite3Expression[0];
        SQLite3Function sQLite3Function0 = new SQLite3Function(sQLite3Function_ComputableFunction0,
                sQLite3ExpressionArray0);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Function0);
        // Undeclared exception!
        try {
            sQLite3UnaryOperation0.getExpectedValue();
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // Index 0 out of bounds for length 0
            //
            verifyException("sqlancer.sqlite3.ast.SQLite3Function$ComputableFunction$5", e);
        }
    }

    @Test
    public void test10() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        String string0 = sQLite3UnaryOperation_UnaryOperator0.getTextRepresentation();
        assertEquals("~", string0);
    }

    @Test
    public void test11() throws Throwable {
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createNullConstant();
        SQLite3ColumnName sQLite3Expression_SQLite3ColumnName0 = SQLite3ColumnName.createDummy("LD");
        SQLite3BetweenOperation sQLite3Expression_BetweenOperation0 = new SQLite3BetweenOperation(sQLite3Constant0,
                true, sQLite3Expression_SQLite3ColumnName0, sQLite3Constant0);
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Expression_BetweenOperation0);
        SQLite3Constant sQLite3Constant1 = sQLite3UnaryOperation0.getExpectedValue();
        assertNull(sQLite3Constant1);
    }

    @Test
    public void test12() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NOT;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createIntConstant(0L, true);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant0);
        SQLite3Constant sQLite3Constant1 = sQLite3UnaryOperation0.getExpectedValue();
        assertEquals(1L, sQLite3Constant1.asInt());
    }

    @Test
    public void test13() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        SQLite3Constant.SQLite3NullConstant sQLite3Constant_SQLite3NullConstant0 = new SQLite3Constant.SQLite3NullConstant();
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant_SQLite3NullConstant0);
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator1 = SQLite3UnaryOperation.UnaryOperator.NOT;
        SQLite3UnaryOperation sQLite3UnaryOperation1 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator1,
                sQLite3UnaryOperation0);
        SQLite3Constant sQLite3Constant0 = sQLite3UnaryOperation1.getExpectedValue();
        assertEquals(SQLite3DataType.NULL, sQLite3Constant0.getDataType());
    }

    @Test
    public void test14() throws Throwable {
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                0.0);
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant_SQLite3RealConstant0);
        SQLite3Constant sQLite3Constant0 = sQLite3UnaryOperation0.getExpectedValue();
        assertEquals((-1L), sQLite3Constant0.asInt());
        assertNotNull(sQLite3Constant0);
    }

    @Test
    public void test15() throws Throwable {
        SQLite3Constant.SQLite3IntConstant sQLite3Constant_SQLite3IntConstant0 = new SQLite3Constant.SQLite3IntConstant(
                (-9223372036854775808L));
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant_SQLite3IntConstant0);
        SQLite3Constant sQLite3Constant0 = sQLite3UnaryOperation0.getExpectedValue();
        assertEquals(9.223372036854776E18, sQLite3Constant0.asDouble(), 0.01);
        assertNotNull(sQLite3Constant0);
    }

    @Test
    public void test16() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createBinaryConstant("");
        SQLite3Constant sQLite3Constant1 = sQLite3UnaryOperation_UnaryOperator0.apply(sQLite3Constant0);
        assertEquals(0L, sQLite3Constant1.asInt());
    }

    @Test
    public void test17() throws Throwable {
        SQLite3Constant.SQLite3TextConstant sQLite3Constant_SQLite3TextConstant0 = new SQLite3Constant.SQLite3TextConstant(
                " hVu]-&T!}VQN\"_+");
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant sQLite3Constant0 = sQLite3UnaryOperation_UnaryOperator0
                .apply(sQLite3Constant_SQLite3TextConstant0);
        assertNull(sQLite3Constant0.getExplicitCollateSequence());
    }

    @Test
    public void test18() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant.SQLite3NullConstant sQLite3Constant_SQLite3NullConstant0 = new SQLite3Constant.SQLite3NullConstant();
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant_SQLite3NullConstant0);
        SQLite3Constant sQLite3Constant0 = sQLite3UnaryOperation0.getExpectedValue();
        assertNull(sQLite3Constant0.getExplicitCollateSequence());
    }

    @Test
    public void test19() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createRealConstant(0.0);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant0);
        SQLite3Constant sQLite3Constant1 = sQLite3UnaryOperation0.getExpectedValue();
        assertEquals(SQLite3DataType.REAL, sQLite3Constant1.getDataType());
    }

    @Test
    public void test20() throws Throwable {
        SQLite3Constant.SQLite3IntConstant sQLite3Constant_SQLite3IntConstant0 = new SQLite3Constant.SQLite3IntConstant(
                756L);
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant_SQLite3IntConstant0);
        SQLite3UnaryOperation sQLite3UnaryOperation1 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3UnaryOperation0);
        sQLite3UnaryOperation1.getImplicitCollateSequence();
    }

    @Test
    public void test21() throws Throwable {
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createNullConstant();
        SQLite3ColumnName sQLite3Expression_SQLite3ColumnName0 = SQLite3ColumnName.createDummy("LD");
        SQLite3BetweenOperation sQLite3Expression_BetweenOperation0 = new SQLite3BetweenOperation(sQLite3Constant0,
                true, sQLite3Expression_SQLite3ColumnName0, sQLite3Constant0);
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Expression_BetweenOperation0);
        sQLite3UnaryOperation0.getImplicitCollateSequence();
    }

    @Test
    public void test22() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant.SQLite3RealConstant sQLite3Constant_SQLite3RealConstant0 = new SQLite3Constant.SQLite3RealConstant(
                0.0);
        SQLite3BetweenOperation sQLite3Expression_BetweenOperation0 = new SQLite3BetweenOperation(
                sQLite3Constant_SQLite3RealConstant0, true, sQLite3Constant_SQLite3RealConstant0,
                sQLite3Constant_SQLite3RealConstant0);
        SQLite3Constant sQLite3Constant0 = sQLite3Expression_BetweenOperation0.getExpectedValue();
        assertNotNull(sQLite3Constant0);

        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant0);
        sQLite3UnaryOperation0.getImplicitCollateSequence();
        assertEquals(0L, sQLite3Constant0.asInt());
    }

    @Test
    public void test23() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createFalse();
        SQLite3Constant sQLite3Constant1 = sQLite3UnaryOperation_UnaryOperator0.apply(sQLite3Constant0);
        assertFalse(sQLite3Constant1.isHex());
    }

    @Test
    public void test24() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NOT;
        String string0 = sQLite3UnaryOperation_UnaryOperator0.toString();
        assertEquals("NOT", string0);
    }

    @Test
    public void test25() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createBoolean(false);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant0);
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator1 = sQLite3UnaryOperation0
                .getOperation();
        assertSame(sQLite3UnaryOperation_UnaryOperator1, sQLite3UnaryOperation_UnaryOperator0);
    }

    @Test
    public void test26() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.NEGATE;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                (SQLite3Expression) null);
        String string0 = sQLite3UnaryOperation0.getOperatorRepresentation();
        assertEquals("~", string0);
    }

    @Test
    public void test27() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createBoolean(false);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant0);
        SQLite3Expression sQLite3Expression0 = sQLite3UnaryOperation0.getExpression();
        assertSame(sQLite3Constant0, sQLite3Expression0);
    }

    @Test
    public void test28() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.PLUS;
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                (SQLite3Expression) null);
        UnaryOperation.OperatorKind unaryOperation_OperatorKind0 = sQLite3UnaryOperation0.getOperatorKind();
        assertEquals(UnaryOperation.OperatorKind.PREFIX, unaryOperation_OperatorKind0);
    }

    @Test
    public void test29() throws Throwable {
        SQLite3UnaryOperation.UnaryOperator sQLite3UnaryOperation_UnaryOperator0 = SQLite3UnaryOperation.UnaryOperator.MINUS;
        SQLite3Constant sQLite3Constant0 = SQLite3Constant.createIntConstant(0L, true);
        SQLite3UnaryOperation sQLite3UnaryOperation0 = new SQLite3UnaryOperation(sQLite3UnaryOperation_UnaryOperator0,
                sQLite3Constant0);
        sQLite3UnaryOperation0.getExplicitCollateSequence();
    }
}
