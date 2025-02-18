package org.dinesh.datastructures.others;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedList {

    Node head = null;

    public void add(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
        } else {
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printValues(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data){
        Node current = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.addFirst(1);
        list.printValues();
        list.delete(9);
        System.out.println();
        list.printValues();
    }
}
