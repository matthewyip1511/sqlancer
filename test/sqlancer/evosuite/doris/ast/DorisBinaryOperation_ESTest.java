/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 18:41:11 GMT 2025
 */

package sqlancer.evosuite.doris.ast;

import org.junit.jupiter.api.Test;
import sqlancer.doris.ast.DorisBinaryLogicalOperation;
import sqlancer.doris.ast.DorisBinaryOperation;
import sqlancer.doris.ast.DorisConstant;

public class DorisBinaryOperation_ESTest {

    @Test
    public void test0() throws Throwable {
        DorisConstant dorisConstant0 = DorisConstant.createDatetimeConstant(780L);
        DorisBinaryLogicalOperation.DorisBinaryLogicalOperator dorisBinaryLogicalOperation_DorisBinaryLogicalOperator0 = DorisBinaryLogicalOperation.DorisBinaryLogicalOperator.OR;
        DorisBinaryLogicalOperation dorisBinaryLogicalOperation0 = new DorisBinaryLogicalOperation(dorisConstant0,
                dorisConstant0, dorisBinaryLogicalOperation_DorisBinaryLogicalOperator0);
        DorisBinaryOperation dorisBinaryOperation0 = new DorisBinaryOperation(dorisBinaryLogicalOperation0,
                dorisConstant0, dorisBinaryLogicalOperation_DorisBinaryLogicalOperator0);
    }
}
