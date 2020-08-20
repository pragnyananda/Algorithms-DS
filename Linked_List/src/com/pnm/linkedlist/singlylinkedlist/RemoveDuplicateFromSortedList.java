package com.pnm.linkedlist.singlylinkedlist;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(10);
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(40));
        list.listInsertEnd(new Node(40));

        list.printList();
        removeDuplicate(list.head);
        list.printList();

    }
    public static void removeDuplicate(Node head){
        Node curr = head;
        while(curr !=null){
          Node temp= curr;

          while(temp!=null && temp.data==curr.data)
              temp=temp.next;

          curr.next= temp;
          curr=curr.next;
        }
    }
}
