package com.java.algorithm.dsa1;

public class Stack {

    private int top;
    private int[] arr;
    private int capacity;

    public Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value){
        if (isFull()) {
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Inserting " + value);
        arr[++top]= value;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return arr[top];
    }

    public int size(){
        return top + 1;
    }

    public Boolean isFull(){
        return top == capacity - 1;
    }

    public Boolean isEmpty(){
        return top == - 1;
    }

     public void printStack(){
        for (int i = top; i >= 0; i--) {
            System.out.println("|"+arr[i]+"|");
        }
        System.out.println("___");
    }

    public static void main(String[] args) {
        Stack st1 = new Stack(5);
        st1.push(2);
        st1.push(4);
        st1.push(5);
        st1.push(7);
        st1.push(9);
        st1.printStack();
        System.out.println("Stack Peek Value is: "+ st1.peek());
        System.out.println("Stack Peek Value is: "+ st1.pop());
        st1.printStack();
    }


    
}
