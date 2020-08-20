package com.pnm.linkedlist.singlylinkedlist;

public class FindLoopInLinkedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.head=new Node(10);
        Node node2= new Node(20);
        Node node3= new Node(30);
        Node node4= new Node(40);
        Node node5= new Node(50);

        list.head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node2;
        
        //list.printList();
        findLoop(list.head);
    }

    private static void findLoop(Node head) {
        Node fastPtr=head,slowPtr=head;

        while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(fastPtr == slowPtr){
                System.out.println("Loop detected in the list");
                findLoopLegth(slowPtr);
                return;
            }
        }
    }

    private static void findLoopLegth(Node givenNode){
        int count=1;
        Node temp = givenNode;
        while(temp.next != givenNode){
            count++;
            temp=temp.next;
        }
        System.out.println("Length of the loop is : "+count);
    }
}
