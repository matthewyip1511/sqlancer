/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:33:05 GMT 2025
 */

package sqlancer.evosuite.cockroachdb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.cockroachdb.CockroachDBOracleFactory;
import sqlancer.cockroachdb.CockroachDBProvider;
import sqlancer.common.oracle.TestOracle;

public class CockroachDBOracleFactory_ESTest {

    @Test
    public void test0() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.NOREC;
        TestOracle<CockroachDBProvider.CockroachDBGlobalState> testOracle0 = cockroachDBOracleFactory0
                .create(cockroachDBProvider_CockroachDBGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.HAVING;
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        TestOracle<CockroachDBProvider.CockroachDBGlobalState> testOracle0 = cockroachDBOracleFactory0
                .create(cockroachDBProvider_CockroachDBGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test2() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.GROUP_BY;
        TestOracle<CockroachDBProvider.CockroachDBGlobalState> testOracle0 = cockroachDBOracleFactory0
                .create(cockroachDBProvider_CockroachDBGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test3() throws Throwable {
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.DISTINCT;
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        TestOracle<CockroachDBProvider.CockroachDBGlobalState> testOracle0 = cockroachDBOracleFactory0
                .create(cockroachDBProvider_CockroachDBGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test4() throws Throwable {
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.WHERE;
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        TestOracle<CockroachDBProvider.CockroachDBGlobalState> testOracle0 = cockroachDBOracleFactory0
                .create(cockroachDBProvider_CockroachDBGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test5() throws Throwable {
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.QUERY_PARTITIONING;
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        // Undeclared exception!
        try {
            cockroachDBOracleFactory0.create(cockroachDBProvider_CockroachDBGlobalState0);
            fail("Expecting exception: NoClassDefFoundError");

        } catch (NoClassDefFoundError e) {
            //
            // org/postgresql/util/PSQLException
            //
            verifyException("sqlancer.cockroachdb.CockroachDBOracleFactory$2", e);
        }
    }

    private void verifyException(String s, NoClassDefFoundError e) {
    }

    @Test
    public void test6() throws Throwable {
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.EXTENDED_WHERE;
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        TestOracle<CockroachDBProvider.CockroachDBGlobalState> testOracle0 = cockroachDBOracleFactory0
                .create(cockroachDBProvider_CockroachDBGlobalState0);
        assertNotNull(testOracle0);
    }

    @Test
    public void test7() throws Throwable {
        CockroachDBProvider.CockroachDBGlobalState cockroachDBProvider_CockroachDBGlobalState0 = new CockroachDBProvider.CockroachDBGlobalState();
        CockroachDBOracleFactory cockroachDBOracleFactory0 = CockroachDBOracleFactory.CERT;
        TestOracle<CockroachDBProvider.CockroachDBGlobalState> testOracle0 = cockroachDBOracleFactory0
                .create(cockroachDBProvider_CockroachDBGlobalState0);
        assertNotNull(testOracle0);
    }
}
