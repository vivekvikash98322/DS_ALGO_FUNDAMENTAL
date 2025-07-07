package com.cozzycoder.revision.dataStructure.LinkedList;

import lombok.Data;
import lombok.ToString;

@Data
public class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode listNode) {
        this(val);
        this.next = listNode;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
