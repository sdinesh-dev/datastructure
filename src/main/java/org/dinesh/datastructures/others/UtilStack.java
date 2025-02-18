package org.dinesh.datastructures.others;

import java.util.Stack;

public class UtilStack {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(30);
        intStack.pop();
        intStack.push(50);
        intStack.push(70);
        intStack.push(90);
        intStack.push(25);
        intStack.add(35);
        intStack.add(2,15);
        System.out.println(intStack);
        System.out.println(intStack.peek());
    }
}
