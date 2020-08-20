package com.pnm.linkedlist.singlylinkedlist;

public class FindInterSectionOfTwoSortedList extends CustomLinkedList{
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(10);
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertEnd(new Node(40));
        list.listInsertEnd(new Node(60));


        CustomLinkedList list2 = new CustomLinkedList();

        list2.head = new Node(20);
        list2.listInsertEnd(new Node(40));
        list2.listInsertEnd(new Node(60));
        list2.listInsertEnd(new Node(80));


        findInterSection(list.head,list2.head);
        findInterSectionPoint(list.head,list2.head);
    }
    public static void findInterSection(Node node1,Node node2){
        Node list1 = node1;
        Node list2 = node2;

        while (list1 !=null && list2!=null){

            if(list1.data <list2.data)
                list1=list1.next;
            else if(list2.data < list1.data)
                list2=list2.next;
            else{
                System.out.print(list1.data+" ");
                list1=list1.next;
                list2=list2.next;
            }
        }
    }

    public static void findInterSectionPoint (Node node1,Node node2){
        Node list1 = node1;
        Node list2 = node2;

        while (list1 !=null && list2!=null){

            if(list1.data <list2.data)
                list1=list1.next;
            else if(list2.data < list1.data)
                list2=list2.next;
            else{
                System.out.println("\n  Intersection point is : "+list1.data);
                return;
            }
        }
    }
}
