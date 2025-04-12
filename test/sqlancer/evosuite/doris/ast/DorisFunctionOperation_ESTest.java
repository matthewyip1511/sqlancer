/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 22:43:13 GMT 2025
 */

package sqlancer.evosuite.doris.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.doris.ast.DorisConstant;
import sqlancer.doris.ast.DorisExpression;
import sqlancer.doris.ast.DorisFunctionOperation;
import sqlancer.doris.DorisSchema;
import sqlancer.doris.gen.DorisNewExpressionGenerator;

public class DorisFunctionOperation_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test0() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction
                .getRandom();
        DorisSchema.DorisDataType[] dorisSchema_DorisDataTypeArray0 = dorisFunctionOperation_DorisFunction0
                .getArgumentTypes();
        assertEquals(3, dorisSchema_DorisDataTypeArray0.length);
    }

    @Test
    public void test1() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.GREATEST;
        DorisFunctionOperation dorisFunctionOperation0 = new DorisFunctionOperation(
                dorisFunctionOperation_DorisFunction0, (List<DorisExpression>) null);
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction1 = dorisFunctionOperation0
                .getFunction();
        assertSame(dorisFunctionOperation_DorisFunction1, dorisFunctionOperation_DorisFunction0);
    }

    @Test
    public void test2() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.LEFT;
        DorisFunctionOperation dorisFunctionOperation0 = new DorisFunctionOperation(
                dorisFunctionOperation_DorisFunction0, (List<DorisExpression>) null);
        List<DorisExpression> list0 = dorisFunctionOperation0.getArgs();
        assertNull(list0);
    }

    @Test
    public void test3() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.SECOND;
        LinkedList<DorisExpression> linkedList0 = new LinkedList<DorisExpression>();
        DorisConstant dorisConstant0 = DorisConstant.createIntConstant(1L);
        linkedList0.offer(dorisConstant0);
        DorisFunctionOperation dorisFunctionOperation0 = new DorisFunctionOperation(
                dorisFunctionOperation_DorisFunction0, linkedList0);
        List<DorisExpression> list0 = dorisFunctionOperation0.getArgs();
        assertFalse(list0.isEmpty());
    }

    @Test
    public void test4() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.CURRENT_DATE;
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.VARCHAR;
        DorisFunctionOperation dorisFunctionOperation0 = dorisFunctionOperation_DorisFunction0
                .getCall(dorisSchema_DorisDataType0, (DorisNewExpressionGenerator) null, 0);
        List<DorisExpression> list0 = dorisFunctionOperation0.getArgs();
        assertTrue(list0.isEmpty());
    }

    @Test
    public void test5() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.DECIMAL;
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.CHAR;
        // Undeclared exception!
        try {
            dorisFunctionOperation_DorisFunction0.getCall(dorisSchema_DorisDataType0,
                    (DorisNewExpressionGenerator) null, (-791));
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("sqlancer.doris.ast.DorisFunctionOperation$DorisFunction", e);
        }
    }

    @Test
    public void test6() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.LCASE;
        LinkedList<DorisExpression> linkedList0 = new LinkedList<DorisExpression>();
        DorisFunctionOperation dorisFunctionOperation0 = new DorisFunctionOperation(
                dorisFunctionOperation_DorisFunction0, linkedList0);
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction1 = dorisFunctionOperation0
                .getFunction();
        assertEquals("LCASE", dorisFunctionOperation_DorisFunction1.getFunctionName());
    }

    @Test
    public void test7() throws Throwable {
        DorisSchema.DorisDataType dorisSchema_DorisDataType0 = DorisSchema.DorisDataType.FLOAT;
        List<DorisFunctionOperation.DorisFunction> list0 = DorisFunctionOperation.DorisFunction
                .getFunctionsCompatibleWith(dorisSchema_DorisDataType0);
        assertEquals(30, list0.size());
    }

    @Test
    public void test8() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction.SECOND;
        boolean boolean0 = dorisFunctionOperation_DorisFunction0.isVariadic();
        assertFalse(boolean0);
    }

    @Test
    public void test9() throws Throwable {
        DorisFunctionOperation.DorisFunction dorisFunctionOperation_DorisFunction0 = DorisFunctionOperation.DorisFunction
                .getRandom();
        String string0 = dorisFunctionOperation_DorisFunction0.getFunctionName();
        assertEquals("CONVERT_TZ", string0);
    }
}
