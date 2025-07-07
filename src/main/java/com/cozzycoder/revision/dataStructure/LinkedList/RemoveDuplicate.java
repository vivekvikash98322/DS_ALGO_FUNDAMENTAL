package com.cozzycoder.revision.dataStructure.LinkedList;

public class RemoveDuplicate {

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(-1, new ListNode(-1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))))))));
    }


    public static ListNode deleteDuplicates(ListNode head) {

        ListNode sentialNode = new ListNode(-101, head);
        ListNode fastNode = head;

        while (fastNode != null) {

            if(sentialNode.val == fastNode.val) {
                sentialNode.next =  fastNode.next;
                fastNode = fastNode.next;
                continue;
            }

            fastNode = fastNode.next;
            sentialNode = sentialNode.next;
        }

        return head;
    }
}
