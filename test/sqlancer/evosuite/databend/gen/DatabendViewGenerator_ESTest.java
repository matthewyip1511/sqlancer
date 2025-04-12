/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 23:18:27 GMT 2025
 */

package sqlancer.evosuite.databend.gen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.databend.DatabendProvider;
import sqlancer.databend.gen.DatabendViewGenerator;

public class DatabendViewGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        DatabendProvider.DatabendGlobalState databendProvider_DatabendGlobalState0 = new DatabendProvider.DatabendGlobalState();
        // Undeclared exception!
        try {
            DatabendViewGenerator.generate(databendProvider_DatabendGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        // Undeclared exception!
        try {
            DatabendViewGenerator.generate((DatabendProvider.DatabendGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.databend.gen.DatabendViewGenerator", e);
        }
    }
}
