package com.yinzhao;

public class Problem2Solution {
    public ListNode addTwoNumbers(ListNode node1, ListNode node2) {

        ListNode dummyNode = new ListNode(0);

        int carrier = 0;
        ListNode fNode = node1;
        ListNode sNode = node2;
        ListNode curNode = dummyNode;

        while (fNode != null || sNode != null) {
            int sum = ((fNode != null) ? fNode.getVal() : 0) + ((sNode != null) ? sNode.getVal() : 0) + carrier;

            carrier = sum / 10;
            int val = sum % 10;
            ListNode node = new ListNode(val);
            curNode.setNext(node);
            curNode = node;

            fNode = fNode != null ? fNode.getNext() : null;
            sNode = sNode != null ? sNode.getNext() : null;
        }

        if (carrier != 0) {
            curNode.setNext(new ListNode(carrier));
        }

        return dummyNode.getNext();

//        return addTwoNumbers(node1, node2, 0);
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
