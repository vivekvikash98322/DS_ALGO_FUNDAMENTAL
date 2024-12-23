package com.cozzycoder.dataStructure.linkedList;

import java.util.List;

public class ReverseEvenLengthGrp {

    public static void main(String[] args) {
        ListNode head = new ListNode(5, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(9, new ListNode(1, new ListNode(7,
        new ListNode(3, new ListNode(8, new ListNode(4, null))))))))));


        int grpCounter = 1;
        ListNode dummyNode = head.next;
        ListNode prevNode = head;
        while(dummyNode != null){

            grpCounter++;

            ListNode temp = dummyNode;
            int counter = 0;
            ListNode tempPrv = null;
            while(temp != null &&  counter < grpCounter){
                counter++;
                tempPrv = temp;
                temp = temp.next;
            }


            if(counter % 2 == 0){
                ListNode node = dummyNode;
                ListNode prev = null;
                while(node != null && counter != 0){
                    ListNode dummTemp = node.next;
                    node.next = prev;
                    prev = node;
                    node = dummTemp;
                    counter--;
                }

                ListNode dummyTemp = prevNode.next;
                prevNode.next = prev;
                dummyTemp.next = node;
                prevNode = dummyTemp;
                dummyNode = node;
                continue;

            }

            prevNode = tempPrv;
            dummyNode = temp;

        }

    }
}
