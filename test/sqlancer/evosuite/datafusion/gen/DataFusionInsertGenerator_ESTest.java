/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 01:19:53 GMT 2025
 */

package sqlancer.evosuite.datafusion.gen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.common.query.SQLQueryAdapter;
import sqlancer.datafusion.DataFusionProvider;
import sqlancer.datafusion.DataFusionSchema;
import sqlancer.datafusion.gen.DataFusionInsertGenerator;

public class DataFusionInsertGenerator_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new DataFusionProvider.DataFusionGlobalState();
        DataFusionInsertGenerator dataFusionInsertGenerator0 = new DataFusionInsertGenerator(
                dataFusionProvider_DataFusionGlobalState0);
        DataFusionSchema.DataFusionDataType dataFusionSchema_DataFusionDataType0 = DataFusionSchema.DataFusionDataType.BOOLEAN;
        DataFusionSchema.DataFusionColumn dataFusionSchema_DataFusionColumn0 = new DataFusionSchema.DataFusionColumn(
                "INSERT INTO ", dataFusionSchema_DataFusionDataType0, true);
        dataFusionInsertGenerator0.insertValue(dataFusionSchema_DataFusionColumn0);
        assertEquals("INSERT INTO ", dataFusionSchema_DataFusionColumn0.getName());
    }

    @Test
    public void test1() throws Throwable {
        DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new DataFusionProvider.DataFusionGlobalState();
        DataFusionSchema.DataFusionDataType dataFusionSchema_DataFusionDataType0 = DataFusionSchema.DataFusionDataType.NULL;
        DataFusionSchema.DataFusionColumn dataFusionSchema_DataFusionColumn0 = new DataFusionSchema.DataFusionColumn("",
                dataFusionSchema_DataFusionDataType0, false);
        List<DataFusionSchema.DataFusionColumn> list0 = List.of(dataFusionSchema_DataFusionColumn0,
                dataFusionSchema_DataFusionColumn0, dataFusionSchema_DataFusionColumn0,
                dataFusionSchema_DataFusionColumn0, dataFusionSchema_DataFusionColumn0,
                dataFusionSchema_DataFusionColumn0, dataFusionSchema_DataFusionColumn0);
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable(
                "eFJ!d`:J{}>S#wAn{", list0, false);
        SQLQueryAdapter sQLQueryAdapter0 = DataFusionInsertGenerator.getQuery(dataFusionProvider_DataFusionGlobalState0,
                dataFusionSchema_DataFusionTable0);
        assertFalse(sQLQueryAdapter0.couldAffectSchema());
    }

    @Test
    public void test2() throws Throwable {
        // Undeclared exception!
        try {
            DataFusionInsertGenerator.getQuery((DataFusionProvider.DataFusionGlobalState) null,
                    (DataFusionSchema.DataFusionTable) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.datafusion.gen.DataFusionInsertGenerator", e);
        }
    }

    @Test
    public void test3() throws Throwable {
        DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new DataFusionProvider.DataFusionGlobalState();
        DataFusionInsertGenerator dataFusionInsertGenerator0 = new DataFusionInsertGenerator(
                dataFusionProvider_DataFusionGlobalState0);
        // Undeclared exception!
        try {
            dataFusionInsertGenerator0.insertValue((DataFusionSchema.DataFusionColumn) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.datafusion.gen.DataFusionInsertGenerator", e);
        }
    }

    @Test
    public void test4() throws Throwable {
        DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new DataFusionProvider.DataFusionGlobalState();
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionDataType dataFusionSchema_DataFusionDataType0 = DataFusionSchema.DataFusionDataType.BOOLEAN;
        DataFusionSchema.DataFusionColumn dataFusionSchema_DataFusionColumn0 = new DataFusionSchema.DataFusionColumn(
                "T;Es!:MD?CuBG`0.n?", dataFusionSchema_DataFusionDataType0, false);
        linkedList0.add(dataFusionSchema_DataFusionColumn0);
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable(
                "CREATE TABLE statements should set couldAffectSchema to true", linkedList0, true);
        SQLQueryAdapter sQLQueryAdapter0 = DataFusionInsertGenerator.getQuery(dataFusionProvider_DataFusionGlobalState0,
                dataFusionSchema_DataFusionTable0);
        assertTrue(sQLQueryAdapter0.couldAffectSchema());
    }

    @Test
    public void test5() throws Throwable {
        DataFusionProvider.DataFusionGlobalState dataFusionProvider_DataFusionGlobalState0 = new DataFusionProvider.DataFusionGlobalState();
        LinkedList<DataFusionSchema.DataFusionColumn> linkedList0 = new LinkedList<DataFusionSchema.DataFusionColumn>();
        DataFusionSchema.DataFusionTable dataFusionSchema_DataFusionTable0 = new DataFusionSchema.DataFusionTable(
                "CREATE TABLE statements should set couldAffectSchema to true", linkedList0, true);
        // Undeclared exception!
        try {
            DataFusionInsertGenerator.getQuery(dataFusionProvider_DataFusionGlobalState0,
                    dataFusionSchema_DataFusionTable0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.datafusion.gen.DataFusionInsertGenerator", e);
        }
    }
}
