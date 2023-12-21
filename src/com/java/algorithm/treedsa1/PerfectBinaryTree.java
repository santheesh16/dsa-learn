package com.java.algorithm.treedsa1;


public class PerfectBinaryTree {

  // Calculate the depth
  static int depth(Node node) {
    int d = 0;
    while (node != null) {
      d++;
      node = node.leftChild;
    }
    return d;
  }

  // Check if the tree is perfect binary tree
  static boolean is_perfect(Node root, int d, int level) {

    // Check if the tree is empty
    if (root == null)
      return true;

    // If for children
    if (root.leftChild == null && root.rightChild == null)
      return (d == level + 1);

    if (root.leftChild == null || root.rightChild == null)
      return false;

    return is_perfect(root.leftChild, d, level + 1) && is_perfect(root.rightChild, d, level + 1);
  }

  // Wrapper function
  static boolean is_Perfect(Node root) {
    int d = depth(root);
    return is_perfect(root, d, 0);
  }

  // Create a new node
  static Node newNode(int k) {
    Node node = new Node();
    node.value = k;
    node.rightChild = null;
    node.leftChild = null;
    return node;
  }

  public static void main(String args[]) {
    Node root = null;
    root = newNode(1);
    root.leftChild = newNode(2);
    root.rightChild = newNode(3);
    root.leftChild.leftChild = newNode(4);
    root.leftChild.rightChild = newNode(5);

    if (is_Perfect(root) == true)
      System.out.println("The tree is a perfect binary tree");
    else
      System.out.println("The tree is not a perfect binary tree");
  }
}
