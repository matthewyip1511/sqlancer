/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 17:46:49 GMT 2025
 */

package sqlancer.evosuite.doris.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.doris.ast.DorisBinaryComparisonOperation;
import sqlancer.doris.ast.DorisColumnValue;
import sqlancer.doris.ast.DorisConstant;
import sqlancer.doris.DorisSchema;

public class DorisColumnValue_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("6bGc<x?AM{]",
                dorisSchema_DorisCompositeDataType0, true, false);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, (DorisConstant) null);
        DorisConstant dorisConstant0 = dorisColumnValue0.getExpectedValue();
        assertNull(dorisConstant0);
    }

    @Test
    public void test01() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn((String) null,
                dorisSchema_DorisCompositeDataType0, false, false);
        DorisConstant dorisConstant0 = DorisConstant.createStringConstant((String) null);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = dorisColumnValue0.getExpectedValue();
        assertFalse(dorisConstant1.isDate());
    }

    @Test
    public void test02() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn(".4j",
                dorisSchema_DorisCompositeDataType0, true, true);
        DorisConstant.DorisDateConstant dorisConstant_DorisDateConstant0 = new DorisConstant.DorisDateConstant(".4j");
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.INT;
        DorisConstant dorisConstant0 = dorisConstant_DorisDateConstant0.cast(dorisSchema_DorisDataType0);
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = dorisColumnValue0.getExpectedValue();
        assertFalse(dorisConstant1.isBoolean());
    }

    @Test
    public void test03() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.DATETIME;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-169));
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("mrs>{?W",
                dorisSchema_DorisCompositeDataType0, true, true);
        DorisConstant dorisConstant0 = DorisConstant.createFloatConstant((-169));
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = dorisColumnValue0.getExpectedValue();
        assertEquals("-169.0", dorisConstant1.asString());
    }

    @Test
    public void test04() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.SUM;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("",
                dorisSchema_DorisCompositeDataType0, true, true, dorisSchema_DorisColumnAggrType0, true, "INT16");
        DorisConstant dorisConstant0 = DorisConstant.createDatetimeConstant("+Bdk;JVXG)=k)");
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = dorisColumnValue0.getExpectedValue();
        assertSame(dorisConstant1, dorisConstant0);
    }

    @Test
    public void test05() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.NULL;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-562));
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.MIN;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("",
                dorisSchema_DorisCompositeDataType0, true, false, dorisSchema_DorisColumnAggrType0, true,
                "xwAd /:u.V3p]0`");
        DorisConstant dorisConstant0 = DorisConstant.createDateConstant(511L);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = dorisColumnValue0.getExpectedValue();
        assertFalse(dorisConstant1.isNull());
    }

    @Test
    public void test06() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.DATE;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-1193));
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.MAX;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("}",
                dorisSchema_DorisCompositeDataType0, true, false, dorisSchema_DorisColumnAggrType0, true, "");
        DorisBinaryComparisonOperation.DorisBinaryComparisonOperator dorisBinaryComparisonOperation_DorisBinaryComparisonOperator0 = DorisBinaryComparisonOperation.DorisBinaryComparisonOperator.LESS_EQUALS;
        DorisConstant.DorisDatetimeConstant dorisConstant_DorisDatetimeConstant0 = new DorisConstant.DorisDatetimeConstant();
        DorisConstant dorisConstant0 = dorisBinaryComparisonOperation_DorisBinaryComparisonOperator0
                .apply(dorisConstant_DorisDatetimeConstant0, dorisConstant_DorisDatetimeConstant0);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = dorisColumnValue0.getExpectedValue();
        assertTrue(dorisConstant1.isNum());
    }

    @Test
    public void test07() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.NULL;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("z",
                dorisSchema_DorisCompositeDataType0, false, false, dorisSchema_DorisColumnAggrType0, false, "");
        DorisConstant dorisConstant0 = DorisConstant.createIntConstant((-2849L));
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = dorisColumnValue0.getExpectedValue();
        assertTrue(dorisConstant1.asBoolean());
    }

    @Test
    public void test08() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.DATETIME;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-169));
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.SUM;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("mrs>{?W",
                dorisSchema_DorisCompositeDataType0, true, false, dorisSchema_DorisColumnAggrType0, false, "mrs>{?W");
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create(dorisSchema_DorisColumn0, (DorisConstant) null);
        DorisSchema.DorisDataType dorisSchema_DorisDataType1 = dorisColumnValue0.getExpectedType();
        assertSame(dorisSchema_DorisDataType0, dorisSchema_DorisDataType1);
    }

    @Test
    public void test09() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.NULL;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-562));
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.MIN;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("",
                dorisSchema_DorisCompositeDataType0, true, false, dorisSchema_DorisColumnAggrType0, true,
                "xwAd /:u.V3p]0`");
        DorisConstant dorisConstant0 = DorisConstant.createDateConstant(511L);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, dorisConstant0);
        DorisSchema.DorisDataType dorisSchema_DorisDataType1 = dorisColumnValue0.getExpectedType();
        assertSame(dorisSchema_DorisDataType0, dorisSchema_DorisDataType1);
    }

    @Test
    public void test10() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("6bGc<x?AM{]",
                dorisSchema_DorisCompositeDataType0, true, false);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, (DorisConstant) null);
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = dorisColumnValue0.getExpectedType();
        assertEquals(0, dorisSchema_DorisDataType0.getDecimalScale());
    }

    @Test
    public void test11() throws Throwable {
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create((DorisSchema.DorisColumn) null,
                (DorisConstant) null);
        // Undeclared exception!
        try {
            dorisColumnValue0.hashCode();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.ast.DorisColumnValue", e);
        }
    }

    @Test
    public void test12() throws Throwable {
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create((DorisSchema.DorisColumn) null,
                (DorisConstant) null);
        // Undeclared exception!
        try {
            dorisColumnValue0.getExpectedType();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.ast.DorisColumnValue", e);
        }
    }

    @Test
    public void test13() throws Throwable {
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create((DorisSchema.DorisColumn) null,
                (DorisConstant) null);
        DorisColumnValue dorisColumnValue1 = new DorisColumnValue((DorisSchema.DorisColumn) null, (DorisConstant) null);
        // Undeclared exception!
        try {
            dorisColumnValue1.equals(dorisColumnValue0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.ast.DorisColumnValue", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("6bGc<x?AM{]",
                dorisSchema_DorisCompositeDataType0, true, false);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, (DorisConstant) null);
        dorisColumnValue0.hashCode();
    }

    @Test
    public void test15() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.DATETIME;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-169));
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("mrs>{?W",
                dorisSchema_DorisCompositeDataType0, true, true);
        DorisConstant dorisConstant0 = DorisConstant.createFloatConstant((-169));
        DorisConstant.DorisTextConstant dorisConstant_DorisTextConstant0 = new DorisConstant.DorisTextConstant(
                "mrs>{?W");
        DorisConstant dorisConstant1 = dorisConstant_DorisTextConstant0.valueEquals(dorisConstant0);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0, dorisConstant1);
        dorisColumnValue0.hashCode();
    }

    @Test
    public void test16() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("['[m",
                dorisSchema_DorisCompositeDataType0, false, false);
        DorisConstant.DorisTextConstant dorisConstant_DorisTextConstant0 = new DorisConstant.DorisTextConstant("['[m");
        DorisSchema.DorisColumn dorisSchema_DorisColumn1 = new DorisSchema.DorisColumn((String) null,
                dorisSchema_DorisCompositeDataType0, true, false);
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn1,
                dorisConstant_DorisTextConstant0);
        DorisColumnValue dorisColumnValue1 = DorisColumnValue.create(dorisSchema_DorisColumn0,
                dorisConstant_DorisTextConstant0);
        boolean boolean0 = dorisColumnValue1.equals(dorisColumnValue0);
        assertFalse(boolean0);
    }

    @Test
    public void test17() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.FLOAT;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-1));
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.BITMAP_UNION;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn(":/q",
                dorisSchema_DorisCompositeDataType0, false, false, dorisSchema_DorisColumnAggrType0, true,
                "VS1IUsA~ls");
        DorisConstant dorisConstant0 = DorisConstant.createIntConstant((-2022L));
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create(dorisSchema_DorisColumn0, dorisConstant0);
        DorisConstant dorisConstant1 = DorisConstant.createNullConstant();
        DorisColumnValue dorisColumnValue1 = DorisColumnValue.create(dorisSchema_DorisColumn0, dorisConstant1);
        boolean boolean0 = dorisColumnValue0.equals(dorisColumnValue1);
        assertFalse(boolean0);
    }

    @Test
    public void test18() throws Throwable {
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create((DorisSchema.DorisColumn) null,
                (DorisConstant) null);
        boolean boolean0 = dorisColumnValue0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test
    public void test19() throws Throwable {
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = DorisSchema.DorisCompositeDataType
                .getRandomWithoutNull();
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn("",
                dorisSchema_DorisCompositeDataType0, false, false);
        DorisConstant.DorisTextConstant dorisConstant_DorisTextConstant0 = new DorisConstant.DorisTextConstant("");
        DorisColumnValue dorisColumnValue0 = new DorisColumnValue(dorisSchema_DorisColumn0,
                dorisConstant_DorisTextConstant0);
        boolean boolean0 = dorisColumnValue0.equals(dorisColumnValue0);
        assertTrue(boolean0);
    }

    @Test
    public void test20() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.FLOAT;
        DorisSchema.DorisCompositeDataType dorisSchema_DorisCompositeDataType0 = new DorisSchema.DorisCompositeDataType(
                dorisSchema_DorisDataType0, (-1));
        DorisSchema.DorisColumnAggrType dorisSchema_DorisColumnAggrType0 = DorisSchema.DorisColumnAggrType.BITMAP_UNION;
        DorisSchema.DorisColumn dorisSchema_DorisColumn0 = new DorisSchema.DorisColumn(":/q",
                dorisSchema_DorisCompositeDataType0, false, false, dorisSchema_DorisColumnAggrType0, true,
                "VS1IUsA~ls");
        DorisConstant dorisConstant0 = DorisConstant.createIntConstant((-2022L));
        DorisColumnValue dorisColumnValue0 = DorisColumnValue.create(dorisSchema_DorisColumn0, dorisConstant0);
        DorisSchema.DorisDataType dorisSchema_DorisDataType1 = dorisColumnValue0.getExpectedType();
        boolean boolean0 = dorisColumnValue0.equals(dorisSchema_DorisDataType1);
        assertFalse(boolean0);
    }
}
