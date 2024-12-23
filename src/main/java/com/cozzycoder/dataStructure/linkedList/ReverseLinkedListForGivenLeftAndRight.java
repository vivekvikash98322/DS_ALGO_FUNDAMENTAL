package com.cozzycoder.dataStructure.linkedList;

public class ReverseLinkedListForGivenLeftAndRight {

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        int left = 1;
        int right = 2;

        ListNode dummyNode = new ListNode(0, head);
        ListNode runningNode = head;

        for(int i = 1; i < left; i++){
            runningNode = runningNode.next;
            dummyNode = dummyNode.next;
        }

        ListNode prev = null;

        for(int i = left; i <= right; i++){
            ListNode temp = runningNode.next;
            runningNode.next= prev;
            prev = runningNode;
            runningNode = temp;
        }

        if(runningNode != null){
            dummyNode.next.next = runningNode;
        }

        dummyNode.next = prev;

        System.out.println(dummyNode);
    }
}
