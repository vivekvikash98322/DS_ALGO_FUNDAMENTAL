package com.cozzycoder.revision.dataStructure.LinkedList;

public class MaximumTwinSum {

    public static void main(String[] args) {

        System.out.println(pairSum(GenerateNodes.generateNodes(new int [] {47,22,81,46,94,95,90,22,55,91,6,83,49,65,10,32,41,26,83,99,14,85,42,99,89,69,30,92,32,74,9,81,5,9})));
    }

    public static int pairSum(ListNode head) {

        ListNode prev = null;
        ListNode fastNode = head;
        ListNode slowNode = head;
        int size = 0;

        while(fastNode != null && fastNode.next != null) {
            size += 2;
            ListNode node = slowNode.next;
            fastNode = fastNode.next.next;
            slowNode.next = prev;
            prev = slowNode;
            slowNode = node;
        }

        head.next = slowNode;
        head = prev;

        ListNode gapNode = head;
        int middle = size/2;
        while(middle > 0) {
            gapNode = gapNode.next;
            middle--;
        }

        int max = 0;
        while(gapNode != null){
            max = Math.max(max, gapNode.val + head.val);
            gapNode = gapNode.next;
            head = head.next;
        }

        return max;
    }
}
