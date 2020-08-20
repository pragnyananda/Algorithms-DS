package com.pnm.linkedlist.singlylinkedlist;

public class FindNthNodeInLinkedList {

    private int getNthNodeInLinkedList(Node head, int nodeValue)  {
        int dummy = 1;
        Node temp =head;

        while(temp != null){
            if(dummy==nodeValue)
                return temp.data;
            dummy++;
            temp=temp.next;
        }
        //if we are coming to this line, we will get non-existing value,
        // hence we are returning 0
        return 0;
    }

    public static void main(String[] args)  {
        FindNthNodeInLinkedList findNthNodeInLinkedList = new FindNthNodeInLinkedList();
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(1);
        list.listInsertHead(new Node(10));
        list.listInsertHead(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertMiddle(new Node(40),20);
        list.listInsertEnd(new Node(50));

        list.printList();

        int returnedNodeValue = findNthNodeInLinkedList.getNthNodeInLinkedList(list.head,4);
        System.out.println("\nReturned Node value is : "+returnedNodeValue);
    }
}
