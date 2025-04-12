/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:04:43 GMT 2025
 */

package sqlancer.evosuite.cockroachdb.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqlancer.cockroachdb.ast.CockroachDBColumnReference;
import sqlancer.cockroachdb.CockroachDBSchema;

public class CockroachDBColumnReference_ESTest {

    @Test
    public void test0() throws Throwable {
        CockroachDBColumnReference cockroachDBColumnReference0 = new CockroachDBColumnReference(
                (CockroachDBSchema.CockroachDBColumn) null);
        CockroachDBSchema.CockroachDBColumn cockroachDBSchema_CockroachDBColumn0 = cockroachDBColumnReference0
                .getColumn();
        assertNull(cockroachDBSchema_CockroachDBColumn0);
    }

    @Test
    public void test1() throws Throwable {
        CockroachDBSchema.CockroachDBCompositeDataType cockroachDBSchema_CockroachDBCompositeDataType0 = CockroachDBSchema.CockroachDBCompositeDataType
                .getVarBit(31001);
        CockroachDBSchema.CockroachDBColumn cockroachDBSchema_CockroachDBColumn0 = new CockroachDBSchema.CockroachDBColumn(
                "SELECT COLUMN_NAME, DATA_TYPE, TYPE_NAME, COLUMN_SIZE FROM INFORMATION_SCHEMA.SYSTEM_COLUMNS WHERE TABLE_NAME = '%s';",
                cockroachDBSchema_CockroachDBCompositeDataType0, true, true);
        CockroachDBColumnReference cockroachDBColumnReference0 = new CockroachDBColumnReference(
                cockroachDBSchema_CockroachDBColumn0);
        CockroachDBSchema.CockroachDBColumn cockroachDBSchema_CockroachDBColumn1 = cockroachDBColumnReference0
                .getColumn();
        assertTrue(cockroachDBSchema_CockroachDBColumn1.isPrimaryKey());
    }

    @Test
    public void test2() throws Throwable {
        CockroachDBSchema.CockroachDBCompositeDataType cockroachDBSchema_CockroachDBCompositeDataType0 = CockroachDBSchema.CockroachDBCompositeDataType
                .getVarBit((-1973));
        CockroachDBSchema.CockroachDBColumn cockroachDBSchema_CockroachDBColumn0 = new CockroachDBSchema.CockroachDBColumn(
                "J-eR(wr*eEZs*>Zv)&", cockroachDBSchema_CockroachDBCompositeDataType0, false, false);
        CockroachDBColumnReference cockroachDBColumnReference0 = new CockroachDBColumnReference(
                cockroachDBSchema_CockroachDBColumn0);
        CockroachDBSchema.CockroachDBColumn cockroachDBSchema_CockroachDBColumn1 = cockroachDBColumnReference0
                .getColumn();
        assertSame(cockroachDBSchema_CockroachDBColumn1, cockroachDBSchema_CockroachDBColumn0);
    }
}
