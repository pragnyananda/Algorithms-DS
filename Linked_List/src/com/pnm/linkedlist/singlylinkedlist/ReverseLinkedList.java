package com.pnm.linkedlist.singlylinkedlist;

public class ReverseLinkedList {
    Node head;

    public Node reversedLinkedList(Node head){
        Node prev =null;
        Node curr =head;
        Node next =null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }

    public void printList(Node head){
        if(head ==null){
            System.out.println("List is empty");
        }

        Node ptr= head;
        while(ptr !=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList rlist = new ReverseLinkedList();

        rlist.head=new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        rlist.head.next =node2;
        node2.next =node3;
        node3.next=node4;

        System.out.print("Linked List : ");
        rlist.printList(rlist.head);

        Node reversedHead = rlist.reversedLinkedList(rlist.head);
        System.out.print("\nReversed Linked List : ");
        rlist.printList(reversedHead);
    }
}
