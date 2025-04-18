/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 11 19:27:28 GMT 2025
 */

package sqlancer.evosuite.postgres.ast;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import sqlancer.citus.CitusGlobalState;
import sqlancer.common.ast.JoinBase;
import sqlancer.postgres.ast.PostgresAggregate;
import sqlancer.postgres.ast.PostgresBinaryLogicalOperation;
import sqlancer.postgres.ast.PostgresConstant;
import sqlancer.postgres.ast.PostgresExpression;
import sqlancer.postgres.ast.PostgresJoin;
import sqlancer.postgres.ast.PostgresPostfixText;
import sqlancer.postgres.ast.PostgresSelect;
import sqlancer.postgres.PostgresSchema;

public class PostgresJoin_ESTest {

    private void verifyException(String s, Exception e) {
    }

    @Test
    public void test00() throws Throwable {
        PostgresConstant.IntConstant postgresConstant_IntConstant0 = new PostgresConstant.IntConstant((-2089L));
        PostgresConstant.PostgresNullConstant postgresConstant_PostgresNullConstant0 = new PostgresConstant.PostgresNullConstant();
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.CROSS;
        PostgresJoin postgresJoin0 = PostgresJoin.createJoin(postgresConstant_PostgresNullConstant0,
                postgresConstant_IntConstant0, postgresJoin_PostgresJoinType0, postgresConstant_IntConstant0);
        assertEquals(JoinBase.JoinType.CROSS, postgresJoin0.getType());
    }

    @Test
    public void test01() throws Throwable {
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.CROSS;
        PostgresConstant postgresConstant0 = PostgresConstant.createBooleanConstant(false);
        PostgresJoin postgresJoin0 = PostgresJoin.createJoin((PostgresExpression) null, (PostgresExpression) null,
                postgresJoin_PostgresJoinType0, postgresConstant0);
        assertEquals(JoinBase.JoinType.CROSS, postgresJoin0.getType());
    }

