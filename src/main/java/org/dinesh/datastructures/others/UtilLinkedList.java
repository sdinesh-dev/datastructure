package org.dinesh.datastructures.others;

import java.util.LinkedList;

public class UtilLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        linkedList.addFirst(1);
        linkedList.addLast(11);
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}