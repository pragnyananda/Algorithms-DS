package com.pnm.linkedlist.singlylinkedlist;

public class FindMiddleOfLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(1);
        list.listInsertHead(new Node(10));
        list.listInsertHead(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertMiddle(new Node(40),20);
        list.listInsertEnd(new Node(50));

        list.printList();

        getMiddleofLinkedList(list.head);
    }

    private static void getMiddleofLinkedList(Node head) {
        Node fastPtr = head;
        Node slowPtr= head;

        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
        }
        System.out.println("\nMiddle value of the list is : "+slowPtr.data);
    }

}
