package com.cozzycoder.revision.dataStructure.LinkedList;

public class SwapNodeInPair_2 {

    public static void main(String[] args) {
        System.out.println(swapPairs(GenerateNodes.generateNodes(new int[]{1,2,3,4})));
    }

    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = head;
        ListNode fast = head;
        head = head.next;

        while (fast != null && fast.next != null) {

            prev.next = fast.next;
            prev = fast;
            ListNode next = fast.next.next;
            fast.next.next = fast;
            fast = next;
            prev.next = fast;
        }

        return head;
    }

}
