package com.pnm.linkedlist.singlylinkedlist;

public class CountGivenNumberLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(1);
        list.listInsertHead(new Node(10));
        list.listInsertHead(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertMiddle(new Node(40),20);
        list.listInsertEnd(new Node(20));

        list.printList();

        getCountGivenNumber(list.head,30);
    }

    private static void getCountGivenNumber(Node head,int givenInt) {
        int count=0;
        Node curr= head;
        while(curr!=null){
            if(curr.data == givenInt )
                count++;
            curr=curr.next;
        }
        System.out.println("\n"+givenInt +" Occured "+count+" times in the list");

    }
}
