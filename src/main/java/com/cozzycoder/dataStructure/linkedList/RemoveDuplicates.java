package com.cozzycoder.dataStructure.linkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ListNode headNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));

        ListNode slowNode = headNode;
        ListNode fastNode = headNode.next;

        while(fastNode != null) {

            if(fastNode.val == slowNode.val){
                slowNode.next = fastNode.next;
                fastNode  = fastNode.next;
                continue;
            }

            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

    }
}
