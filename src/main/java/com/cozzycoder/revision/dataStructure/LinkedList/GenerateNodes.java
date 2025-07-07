package com.cozzycoder.revision.dataStructure.LinkedList;

public class GenerateNodes {

    public static ListNode generateNodes(int [] nodes) {
        ListNode head = null;
        for (int val : nodes) {
            if(head == null) {
                head = new ListNode(val, null);
                continue;
            }

            ListNode dummy = head;

            while (dummy.next != null) {
                dummy = dummy.next;
            }

            dummy.next = new ListNode(val, null);
        }

        return head;
    }
}
