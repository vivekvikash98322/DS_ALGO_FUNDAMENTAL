package com.cozzycoder.revision.dataStructure.LinkedList;

public class ReverseLinkedListFromToPosition {

    public static void main(String[] args) {
        System.out.println(reverseBetween(GenerateNodes.generateNodes(new int [] {3, 5}), 1, 2));
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        int tempLeft = 1;
        ListNode prev = null;
        ListNode fastNode = head;
        while(tempLeft < left){
            prev = fastNode;
            fastNode = fastNode.next;
            tempLeft++;

        }

        ListNode leftprev = null;
        ListNode leftNode= fastNode;
        while (tempLeft <= right) {
            ListNode nextnode = fastNode.next;
            fastNode.next = leftprev;
            leftprev = fastNode;
            fastNode = nextnode;
            tempLeft++;
        }

        leftNode.next = fastNode;

        if(prev == null) {
            return leftprev;
        }


        prev.next = leftprev;
        return head;

    }
}
