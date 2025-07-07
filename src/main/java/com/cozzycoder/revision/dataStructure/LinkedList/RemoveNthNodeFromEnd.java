package com.cozzycoder.revision.dataStructure.LinkedList;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        System.out.println(removeNthFromEnd(GenerateNodes.generateNodes(new int[] {1,2}), 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null) {
            return null;
        }

        ListNode fastNode = head;
        ListNode slowNode = head;
        ListNode prev = null;

        while (n > 0) {
            fastNode = fastNode.next;
            n--;
        }


        while(fastNode != null) {
            prev = slowNode;
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        if(prev != null){
            return slowNode.next;
        }

        prev.next = slowNode.next;

        return head;

    }
}
