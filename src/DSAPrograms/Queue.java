package DSAPrograms;

import java.util.Arrays;

public class Queue {
    int Size=5;
    int items[]=new int[Size];
    int front,rear;

    Queue(){
        front=-1;
        rear=-1;
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.enQueue(5);
        q.enQueue(757);
        q.enQueue(25);
        q.enQueue(7);
        q.enQueue(4);
        System.out.println("queue is");
        q.printqueue();
        q.DeQueue();

    }

    private void DeQueue() {
        int element;
        if (isEmpty())
            System.out.println("Queue is empty");
        else{
            element=items[front];
            // if the queue has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            }else {
                // mark next element as the front
                front++;
            }
        }

    }

    private boolean isEmpty() {
        return front==-1 ;
    }

    private void printqueue() {
        System.out.println(Arrays.toString(items));
    }

    private void enQueue(int element) {
        // if queue is full
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }

            rear++;

            items[rear] = element;
            System.out.println("Insert " + element);
        }

    }

    private boolean isFull() {
        return (front==0 && rear==Size-1);

    }
}
