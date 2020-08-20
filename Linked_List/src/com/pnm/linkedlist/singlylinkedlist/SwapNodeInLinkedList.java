package com.pnm.linkedlist.singlylinkedlist;

public class SwapNodeInLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(10);
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(10));
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(40));
        list.listInsertEnd(new Node(30));
        list.listInsertEnd(new Node(10));

        list.printList();
        getSwappedList(list.head,2,2);
        list.printList();

        pairWiseSwap(list.head);
        list.printList();

    }

    public static void getSwappedList(Node head, int srcIdx, int dstnIdx) {
        Node temp = head;
        int count = 0 , srcData = 0, dstnData = 0;
        if(srcIdx == dstnIdx)
        {
            System.out.println("Swapping indices are same!");
            return;
        }

        while(temp!=null){
            if(count == srcIdx)
                srcData=temp.data;
            else if(count == dstnIdx)
                dstnData= temp.data;
            count++;
            temp=temp.next;
        }
        int len = count-1;
        temp=head;
        count=0;
        if(dstnIdx>len || srcIdx < 0){
            System.out.println("Swapping index is not valid !!");
            return;
        }
        while (temp !=null){
            if(count == srcIdx)
                temp.data = dstnData;
            else if(count == dstnIdx)
                temp.data = srcData;
            count++;
            temp=temp.next;
        }

        System.out.println("Elements swapped!!");
    }

    public static void pairWiseSwap(Node head){
        Node temp = head;

        while(temp!=null && temp.next!=null){

            int var = temp.data;
            temp.data =  temp.next.data;
            temp.next.data = var;

            temp= temp.next.next;
        }
    }
}
