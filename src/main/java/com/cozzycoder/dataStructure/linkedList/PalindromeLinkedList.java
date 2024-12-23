package com.cozzycoder.dataStructure.linkedList;

public class PalindromeLinkedList {

    public static void main(String[] args) {

        ListNode head= new ListNode(1, new ListNode(0, new ListNode(1,  null)));

       System.out.println(extracted(head));
    }

    private static boolean extracted(ListNode head) {


        ListNode prev = null;
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            ListNode temp = slowNode.next;
            slowNode.next = prev;
            prev = slowNode;
            slowNode = temp;
        }

        if (fastNode == null) {

        }

        while(slowNode != null && prev != null){
            if(prev.val != slowNode.val){
                return false;
            }

            slowNode = slowNode.next;
            prev = prev.next;
        }

        return true;
    }
}
