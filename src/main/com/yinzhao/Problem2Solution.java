package com.yinzhao;

/**
 * Created by zhaoyongwang on 2017/11/7.
 */
public class Problem2Solution {
    public ListNode addTwoNumbers(ListNode node1, ListNode node2) {
        return addTwoNumbers(node1, node2, 0);
    }

    private ListNode addTwoNumbers(ListNode node1, ListNode node2, int add) {
        if (node1 == null && node2 == null) {
            if (add != 0) {
                return new ListNode(add);
            }
            return null;
        }

        if (node1 == null || node2 == null) {
            return node1 == null ? addOneNullNode(node2, add) : addOneNullNode(node1, add);
        }

        int value = node1.getVal() + node2.getVal() + add;
        int first = value / 10;
        int second = value % 10;

        ListNode next = new ListNode(second);
        next.setNext(addTwoNumbers(node1.getNext(), node2.getNext(), first));

        return next;
    }

    private ListNode addOneNullNode(ListNode node, int add) {
        if (node == null) {
            if (add != 0) {
                return new ListNode(add);
            }
            return null;
        }

        int value = node.getVal() + add;
        int first = value / 10;
        int second = value % 10;
        node.setVal(second);
        if (first > 0) {
            node.setNext(addOneNullNode(node.getNext(), first));
        }
        return node;
    }
}
