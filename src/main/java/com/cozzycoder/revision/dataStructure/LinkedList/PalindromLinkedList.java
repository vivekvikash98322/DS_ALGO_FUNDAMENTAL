package com.cozzycoder.revision.dataStructure.LinkedList;

public class PalindromLinkedList {

    public static void main(String[] args) {
        System.out.println(isPalindrome(GenerateNodes.generateNodes(new int[] {1, 0, 1})));
    }

    public static boolean isPalindrome(ListNode head) {

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        int counter = 1 ;
        while (fast != null && fast.next != null) {
            counter += 2;
            ListNode next = slow.next;
            fast = fast.next.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        if(counter %2 != 0) {
            slow = slow.next;
        }

        while (slow != null && prev != null) {
            if(slow.val != prev.val) {
                return false;
            }

            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }
}