    @Test
    public void test02() throws Throwable {
        PostgresExpression postgresExpression0 = PostgresConstant.createBitConstant((-1824L));
        List<PostgresExpression> list0 = List.of(postgresExpression0, postgresExpression0, postgresExpression0,
                postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0,
                postgresExpression0);
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.BIT_OR;
        PostgresAggregate postgresAggregate0 = new PostgresAggregate(list0,
                postgresAggregate_PostgresAggregateFunction0);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.FULL;
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresExpression0, postgresAggregate0,
                postgresJoin_PostgresJoinType0);
        assertEquals(JoinBase.JoinType.FULL, postgresJoin0.getType());
    }

    @Test
    public void test03() throws Throwable {
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.RIGHT;
        PostgresJoin postgresJoin0 = new PostgresJoin((PostgresExpression) null, (PostgresExpression) null,
                postgresJoin_PostgresJoinType0, (PostgresExpression) null);
        JoinBase.JoinType postgresJoin_PostgresJoinType1 = postgresJoin0.getType();
        assertSame(postgresJoin_PostgresJoinType0, postgresJoin_PostgresJoinType1);
    }

    @Test
    public void test04() throws Throwable {
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.getRandom();
        PostgresConstant postgresConstant0 = PostgresConstant.createIntConstant(96L);
        PostgresJoin postgresJoin0 = PostgresJoin.createJoin(postgresConstant0, postgresConstant0,
                postgresJoin_PostgresJoinType0, postgresConstant0);
        PostgresExpression postgresExpression0 = postgresJoin0.getTableReference();
        assertNull(postgresExpression0);
    }

    @Test
    public void test05() throws Throwable {
        PostgresConstant postgresConstant0 = PostgresConstant.createBooleanConstant(false);
        PostgresSchema.PostgresDataType postgresSchema_PostgresDataType0 = PostgresSchema.PostgresDataType.TEXT;
        PostgresPostfixText postgresPostfixText0 = new PostgresPostfixText((PostgresExpression) null, (String) null,
                postgresConstant0, postgresSchema_PostgresDataType0);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.CROSS;
        PostgresConstant postgresConstant1 = PostgresConstant.createNullConstant();
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresPostfixText0, (PostgresExpression) null,
                postgresJoin_PostgresJoinType0, postgresConstant1);
        PostgresExpression postgresExpression0 = postgresJoin0.getRightTable();
        assertNull(postgresExpression0);
    }

    @Test
    public void test06() throws Throwable {
        PostgresExpression postgresExpression0 = PostgresConstant.createBitConstant((-1824L));
        List<PostgresExpression> list0 = List.of(postgresExpression0, postgresExpression0, postgresExpression0,
                postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0,
                postgresExpression0);
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.BIT_OR;
        PostgresAggregate postgresAggregate0 = new PostgresAggregate(list0,
                postgresAggregate_PostgresAggregateFunction0);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.FULL;
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresAggregate0, postgresAggregate0,
                postgresJoin_PostgresJoinType0, postgresExpression0);
        PostgresJoin postgresJoin1 = PostgresJoin.createJoin(postgresJoin0, postgresJoin0,
                postgresJoin_PostgresJoinType0, (PostgresExpression) null);
        PostgresExpression postgresExpression1 = postgresJoin1.getOnClause();
        assertNull(postgresExpression1);
    }

    @Test
    public void test07() throws Throwable {
        PostgresSelect postgresSelect0 = new PostgresSelect();
        PostgresSelect.PostgresSubquery postgresSelect_PostgresSubquery0 = new PostgresSelect.PostgresSubquery(
                postgresSelect0, "ENUM$VALUES");
        PostgresBinaryLogicalOperation.BinaryLogicalOperator postgresBinaryLogicalOperation_BinaryLogicalOperator0 = PostgresBinaryLogicalOperation.BinaryLogicalOperator.OR;
        PostgresBinaryLogicalOperation postgresBinaryLogicalOperation0 = new PostgresBinaryLogicalOperation(
                postgresSelect_PostgresSubquery0, postgresSelect_PostgresSubquery0,
                postgresBinaryLogicalOperation_BinaryLogicalOperator0);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.INNER;
        PostgresJoin postgresJoin0 = PostgresJoin.createJoin((PostgresExpression) null, postgresBinaryLogicalOperation0,
                postgresJoin_PostgresJoinType0, postgresSelect_PostgresSubquery0);
        PostgresExpression postgresExpression0 = postgresJoin0.getLeftTable();
        assertNull(postgresExpression0);
    }

    @Test
    public void test08() throws Throwable {
        CitusGlobalState citusGlobalState0 = new CitusGlobalState();
        // Undeclared exception!
        try {
            PostgresJoin.getJoins((List<PostgresExpression>) null, citusGlobalState0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    // @Test
    // public void test09() throws Throwable {
    // PostgresExpression postgresExpression0 = PostgresConstant.createBitConstant((-1824L));
    // List<PostgresExpression> list0 = List.of(postgresExpression0, postgresExpression0, postgresExpression0,
    // postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0,
    // postgresExpression0);
    // PostgresGlobalState postgresGlobalState0 = new PostgresGlobalState();
    // List<PostgresExpression> list1 = PostgresJoin.getJoins(list0, postgresGlobalState0);
    // List<PostgresExpression> list2 = PostgresJoin.getJoins(list1, postgresGlobalState0);
    // assertTrue(list2.isEmpty());
    // }

    // @Test
    // public void test10() throws Throwable {
    // JoinBase.JoinType[] postgresJoin_PostgresJoinTypeArray0 = new JoinBase.JoinType[15];
    // JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.LEFT;
    // postgresJoin_PostgresJoinTypeArray0[1] = postgresJoin_PostgresJoinType0;
    // JoinBase.JoinType postgresJoin_PostgresJoinType1 = JoinBase.JoinType.getRandomExcept("POSTGRES",
    // postgresJoin_PostgresJoinTypeArray0);
    // assertEquals(JoinBase.JoinType.INNER, postgresJoin_PostgresJoinType1);
    // }

    @Test
    public void test11() throws Throwable {
        PostgresExpression postgresExpression0 = PostgresConstant.createBitConstant((-1824L));
        JoinBase.JoinType[] postgresJoin_PostgresJoinTypeArray0 = new JoinBase.JoinType[15];
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresExpression0, postgresExpression0,
                postgresJoin_PostgresJoinTypeArray0[0]);
        postgresJoin0.getType();
    }

    @Test
    public void test12() throws Throwable {
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.getRandom();
        PostgresJoin postgresJoin0 = new PostgresJoin((PostgresExpression) null, (PostgresExpression) null,
                postgresJoin_PostgresJoinType0);
        // Undeclared exception!
        try {
            postgresJoin0.getExpressionType();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test13() throws Throwable {
        PostgresExpression postgresExpression0 = PostgresConstant.createBitConstant((-1824L));
        List<PostgresExpression> list0 = List.of(postgresExpression0, postgresExpression0, postgresExpression0,
                postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0, postgresExpression0,
                postgresExpression0);
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.BIT_OR;
        PostgresAggregate postgresAggregate0 = new PostgresAggregate(list0,
                postgresAggregate_PostgresAggregateFunction0);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.FULL;
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresAggregate0, postgresAggregate0,
                postgresJoin_PostgresJoinType0, postgresExpression0);
        postgresJoin0.setType(postgresJoin_PostgresJoinType0);
        assertEquals(JoinBase.JoinType.FULL, postgresJoin0.getType());
    }

    @Test
    public void test14() throws Throwable {
        PostgresConstant.IntConstant postgresConstant_IntConstant0 = new PostgresConstant.IntConstant(5L);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.FULL;
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresConstant_IntConstant0, postgresConstant_IntConstant0,
                postgresJoin_PostgresJoinType0, postgresConstant_IntConstant0);
        postgresJoin0.setOnClause((PostgresExpression) postgresConstant_IntConstant0);
        assertTrue(postgresConstant_IntConstant0.isInt());
    }

    @Test
    public void test15() throws Throwable {
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.getRandom();
        PostgresSelect postgresSelect0 = new PostgresSelect();
        List<PostgresExpression> list0 = postgresSelect0.getGroupByExpressions();
        PostgresAggregate.PostgresAggregateFunction postgresAggregate_PostgresAggregateFunction0 = PostgresAggregate.PostgresAggregateFunction.SUM;
        PostgresAggregate postgresAggregate0 = new PostgresAggregate(list0,
                postgresAggregate_PostgresAggregateFunction0);
        PostgresSelect.PostgresSubquery postgresSelect_PostgresSubquery0 = new PostgresSelect.PostgresSubquery(
                postgresSelect0, "sqlancer.postgres.ast.PostgresJoin$PostgresJoinType");
        PostgresJoin postgresJoin0 = PostgresJoin.createJoin(postgresAggregate0, postgresSelect_PostgresSubquery0,
                postgresJoin_PostgresJoinType0, postgresAggregate0);
        PostgresExpression postgresExpression0 = postgresJoin0.getLeftTable();
        assertSame(postgresAggregate0, postgresExpression0);
    }

    @Test
    public void test16() throws Throwable {
        PostgresConstant.IntConstant postgresConstant_IntConstant0 = new PostgresConstant.IntConstant(5L);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.FULL;
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresConstant_IntConstant0, postgresConstant_IntConstant0,
                postgresJoin_PostgresJoinType0, postgresConstant_IntConstant0);
        // Undeclared exception!
        try {
            postgresJoin0.getExpectedValue();
            fail("Expecting exception: AssertionError");

        } catch (AssertionError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test17() throws Throwable {
        PostgresExpression postgresExpression0 = PostgresConstant.createBitConstant((-1824L));
        JoinBase.JoinType[] postgresJoin_PostgresJoinTypeArray0 = new JoinBase.JoinType[15];
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresExpression0, postgresExpression0,
                postgresJoin_PostgresJoinTypeArray0[0]);
        PostgresConstant.BitConstant postgresConstant_BitConstant0 = (PostgresConstant.BitConstant) postgresJoin0
                .getOnClause();
        assertFalse(postgresConstant_BitConstant0.isBoolean());
    }

    @Test
    public void test18() throws Throwable {
        PostgresConstant.FloatConstant postgresConstant_FloatConstant0 = new PostgresConstant.FloatConstant(1.0F);
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.LEFT;
        PostgresJoin postgresJoin0 = new PostgresJoin(postgresConstant_FloatConstant0, postgresConstant_FloatConstant0,
                postgresJoin_PostgresJoinType0);
        PostgresConstant.FloatConstant postgresConstant_FloatConstant1 = (PostgresConstant.FloatConstant) postgresJoin0
                .getTableReference();
        assertFalse(postgresConstant_FloatConstant1.isString());
    }

    @Test
    public void test19() throws Throwable {
        JoinBase.JoinType postgresJoin_PostgresJoinType0 = JoinBase.JoinType.getRandom();
        PostgresConstant postgresConstant0 = PostgresConstant.createNullConstant();
        PostgresJoin postgresJoin0 = PostgresJoin.createJoin(postgresConstant0, postgresConstant0,
                postgresJoin_PostgresJoinType0, postgresConstant0);
        PostgresExpression postgresExpression0 = postgresJoin0.getRightTable();
        assertSame(postgresConstant0, postgresExpression0);
    }
}
