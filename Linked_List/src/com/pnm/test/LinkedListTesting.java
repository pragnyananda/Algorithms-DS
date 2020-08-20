package com.pnm.test;

public class LinkedListTesting {
    Node head;

    public static void main(String[] args) {
        LinkedListTesting list = new LinkedListTesting();
        list.head = new Node(1);

        Node node2= new Node(2);
        Node node3= new Node(3);
        Node node4= new Node(4);
        Node node5= new Node(5);

        list.head.next = node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        printList(list.head);

        list.addNodeAtHead(new Node(10));
        list.addNodeAtHead(new Node(20));
        printList(list.head);

        list.addNodeAtEnd(new Node(30));
        list.addNodeAtEnd(new Node(40));
        printList(list.head);

        list.addNodeInMiddle(new Node(50));
        printList(list.head);


    }

    private void addNodeInMiddle(Node newNode) {
        if(head == null){
            System.out.println("List is empty");
            //head= newNode;
            return;
        }

        Node curr = head;
        Node temp;

        while(curr.data!= 2)
            curr=curr.next;

        temp= curr.next;
        curr.next=newNode;
        newNode.next=temp;

    }

    private void addNodeAtEnd(Node newNode) {
        if(head == null){
            System.out.println("List is empty");
            //head= newNode;
            return;
        }
        Node temp = head;

        while(temp.next !=null)
            temp= temp.next;

        temp.next=newNode;
        newNode.next=null;
    }

    private void addNodeAtHead(Node newNode) {
        if(head == null){
            System.out.println("List is empty");
            //head= newNode;
            return;
        }

        newNode.next= head;
        head=newNode;

    }

    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("\n");
    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}