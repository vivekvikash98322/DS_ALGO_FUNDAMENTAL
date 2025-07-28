package com.cozzycoder.revision.dataStructure.LinkedList;

public class RemoveDuplicateFromSorted {

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(GenerateNodes.generateNodes(new int[] {1,1})));
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode fastNode = head.next;
        ListNode slowNode = head;
        ListNode prev = new ListNode(-101, head);
        head = prev;

        while (fastNode != null) {

            if(fastNode.val == slowNode.val) {
                while (fastNode != null && fastNode.val == slowNode.val) {
                    fastNode = fastNode.next;
                }

                prev.next = fastNode;
                slowNode = fastNode;

                if(fastNode != null ){
                    fastNode = fastNode.next;
                }
                continue;
            }

            slowNode = slowNode.next;
            fastNode = fastNode.next;
            prev = prev.next;
        }

        return head.next;
    }
}
