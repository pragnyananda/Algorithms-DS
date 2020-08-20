package com.pnm.linkedlist.singlylinkedlist;

public class CustomLinkedList {

    Node head;

    public void printList(){
        Node node = head;
        while(node != null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println("\n");
    }

    public void listInsertHead(Node newNode){
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next=head;
        head = newNode;
    }

    public void listInsertMiddle(Node newNode, int pos){
        if(head ==null){
            System.out.println("List is empty, adding the value to head");
            head = newNode;
        }

        Node ptr = head;
        Node temp = null;
        int val = 0;
        try {
            while (ptr.data != pos)
                ptr = ptr.next;
        }catch (NullPointerException e){
            System.out.println("\nException Occured! Value is not there in the list ");
            e.printStackTrace();
        }
        temp = ptr.next;
        ptr.next = newNode;
        newNode.next=temp;
    }

    public void listInsertEnd(Node newNode){
        if(head == null){
            System.out.println("List is empty, adding the value to head");
            head=newNode;
        }

        Node ptr = head;
        while(ptr.next !=null)
            ptr=ptr.next;

        ptr.next=newNode;
        newNode.next=null;
    }

    public void deleteNode (Node head, int val){
        Node q = head;
        Node p = head.next;

        //Delete form the head
        if(q.data == val){
            this.head=p;
        }
        else{
            while(p.data!=val){
                p=p.next;
                q=q.next;
            }
            if(p.next ==null){
                q.next=null;
            }
            else {
                q.next=p.next;
            }
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        list.head.next = node2;
        node2.next= node3;

        System.out.print("linked list is : ");
        list.printList();

        list.listInsertHead(new Node(0));
        System.out.print("\n\nInsertHead - linked list is : ");
        list.printList();

        list.listInsertEnd(new Node(4));
        System.out.print("\nInsertEnd - linked list is : ");
        list.printList();

        // pos value should present in the list data, it will add newNode after pos
        list.listInsertMiddle(new Node(10),1);
        System.out.print("\nInsertmiddle - linked list is : ");
        list.printList();

        //Delete head
        list.deleteNode(list.head,0);
        System.out.print("\n\nDeleteHead - linked list is : ");
        list.printList();

        //Delete end
        list.deleteNode(list.head,4);
        System.out.print("\nDeleteEnd - linked list is : ");
        list.printList();

        //Delete Middle
        list.deleteNode(list.head,10);
        System.out.print("\nDeleteMiddle - linked list is : ");
        list.printList();



    }
}

    class Node {
        int data;
        Node next;

        public Node(int datax) {
            this.data = datax;
            this.next = null;
        }
    }
