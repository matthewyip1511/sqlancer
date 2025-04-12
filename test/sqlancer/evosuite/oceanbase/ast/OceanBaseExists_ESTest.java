/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 14:33:17 GMT 2025
 */

package sqlancer.evosuite.oceanbase.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.oceanbase.ast.OceanBaseConstant;
import sqlancer.oceanbase.ast.OceanBaseExists;
import sqlancer.oceanbase.ast.OceanBaseExpression;

public class OceanBaseExists_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createTrue();
        OceanBaseExpression[] oceanBaseExpressionArray0 = new OceanBaseExpression[9];
        OceanBaseExists oceanBaseExists0 = new OceanBaseExists(oceanBaseExpressionArray0[0], oceanBaseConstant0);
        OceanBaseExpression oceanBaseExpression0 = oceanBaseExists0.getExpr();
        assertNull(oceanBaseExpression0);
    }

    @Test
    public void test1() throws Throwable {
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createIntConstantNotAsBoolean(0L);
        OceanBaseExists oceanBaseExists0 = new OceanBaseExists(oceanBaseConstant0, (OceanBaseConstant) null);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseExists0.getExpectedValue();
        assertNull(oceanBaseConstant1);
    }

    @Test
    public void test2() throws Throwable {
        OceanBaseConstant.OceanBaseNullConstant oceanBaseConstant_OceanBaseNullConstant0 = new OceanBaseConstant.OceanBaseNullConstant();
        OceanBaseExists oceanBaseExists0 = new OceanBaseExists(oceanBaseConstant_OceanBaseNullConstant0);
        OceanBaseConstant oceanBaseConstant0 = oceanBaseExists0.getExpectedValue();
        assertNull(oceanBaseConstant0.getType());
    }

    @Test
    public void test3() throws Throwable {
        OceanBaseConstant.OceanBaseIntConstant oceanBaseConstant_OceanBaseIntConstant0 = new OceanBaseConstant.OceanBaseIntConstant(
                (-1941L), "");
        OceanBaseExists oceanBaseExists0 = new OceanBaseExists(oceanBaseConstant_OceanBaseIntConstant0);
        OceanBaseConstant oceanBaseConstant0 = oceanBaseExists0.getExpectedValue();
        assertEquals("", oceanBaseConstant0.getTextRepresentation());
    }

    @Test
    public void test4() throws Throwable {
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createDoubleConstant(0.0);
        OceanBaseExists oceanBaseExists0 = new OceanBaseExists(oceanBaseConstant0, oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseExists0.getExpectedValue();
        assertSame(oceanBaseConstant0, oceanBaseConstant1);
    }

    // @Test
    // public void test5() throws Throwable {
    // OceanBaseExists oceanBaseExists0 = null;
    // try {
    // oceanBaseExists0 = new OceanBaseExists((OceanBaseExpression) null);
    // fail("Expecting exception: NullPointerException");
    //
    // } catch (NullPointerException e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // verifyException("sqlancer.oceanbase.ast.OceanBaseExists", e);
    // }
    // }
    //
    // @Test
    // public void test6() throws Throwable {
    // OceanBaseSelect oceanBaseSelect0 = new OceanBaseSelect();
    // OceanBaseExists oceanBaseExists0 = null;
    // try {
    // oceanBaseExists0 = new OceanBaseExists(oceanBaseSelect0);
    // fail("Expecting exception: AssertionError");
    //
    // } catch (AssertionError e) {
    // //
    // // no message in exception (getMessage() returned null)
    // //
    // }
    // }

    @Test
    public void test7() throws Throwable {
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createStringConstant("");
        OceanBaseExists oceanBaseExists0 = new OceanBaseExists(oceanBaseConstant0);
        OceanBaseConstant oceanBaseConstant1 = oceanBaseExists0.getExpectedValue();
        assertEquals("", oceanBaseConstant1.castAsString());
    }

    @Test
    public void test8() throws Throwable {
        OceanBaseConstant oceanBaseConstant0 = OceanBaseConstant.createStringConstant("");
        OceanBaseExists oceanBaseExists0 = new OceanBaseExists(oceanBaseConstant0);
        OceanBaseConstant.OceanBaseTextConstant oceanBaseConstant_OceanBaseTextConstant0 = (OceanBaseConstant.OceanBaseTextConstant) oceanBaseExists0
                .getExpr();
        assertFalse(oceanBaseConstant_OceanBaseTextConstant0.isInt());
    }
}
