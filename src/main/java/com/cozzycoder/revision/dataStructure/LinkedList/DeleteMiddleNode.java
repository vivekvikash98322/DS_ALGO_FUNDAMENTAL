package com.cozzycoder.revision.dataStructure.LinkedList;

public class DeleteMiddleNode {

    public static void main(String[] args) {
        System.out.println(deleteMiddle(GenerateNodes.generateNodes(new int[]{1,3,4,7,1,2,6})));
    }

    public static ListNode deleteMiddle(ListNode head) {

        ListNode slowNode = head;
        ListNode fastNode = head;
        ListNode prev = null;

        while (fastNode != null && fastNode.next != null) {
            prev = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        prev.next = slowNode.next;

        return head;
    }
}
