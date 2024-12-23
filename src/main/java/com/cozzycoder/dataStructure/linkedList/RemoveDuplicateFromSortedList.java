package com.cozzycoder.dataStructure.linkedList;

public class RemoveDuplicateFromSortedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1,new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))))));

        if(head == null || head.next == null) System.out.println(head);

        ListNode slowNode = head;
        ListNode prev = new ListNode(0, head);
        head = prev;
        while(slowNode != null && slowNode.next != null) {

            if(slowNode.val == slowNode.next.val){
                ListNode temp = slowNode;
                while(temp != null && temp.val == slowNode.val){
                    temp = temp.next;
                }

                prev.next = temp;
                slowNode = temp;
                continue;
            }

            prev = slowNode;
            slowNode = slowNode.next;
        }

        System.out.println(head);    }
}
