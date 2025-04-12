/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:11:11 GMT 2025
 */

package sqlancer.evosuite.cnosdb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.cnosdb.CnosDBGlobalState;
import sqlancer.cnosdb.CnosDBOracleFactory;
import sqlancer.common.oracle.TestOracle;

public class CnosDBOracleFactory_ESTest {

    @Test
    public void test0() throws Throwable {
        CnosDBOracleFactory cnosDBOracleFactory0 = CnosDBOracleFactory.HAVING;
        CnosDBGlobalState cnosDBGlobalState0 = new CnosDBGlobalState();
        TestOracle<CnosDBGlobalState> testOracle0 = cnosDBOracleFactory0.create(cnosDBGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test1() throws Throwable {
        CnosDBOracleFactory cnosDBOracleFactory0 = CnosDBOracleFactory.NOREC;
        CnosDBGlobalState cnosDBGlobalState0 = new CnosDBGlobalState();
        // Undeclared exception!
        try {
            cnosDBOracleFactory0.create(cnosDBGlobalState0);
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // null
            //
        }
    }

    @Test
    public void test2() throws Throwable {
        CnosDBOracleFactory cnosDBOracleFactory0 = CnosDBOracleFactory.QUERY_PARTITIONING;
        CnosDBGlobalState cnosDBGlobalState0 = new CnosDBGlobalState();
        TestOracle<CnosDBGlobalState> testOracle0 = cnosDBOracleFactory0.create(cnosDBGlobalState0);
        assertNotNull(testOracle0);
    }
}
