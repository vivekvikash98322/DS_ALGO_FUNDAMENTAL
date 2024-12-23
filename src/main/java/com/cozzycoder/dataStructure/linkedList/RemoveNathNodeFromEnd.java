package com.cozzycoder.dataStructure.linkedList;

public class RemoveNathNodeFromEnd {

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, null));
        int n = 2;
        if(head == null || head.next == null) System.out.println(head);

        ListNode fastNode = head;
        for(int i = 0; i < n; i++){
            fastNode = fastNode.next;
        }

        ListNode slowNode = head;
        ListNode prev = null;
        while(fastNode != null){
            prev = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        prev.next = slowNode.next;
        slowNode.next = null;

        System.out.println(head);
    }
}
