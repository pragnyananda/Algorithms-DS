package com.pnm.linkedlist.singlylinkedlist;

public class LengthOfLinkedList {

    public int getListLength(Node head){
        int count = 0;
        Node temp = head;
        while(temp !=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LengthOfLinkedList lengthOfLinkedList = new LengthOfLinkedList();
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(1);
        list.listInsertHead(new Node(10));
        list.listInsertHead(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertMiddle(new Node(40),20);
        list.listInsertEnd(new Node(50));

        list.printList();
        System.out.println("\nLength : "+ lengthOfLinkedList.getListLength(list.head));
    }
}
