package com.cozzycoder.revision.dataStructure.LinkedList;

import java.util.List;

public class ReverseNodeInEvenLength {

    public static void main(String[] args) {
        System.out.println(reverseEvenLengthGroups(GenerateNodes.generateNodes(new int[] {1, 1, 0, 6, 5})));
    }

    public static ListNode reverseEvenLengthGroups(ListNode head) {

        ListNode traverseNode = head;
        
        ListNode fast = head;
        ListNode prev = null;
        int group = 0;

        while (fast != null) {

            group++;
            ListNode dummyNode = fast;
            ListNode tempprev = null;
            int counter  = 0;
            while(dummyNode != null && counter < group) {
                tempprev = dummyNode;
                dummyNode = dummyNode.next;
                counter++;

            }


            if((counter % 2 == 0)) {

                int temp = 0;
                ListNode prevNode = null;

                while(temp < counter && fast != null) {
                    ListNode nextNode = fast.next;
                    fast.next = prevNode;
                    prevNode = fast;
                    fast = nextNode;
                    temp++;
                }

                ListNode lastNode = prev.next;
                lastNode.next = fast;
                prev.next = prevNode;
                prev = lastNode;
                continue;
            }

            fast = dummyNode;
            prev = tempprev;

        }

        return head;
    }
}
