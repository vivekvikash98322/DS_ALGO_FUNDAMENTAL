package com.cozzycoder.dataStructure.linkedList;

public class MaximumTwinSum {

    public static void main(String[] args) {
        ListNode head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1, null))));

        ListNode fastNode = head;
        ListNode slowNode = head;
        ListNode prev = null;
        int counter = 0;

        while (fastNode != null && fastNode.next != null) {
            counter += 2;
            fastNode = fastNode.next.next;
            ListNode temp = slowNode.next;
            slowNode.next = prev;
            prev =  slowNode;
            slowNode = temp;
        }

        head.next = slowNode;
        head = prev;

        fastNode = head;
        slowNode = head;
        for (int i = 0; i < (counter / 2); i++ ) {
            fastNode = fastNode.next;
        }


        int max = 0;
        while (fastNode != null){
            max = Math.max(max, fastNode.val + slowNode.val);
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        System.out.println(max);

    }
}
