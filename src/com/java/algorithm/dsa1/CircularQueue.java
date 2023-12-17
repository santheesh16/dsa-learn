package com.java.algorithm.dsa1;

public class CircularQueue {
    private int size;
    private int items[];
    private int front, rear;

    CircularQueue(int size){
        this.items = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public void enQueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            items[rear] = x;
            System.out.println("Inserted " + x);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return (-1);
        } else {
            int ele = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println("DeQueue Value is: " + ele);
            return ele;
        }
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
          System.out.println("Empty Queue");
        } else {
          System.out.println("Front -> " + front);
          System.out.println("Items -> ");
          for (i = front; i != rear; i = (i + 1) % size)
            System.out.print(items[i] + " ");
          System.out.println(items[i]);
          System.out.println("Rear -> " + rear);
        }
      }

    public Boolean isFull() {
        if (front == 0 && rear == size - 1) {
          return true;
        }
        if (front == rear + 1) {
          return true;
        }
        return false;
      }

    public Boolean isEmpty(){
        return front == -1;
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);
    
        // Fails because front = -1
        q.deQueue();
    
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
    
        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);
    
        q.display();
    
        int elem = q.deQueue();
    
        if (elem != -1) {
          System.out.println("Deleted Element is " + elem);
        }
        q.display();
    
        q.enQueue(7);
    
        q.display();
    
        // Fails to enqueue because front == rear + 1
        q.enQueue(8);
      }

}
