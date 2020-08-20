package com.pnm.test;

import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        LinkedList list2 = new LinkedList();
        list2.add(4);
        list2.addAll(list);

        System.out.println(list.spliterator().trySplit());
        System.out.println(list2);

    }
}

