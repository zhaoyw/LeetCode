package com.yinzhao;

/**
 * Created by zhaoyongwang on 2017/11/7.
 */
public class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode setNext(int next) {
        this.next = new ListNode(next);
        return this;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode setNext(ListNode nextNode) {
        this.next = nextNode;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ListNode) {
            ListNode node = (ListNode) obj;

            boolean equals = (val == node.getVal());
            if (next != null) {
                equals = equals && next.equals(node.getNext());
            }

            return equals;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(val);
        if (next != null) {
            builder.append("->");
            builder.append(next);
        }
        return builder.toString();
    }
}
