package com.cozzycoder.dataStructure.linkedList;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        ListNode slowPointer= listNode;
        ListNode fastPointer= listNode;

        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        System.out.println(slowPointer.val);
    }
}
