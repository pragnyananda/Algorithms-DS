package com.pnm.linkedlist.singlylinkedlist;

import java.util.HashSet;

public class RemoveDuplicateFromUnsortedList {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(10);
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(10));
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(40));
        list.listInsertEnd(new Node(30));
        list.listInsertEnd(new Node(10));

        list.printList();
        removeDuplicate(list.head);
        list.printList();

    }

    private static void removeDuplicate(Node head) {
        HashSet<Integer> hs = new HashSet<>();

        Node curr = head;
        Node prev = null;
        while (curr != null)
        {
            int curval = curr.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = curr.next;
            } else {
                hs.add(curval);
                prev = curr;
            }
            curr = curr.next;
        }
    }
}

