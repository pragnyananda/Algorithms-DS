package com.pnm.linkedlist.singlylinkedlist;

import java.util.Stack;

public class FindPalindromeInLinkedList {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.head = new Node(10);
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(30));
        list.listInsertEnd(new Node(20));
        list.listInsertEnd(new Node(10));

        list.printList();

        isListPallindromeUsingStack(list.head);
        isListPalindromeUsingReverse(list.head);
    }

    private static void isListPallindromeUsingStack(Node head) {
        Node temp = head;
        Stack<Integer> stack= new Stack<>();

        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp = head;

        while(!stack.empty()){
            if(stack.pop()!=temp.data){
                System.out.println("List is not palindrome!");
                return;
            }
            temp=temp.next;
        }
        System.out.println("\nHurray ! List is palindrome !!!");
    }

    private static void isListPalindromeUsingReverse(Node head){
        Node temp= head;
        ReverseLinkedList reverseLinkedList= new ReverseLinkedList();
        Node reversedList = reverseLinkedList.reversedLinkedList(head);

        while(temp!=null){
            if(temp.data!=reversedList.data){
                System.out.println("List is not palindrome!");
                return;
            }
            temp = temp.next;
            reversedList = reversedList.next;
        }
        System.out.println("\nHurray ! String is palindrome, verified using reverse");

    }
}
