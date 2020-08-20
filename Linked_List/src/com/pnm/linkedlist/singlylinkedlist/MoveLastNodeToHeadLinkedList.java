package com.pnm.linkedlist.singlylinkedlist;

public class MoveLastNodeToHeadLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(10);
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(10));
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(40));
        list.listInsertEnd(new Node(30));
        list.listInsertEnd(new Node(50));

        list.printList();

        Node node = moveLastNodetoHead(list.head);
        while(node != null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println("\n");
    }

    public static Node moveLastNodetoHead(Node head){
        Node prev = null,curr=head;

        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;

        curr.next=head;
        head=curr;

        return head;
    }
}
