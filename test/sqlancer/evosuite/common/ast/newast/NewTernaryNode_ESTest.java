/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 12 02:19:01 GMT 2025
 */

package sqlancer.evosuite.common.ast.newast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqlancer.common.ast.newast.NewTernaryNode;

public class NewTernaryNode_ESTest {

    @Test
    public void test00() throws Throwable {
        Integer integer0 = (-2363);
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>((Integer) null, integer0, (Integer) null,
                ";N8$=Z.+%YZ:j", "");
        Integer integer1 = newTernaryNode0.getRight();
        assertNull(integer1);
        assertEquals(";N8$=Z.+%YZ:j", newTernaryNode0.getLeftStr());
        assertEquals("", newTernaryNode0.getRightStr());
    }

    @Test
    public void test01() throws Throwable {
        Integer integer0 = 0;
        Integer integer1 = 0;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer1, "", "");
        Object object0 = newTernaryNode0.getMiddle();
        assertEquals(0, object0);
    }

    @Test
    public void test02() throws Throwable {
        Integer integer0 = 0;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer0, "",
                "sqlancer.common.ast.newast.NewTernaryNode");
        String string0 = newTernaryNode0.getRightStr();
        assertEquals("sqlancer.common.ast.newast.NewTernaryNode", string0);
        assertEquals("", newTernaryNode0.getLeftStr());
    }

    @Test
    public void test03() throws Throwable {
        Integer integer0 = (-2363);
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>((Integer) null, integer0, (Integer) null,
                ";N8$=Z.+%YZ:j", "");
        String string0 = newTernaryNode0.getRightStr();
        assertEquals("", string0);
        assertEquals(";N8$=Z.+%YZ:j", newTernaryNode0.getLeftStr());
    }

    @Test
    public void test04() throws Throwable {
        Integer integer0 = 368;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, (Integer) null, (Integer) null,
                (String) null, (String) null);
        Integer integer1 = newTernaryNode0.getRight();
        assertNull(integer1);
    }

    @Test
    public void test05() throws Throwable {
        Integer integer0 = 892;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer0,
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV");
        NewTernaryNode<Object> newTernaryNode1 = new NewTernaryNode<Object>(newTernaryNode0, "BP*t,Zo.my|DV",
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV", (String) null);
        Object object0 = newTernaryNode1.getRight();
        assertEquals("BP*t,Zo.my|DV", object0);
    }

    @Test
    public void test06() throws Throwable {
        Integer integer0 = 368;
        NewTernaryNode<Object> newTernaryNode0 = new NewTernaryNode<Object>(integer0, (Object) null, (Object) null,
                (String) null, (String) null);
        Object object0 = newTernaryNode0.getMiddle();
        assertNull(object0);
    }

    @Test
    public void test07() throws Throwable {
        Integer integer0 = 892;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer0,
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV");
        NewTernaryNode<Object> newTernaryNode1 = new NewTernaryNode<Object>(newTernaryNode0, "BP*t,Zo.my|DV",
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV", (String) null);
        Object object0 = newTernaryNode1.getMiddle();
        assertEquals("BP*t,Zo.my|DV", object0);
    }

    @Test
    public void test08() throws Throwable {
        Object object0 = new Object();
        Integer integer0 = 0;
        NewTernaryNode<Object> newTernaryNode0 = new NewTernaryNode<Object>(object0, integer0, integer0, (String) null,
                (String) null);
        String string0 = newTernaryNode0.getLeftStr();
        assertNull(string0);
    }

    @Test
    public void test09() throws Throwable {
        Integer integer0 = 892;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer0,
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV");
        NewTernaryNode<Object> newTernaryNode1 = new NewTernaryNode<Object>(newTernaryNode0, "BP*t,Zo.my|DV",
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV", (String) null);
        String string0 = newTernaryNode1.getLeftStr();
        assertEquals("BP*t,Zo.my|DV", string0);
    }

    @Test
    public void test10() throws Throwable {
        Integer integer0 = (-2363);
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>((Integer) null, integer0, (Integer) null,
                ";N8$=Z.+%YZ:j", "");
        Integer integer1 = newTernaryNode0.getLeft();
        assertNull(integer1);
        assertEquals(";N8$=Z.+%YZ:j", newTernaryNode0.getLeftStr());
        assertEquals("", newTernaryNode0.getRightStr());
    }

    @Test
    public void test11() throws Throwable {
        Integer integer0 = 892;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer0,
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV");
        NewTernaryNode<Object> newTernaryNode1 = new NewTernaryNode<Object>(newTernaryNode0, "BP*t,Zo.my|DV",
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV", (String) null);
        NewTernaryNode newTernaryNode2 = (NewTernaryNode) newTernaryNode1.getLeft();
        assertEquals("BP*t,Zo.my|DV", newTernaryNode2.getRightStr());
    }

    @Test
    public void test12() throws Throwable {
        Integer integer0 = 892;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer0,
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV");
        NewTernaryNode<Object> newTernaryNode1 = new NewTernaryNode<Object>(newTernaryNode0, "BP*t,Zo.my|DV",
                "BP*t,Zo.my|DV", "BP*t,Zo.my|DV", (String) null);
        String string0 = newTernaryNode1.getRightStr();
        assertNull(string0);
    }

    @Test
    public void test13() throws Throwable {
        Integer integer0 = 0;
        NewTernaryNode<Integer> newTernaryNode0 = new NewTernaryNode<Integer>(integer0, integer0, integer0, "", "");
        String string0 = newTernaryNode0.getLeftStr();
        assertEquals("", string0);
    }
}
