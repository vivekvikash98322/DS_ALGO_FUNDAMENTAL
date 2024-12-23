package com.cozzycoder.dataStructure.linkedList;

public class SwappingKNodeStartAndEnd {

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, null));
        int k = 1;

        ListNode kthNode = head;
        ListNode startKNode = head;
        ListNode prevStartKNode = new ListNode(0, head);
        ListNode dummyHead  = prevStartKNode;

        for (int i = 1; i < k; i++){
            prevStartKNode = prevStartKNode.next;
            startKNode = startKNode.next;
        }

        for (int i = 0; i < k ; i++) {
            kthNode = kthNode.next;
        }

        ListNode fastNode = kthNode;
        ListNode slowNode = head;
        ListNode endPrev = null;
        while(fastNode != null) {
            endPrev = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        if(endPrev == startKNode){
            ListNode temp = slowNode.next;
            slowNode.next = startKNode;
            startKNode.next = temp;
            prevStartKNode.next = slowNode;

        }else {
            ListNode temp = startKNode.next;
            startKNode.next = slowNode.next;
            startKNode.next = temp;
            prevStartKNode.next = slowNode;
            endPrev.next = startKNode;
        }



        System.out.println(dummyHead);

    }
}
