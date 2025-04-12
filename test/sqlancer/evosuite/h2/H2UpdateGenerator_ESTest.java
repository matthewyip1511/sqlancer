/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:26:00 GMT 2025
 */

package sqlancer.evosuite.h2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.h2.H2Provider;
import sqlancer.h2.H2UpdateGenerator;

public class H2UpdateGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        H2Provider.H2GlobalState h2Provider_H2GlobalState0 = new H2Provider.H2GlobalState();
        // Undeclared exception!
        try {
            H2UpdateGenerator.getQuery(h2Provider_H2GlobalState0);
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
            H2UpdateGenerator.getQuery((H2Provider.H2GlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.h2.H2UpdateGenerator", e);
        }
    }
}
