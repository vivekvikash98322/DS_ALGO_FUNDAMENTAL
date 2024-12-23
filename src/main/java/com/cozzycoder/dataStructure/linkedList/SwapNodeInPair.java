package com.cozzycoder.dataStructure.linkedList;

public class SwapNodeInPair {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));

        ListNode prev = listNode;
        ListNode dummyNode = listNode.next;

        while(listNode != null && listNode.next != null) {
            prev.next = listNode.next;
            prev = listNode;
            ListNode temp = listNode.next.next;
            listNode.next.next = listNode;
            listNode.next = temp;
            listNode = temp;
        }

        System.out.println(dummyNode);
    }
}
