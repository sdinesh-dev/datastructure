package org.dinesh.datastructures.others;

public class Stack {
    int[] arr = new int[5];
    int size;
    int top;

    Stack(){
        size = arr.length;
        top = -1;
    }

    public void push(int data){
        if(!isFull()){
            arr[++top] = data;
        }else{
            System.out.println("Stack OverFlow");
        }
    }

    public int pop(){
        if(!isEmpty())
            return arr[top--];
        else
            System.out.println("Stack UnderFlow");
        return 0;
    }

    public int peek(){
        return arr[top];
    }

    public void printStack(){
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == (size -1);
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(35);
        System.out.println(stack.pop());
        stack.push(20);
        System.out.println(stack.pop());
        stack.printStack();
    }

}
