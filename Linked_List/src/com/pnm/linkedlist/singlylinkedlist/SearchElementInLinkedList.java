package com.pnm.linkedlist.singlylinkedlist;

public class SearchElementInLinkedList {

    private boolean searchElement(Node head, int searchElement) {
        Node temp=head;
        while(temp!=null){
            if(searchElement == temp.data)
                return true;
            else
                temp=temp.next;
        }
        //throw new NoSuchElementException("No Such Element found!!");
        return false;
    }

    public static void main(String[] args) {
        SearchElementInLinkedList searchElementInLinkedList = new SearchElementInLinkedList();
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(1);
        list.listInsertHead(new Node(10));
        list.listInsertHead(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertMiddle(new Node(40),20);
        list.listInsertEnd(new Node(50));

        list.printList();
        boolean searchResult = searchElementInLinkedList.searchElement(list.head,100);
        System.out.println("\nElement entered exist status : "+searchResult);
    }
}
