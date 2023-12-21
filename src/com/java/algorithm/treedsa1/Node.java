package com.java.algorithm.treedsa1;

public class Node {
    int value;
    Node leftChild, rightChild;

    Node(int key){
        value = key;
        leftChild = rightChild = null;
    }

    public Node() {
    }
}
