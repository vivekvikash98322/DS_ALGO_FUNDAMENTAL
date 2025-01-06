package com.cozzycoder.dataStructure.linkedList;

public class GroupEvenOdd {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        int index = 1;
        ListNode fastNode = head.next;
        ListNode slowNode = head;
        ListNode prev = head;

        while (fastNode != null) {
            index++;

            if(index % 2 != 0){
                ListNode temp = fastNode.next;
                ListNode slowTemp = slowNode.next;
                slowNode.next = fastNode;
                fastNode.next = slowTemp;
                prev.next = temp;
                slowNode = fastNode;
                fastNode = prev;
            }

            prev = fastNode;
            fastNode = fastNode.next;
        }

        System.out.println(head);

    }
}
