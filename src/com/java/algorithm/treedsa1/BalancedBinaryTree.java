package com.java.algorithm.treedsa1;

// Calculate height
class Height {
  int height = 0;
}

public class BalancedBinaryTree {

  Node root;

  // Check height balance
  boolean checkHeightBalance(Node root, Height height) {

    // Check for emptiness
    if (root == null) {
      height.height = 0;
      return true;
    }

    Height leftHeighteight = new Height(), rightHeighteight = new Height();
    boolean l = checkHeightBalance(root.leftChild, leftHeighteight);
    boolean r = checkHeightBalance(root.rightChild, rightHeighteight);
    int leftHeight = leftHeighteight.height, rightHeight = rightHeighteight.height;

    height.height = (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;

    if ((leftHeight - rightHeight >= 2) || (rightHeight - leftHeight >= 2))
      return false;

    else
      return l && r;
  }

  public static void main(String args[]) {
    Height height = new Height();

    BalancedBinaryTree tree = new BalancedBinaryTree();
    tree.root = new Node(1);
    tree.root.leftChild = new Node(2);
    tree.root.rightChild = new Node(3);
    tree.root.leftChild.leftChild = new Node(4);
    tree.root.leftChild.rightChild = new Node(5);

    if (tree.checkHeightBalance(tree.root, height))
      System.out.println("The tree is balanced");
    else
      System.out.println("The tree is not balanced");
  }
}