package com.cozzycoder.revision.dataStructure.LinkedList;

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode secondNode = new ListNode(2);
        secondNode.next = new ListNode(0, new ListNode(-4, secondNode));
        ListNode head = new ListNode(3, secondNode);
        System.out.println(hasCycle(head));
    }


    public static boolean hasCycle(ListNode head) {

        ListNode slowNode = head;
        ListNode fastNode = head;

        while(fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode) {
                return true;
            }
        }

        return false;
    }
}
