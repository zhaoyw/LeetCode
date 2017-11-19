package com.yinzhao;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestProblem2 {

    private Problem2Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Problem2Solution();
    }

    @Test
    public void should_return_node3_given_node1_add_node2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        ListNode ret = new ListNode(3);

        assertEquals(ret, solution.addTwoNumbers(node1, node2));
    }

    @Test
    public void should_return_node1_plus_node1_given_node5_add_node6() {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(6);

        ListNode ret = new ListNode(1).setNext(1);

        assertEquals(ret, solution.addTwoNumbers(node1, node2));
    }

    @Test
    public void should_return_node3_plus_node6_given_node1_plus2_add_node2_plus4() {
        ListNode node1 = new ListNode(1).setNext(2);
        ListNode node2 = new ListNode(2).setNext(4);

        ListNode ret = new ListNode(3).setNext(6);

        assertEquals(ret, solution.addTwoNumbers(node1, node2));
    }

    @Test
    public void should_return_no_add_ret_given_two_no_need_add_node() {
        ListNode node1 = new ListNode(1).setNext(new ListNode(2).setNext(3));
        ListNode node2 = new ListNode(1).setNext(new ListNode(2).setNext(3));

        ListNode ret = new ListNode(2).setNext(new ListNode(4).setNext(6));

        assertEquals(ret, solution.addTwoNumbers(node1, node2));
    }

    @Test
    public void testNode5_6_add_Node_6_5() {
        ListNode node1 = new ListNode(5).setNext(6);
        ListNode node2 = new ListNode(6).setNext(5);

        ListNode ret = new ListNode(1).setNext(new ListNode(2).setNext(1));

        assertEquals(ret, solution.addTwoNumbers(node1, node2));
    }

    @Test
    public void testOneNullNode() {
        ListNode node1 = new ListNode(5);

        assertEquals(node1, solution.addTwoNumbers(node1, null));
        assertEquals(node1, solution.addTwoNumbers(null, node1));
    }

    @Test
    public void testLongNode() {
        ListNode node1 = new ListNode(6).setNext(new ListNode(6).setNext(new ListNode(6).setNext(6)));

        ListNode ret = new ListNode(2).setNext(new ListNode(3).setNext(new ListNode(3).setNext(new ListNode(3).setNext(1))));

        assertEquals(ret, solution.addTwoNumbers(node1, node1));
    }

    @Test
    public void testDiffLenNode() {
        ListNode node1 = new ListNode(8).setNext(new ListNode(9).setNext(9));
        ListNode node2 = new ListNode(2);

        ListNode ret = new ListNode(0).setNext(new ListNode(0).setNext(new ListNode(0).setNext(1)));
        assertEquals(ret, solution.addTwoNumbers(node1, node2));
    }
}
