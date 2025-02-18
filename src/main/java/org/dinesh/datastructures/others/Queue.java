package org.dinesh.datastructures.others;

public class Queue {
    public int front;
    public int rear;
    public int size;
    public int[] arr = new int[5];

    Queue(){
        this.front = 0;
        this.rear = -1;
        size = 0;
    }



    public void enqueue(int data){
        //if(size<arr.length){
            rear = (rear+1) % arr.length;
            arr[rear] = data;
            size++;
//        }else{
//            System.out.println("Queue is Full");
//        }

    }

    public int dequeue(){
        int data = arr[front];
        front = (front+1) % arr.length;
        size--;
        return data;
    }

    public void printValues(){
        for(int i=front;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printValues();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(70);
        queue.printValues();
    }


}
