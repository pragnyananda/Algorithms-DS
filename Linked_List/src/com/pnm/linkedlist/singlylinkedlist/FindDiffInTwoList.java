package com.pnm.linkedlist.singlylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class FindDiffInTwoList {
    public static void main(String[] args) {
        LinkedList<String> list =  new LinkedList();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("D");
        list.add("B");
        list.add("C");
        list.add("D");

        LinkedList<String> list2 =  new LinkedList();
        list2.add("D");
        list2.add("B");
        list2.add("A");

        list.removeAll(list2);
        System.out.println(list);
    }
}
