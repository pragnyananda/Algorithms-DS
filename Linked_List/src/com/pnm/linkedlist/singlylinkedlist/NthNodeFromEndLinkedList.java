package com.pnm.linkedlist.singlylinkedlist;

public class NthNodeFromEndLinkedList {

    public static void getNthNodeFromEnd(Node head, int nodeValue){
        Node curr = head;
        Node temp = head;
        int dummy = 0;

        if(head==null)
            return;

        while(dummy!=nodeValue){
            if(curr.next == null){
                System.out.println("\nNode value "+nodeValue+" is not in between 0 to length-1, Operation Failed!");
                return;
            }
            curr=curr.next;
            dummy++;
        }

        while (curr.next !=null){
            curr=curr.next;
            temp=temp.next;
        }

        System.out.println("\n"+nodeValue+ "th element from end is : "+temp.data);
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(1);
        list.listInsertHead(new Node(10));
        list.listInsertHead(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertMiddle(new Node(40),20);
        list.listInsertEnd(new Node(50));

        list.printList();

        getNthNodeFromEnd(list.head,6);
    }
}
