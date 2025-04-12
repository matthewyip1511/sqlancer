/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 00:36:47 GMT 2025
 */

package sqlancer.evosuite.yugabyte.ysql.gen;

import static org.junit.jupiter.api.Assertions.*;
import org.evosuite.runtime.Random;
import org.junit.jupiter.api.Test;
import sqlancer.yugabyte.ysql.gen.YSQLReindexGenerator;
import sqlancer.yugabyte.ysql.YSQLGlobalState;

public class YSQLReindexGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        YSQLGlobalState ySQLGlobalState0 = new YSQLGlobalState();
        // Undeclared exception!
        try {
            YSQLReindexGenerator.create(ySQLGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test1() throws Throwable {
        YSQLGlobalState ySQLGlobalState0 = new YSQLGlobalState();
        // Undeclared exception!
        try {
            YSQLReindexGenerator.create(ySQLGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            YSQLReindexGenerator.create((YSQLGlobalState) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.yugabyte.ysql.gen.YSQLReindexGenerator", e);
        }
    }
}
