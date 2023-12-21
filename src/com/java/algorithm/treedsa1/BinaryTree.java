package com.java.algorithm.treedsa1;

// Tree traversal in Java


class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        postorder(node.leftChild);
        // Traverse right
        postorder(node.rightChild);
        // Traverse root
        System.out.print(node.value + "->");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        inorder(node.leftChild);
        // Traverse root
        System.out.print(node.value + "->");
        // Traverse right
        inorder(node.rightChild);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.value + "->");
        // Traverse left
        preorder(node.leftChild);
        // Traverse right
        preorder(node.rightChild);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.leftChild = new Node(12);
        tree.root.rightChild = new Node(9);
        tree.root.leftChild.leftChild = new Node(5);
        tree.root.leftChild.rightChild = new Node(6);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }
}