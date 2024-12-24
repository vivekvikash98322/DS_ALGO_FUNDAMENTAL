package com.cozzycoder.dataStructure.linkedList;

public class RemoveMatchingElement {

    public static void main(String[] args) {

        ListNode head = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, null))));
        int val = 7;

        ListNode dummyNode = head;
        ListNode prev = null;
        while(dummyNode != null){

            if(prev == null && dummyNode.val == val){
                head = dummyNode.next;
                dummyNode = dummyNode.next;
                continue;
            } else if(dummyNode.val == val){
                ListNode temp = dummyNode.next;
                prev.next = temp;
                dummyNode.next = null;
                dummyNode = prev;
            }

            prev = dummyNode;
            dummyNode = dummyNode.next;
        }
    }
}
