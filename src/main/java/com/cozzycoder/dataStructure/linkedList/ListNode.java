package com.cozzycoder.dataStructure.linkedList;


import lombok.ToString;

@ToString()
public class ListNode {

    int val;

    ListNode next;

    public ListNode(int val, ListNode listNode){
        this.next = listNode;
        this.val = val;
    }
}
