package com.cozzycoder.revision.dataStructure.LinkedList;

public class OddEvenLinkList {

    public static void main(String[] args) {
        System.out.println(oddEvenList(GenerateNodes.generateNodes(new int[] {1, 2, 3, 4, 5, 6, 7})));
    }

    public static ListNode oddEvenList(ListNode head) {

        ListNode oddPrev = head;
        ListNode fast = head.next;
        ListNode prev = head;
        int index = 2;
        while (fast != null) {

            if(index %2 != 0) {
                ListNode nextNode = oddPrev.next;
                ListNode fastNextNode = fast.next;
                prev.next = fastNextNode;
                fast.next = nextNode;
                oddPrev.next = fast;
                oddPrev = fast;
                fast = fastNextNode;
                index++;

                continue;
            }

            prev = fast;
            fast = fast.next;
            index++;
        }

        return head;
    }
}
