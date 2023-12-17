package com.java.algorithm.dsa1;

public class Queue {
    private int size;
    private int front, rear;
    private int[] arr;

    Queue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }

    public void enQueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = x;
            System.out.println("Inserted " + x);
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            int ele = arr[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("DeQueue Value is: " + ele);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            System.exit(1);
        } else {
            for (int i = front; i < rear; i++) {
                System.out.println("\nFront index-> " + front);
                System.out.println("Items -> ");
                for (i = front; i <= rear; i++)
                    System.out.print(arr[i] + "  ");

                System.out.println("\nRear index-> " + rear);
            }
        }
    }

    public Boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    public Boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();

    }

}
