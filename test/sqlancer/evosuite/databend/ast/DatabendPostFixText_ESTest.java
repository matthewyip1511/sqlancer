/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 15:16:25 GMT 2025
 */

package sqlancer.evosuite.databend.ast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.databend.ast.DatabendConstant;
import sqlancer.databend.ast.DatabendPostFixText;

public class DatabendPostFixText_ESTest {

    @Test
    public void test0() throws Throwable {
        DatabendConstant.DatabendDateConstant databendConstant_DatabendDateConstant0 = new DatabendConstant.DatabendDateConstant(
                (-9223372036854775808L));
        DatabendPostFixText databendPostFixText0 = new DatabendPostFixText(databendConstant_DatabendDateConstant0,
                (String) null);
        assertNull(databendPostFixText0.getText());
    }
}
