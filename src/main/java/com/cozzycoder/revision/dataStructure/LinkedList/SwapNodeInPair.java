package com.cozzycoder.revision.dataStructure.LinkedList;

public class SwapNodeInPair {

    public static void main(String[] args) {
        System.out.println(swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))))).toString());
    }

    public static ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head;
        head = head.next;
        while(cur != null && cur.next != null) {
            prev.next = cur.next;
            prev = cur;
            ListNode nextNode = cur.next.next;
            cur.next.next = cur;
            cur = nextNode;
            prev.next = cur;
        }

        return head;
    }
}
