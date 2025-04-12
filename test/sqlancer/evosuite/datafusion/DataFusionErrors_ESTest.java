/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:43:43 GMT 2025
 */

package sqlancer.evosuite.datafusion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.ExpectedErrors;
import sqlancer.datafusion.DataFusionErrors;

public class DataFusionErrors_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        ExpectedErrors expectedErrors0 = new ExpectedErrors();
        DataFusionErrors.registerExpectedExecutionErrors(expectedErrors0);
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            DataFusionErrors.registerExpectedExecutionErrors((ExpectedErrors) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.datafusion.DataFusionErrors", e);
        }
    }

    @Test
    public void test2() throws Throwable {
        List<String> list0 = DataFusionErrors.getExpectedExecutionErrors();
        assertFalse(list0.isEmpty());
    }
}
