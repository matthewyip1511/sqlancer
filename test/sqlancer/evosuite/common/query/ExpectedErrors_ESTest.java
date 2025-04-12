/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 00:10:01 GMT 2025
 */

package sqlancer.evosuite.common.query;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;

public class ExpectedErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder0 = new ExpectedErrors.ExpectedErrorsBuilder();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "0+";
        stringArray0[1] = "";
        stringArray0[2] = "/,a=HC?";
        stringArray0[3] = "XemTpX>z0JPC";
        stringArray0[4] = "";
        stringArray0[5] = "";
        stringArray0[6] = "sqlancer.common.query.ExpectedErrors";
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder1 = expectedErrors_ExpectedErrorsBuilder0
                .withRegexString(stringArray0);
        assertSame(expectedErrors_ExpectedErrorsBuilder0, expectedErrors_ExpectedErrorsBuilder1);
    }

    @Test
    public void test01() throws Throwable {
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder0 = ExpectedErrors.newErrors();
        Pattern[] patternArray0 = new Pattern[1];
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder1 = expectedErrors_ExpectedErrorsBuilder0
                .withRegex(patternArray0);
        assertSame(expectedErrors_ExpectedErrorsBuilder1, expectedErrors_ExpectedErrorsBuilder0);
    }

    @Test
    public void test02() throws Throwable {
        // Undeclared exception!
        try {
            ExpectedErrors.from((String[]) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test
    public void test03() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            expectedErrors0.addRegexString("/`-#)v|S3!gku");
            fail("Expecting exception: PatternSyntaxException");

        } catch (PatternSyntaxException e) {
            //
            // Unmatched closing ')' near index 4\r
            // /`-#)v|S3!gku\r
            // ^
            //
            verifyException("java.util.regex.Pattern", e);
        }
    }

    @Test
    public void test04() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            expectedErrors0.addRegexString((String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test05() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            expectedErrors0.addAllRegexStrings((Collection<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.query.ExpectedErrors", e);
        }
    }

    @Test
    public void test06() throws Throwable {
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = null;
        try {
            expectedErrors0 = new ExpectedErrors((Collection<String>) null, linkedList0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test07() throws Throwable {
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder0 = new ExpectedErrors.ExpectedErrorsBuilder();
        String[] stringArray0 = new String[7];
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder1 = expectedErrors_ExpectedErrorsBuilder0
                .with(stringArray0);
        assertSame(expectedErrors_ExpectedErrorsBuilder0, expectedErrors_ExpectedErrorsBuilder1);
    }

    @Test
    public void test08() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        LinkedList<Pattern> linkedList1 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors0 = new ExpectedErrors(linkedList0, linkedList1);
        ExpectedErrors expectedErrors1 = expectedErrors0.addAll(linkedList0);
        assertSame(expectedErrors1, expectedErrors0);
    }

    @Test
    public void test09() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        expectedErrors0.addRegexString("");
        boolean boolean0 = expectedErrors0.errorIsExpected("LtW'%#Y/");
        assertTrue(boolean0);
    }

    @Test
    public void test10() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        expectedErrors0.addRegexString("sqlancer.common.query.ExpectedErrors$ExpectedErrorsBuilder");
        boolean boolean0 = expectedErrors0
                .errorIsExpected("sqlancer.common.query.ExpectedErrors$ExpectedErrorsBuilder");
        assertFalse(boolean0);
    }

    @Test
    public void test11() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "";
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        boolean boolean0 = expectedErrors0.errorIsExpected("n");
        assertTrue(boolean0);
    }

    @Test
    public void test12() throws Throwable {
        String[] stringArray0 = new String[0];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        expectedErrors0.add("]]~FqI}fYT(");
        boolean boolean0 = expectedErrors0.errorIsExpected("");
        assertFalse(boolean0);
    }

    @Test
    public void test13() throws Throwable {
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder0 = new ExpectedErrors.ExpectedErrorsBuilder();
        ExpectedErrors expectedErrors0 = expectedErrors_ExpectedErrorsBuilder0.build();
        // Undeclared exception!
        try {
            expectedErrors0.errorIsExpected((String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.query.ExpectedErrors", e);
        }
    }

    @Test
    public void test14() throws Throwable {
        String[] stringArray0 = new String[7];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        // Undeclared exception!
        try {
            expectedErrors0.errorIsExpected("");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test15() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        ExpectedErrors expectedErrors1 = expectedErrors0.addAllRegexStrings(linkedList0);
        assertSame(expectedErrors0, expectedErrors1);
    }

    @Test
    public void test16() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        List<String> list0 = List.of("k~AjKR4r;4)z>", "k~AjKR4r;4)z>");
        // Undeclared exception!
        try {
            expectedErrors0.addAllRegexStrings(list0);
            fail("Expecting exception: PatternSyntaxException");

        } catch (PatternSyntaxException e) {
            //
            // Unmatched closing ')' near index 9\r
            // k~AjKR4r;4)z>\r
            // ^
            //
            verifyException("java.util.regex.Pattern", e);
        }
    }

    @Test
    public void test17() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            expectedErrors0.addAllRegexes((Collection<Pattern>) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.query.ExpectedErrors", e);
        }
    }

    @Test
    public void test18() throws Throwable {
        String[] stringArray0 = new String[7];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors expectedErrors1 = expectedErrors0.addAllRegexes(linkedList0);
        assertSame(expectedErrors1, expectedErrors0);
    }

    @Test
    public void test19() throws Throwable {
        String[] stringArray0 = new String[7];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        // Undeclared exception!
        try {
            expectedErrors0.addRegex((Pattern) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.query.ExpectedErrors", e);
        }
    }

    @Test
    public void test20() throws Throwable {
        String[] stringArray0 = new String[2];
        ExpectedErrors expectedErrors0 = ExpectedErrors.from(stringArray0);
        Pattern pattern0 = Pattern.compile("", 0);
        ExpectedErrors expectedErrors1 = expectedErrors0.addRegex(pattern0);
        assertSame(expectedErrors0, expectedErrors1);
    }

    @Test
    public void test21() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            expectedErrors0.add((String) null);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.common.query.ExpectedErrors", e);
        }
    }

    @Test
    public void test22() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        // Undeclared exception!
        try {
            expectedErrors0.addAll((Collection<String>) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test23() throws Throwable {
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder0 = ExpectedErrors.newErrors();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder1 = expectedErrors_ExpectedErrorsBuilder0
                .withRegexString((Collection<String>) linkedList0);
        assertSame(expectedErrors_ExpectedErrorsBuilder0, expectedErrors_ExpectedErrorsBuilder1);
    }

    @Test
    public void test24() throws Throwable {
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder0 = ExpectedErrors.newErrors();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder1 = expectedErrors_ExpectedErrorsBuilder0
                .with((Collection<String>) linkedList0);
        assertSame(expectedErrors_ExpectedErrorsBuilder1, expectedErrors_ExpectedErrorsBuilder0);
    }

    @Test
    public void test25() throws Throwable {
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder0 = new ExpectedErrors.ExpectedErrorsBuilder();
        LinkedList<Pattern> linkedList0 = new LinkedList<Pattern>();
        ExpectedErrors.ExpectedErrorsBuilder expectedErrors_ExpectedErrorsBuilder1 = expectedErrors_ExpectedErrorsBuilder0
                .withRegex((Collection<Pattern>) linkedList0);
        assertSame(expectedErrors_ExpectedErrorsBuilder1, expectedErrors_ExpectedErrorsBuilder0);
    }
}
