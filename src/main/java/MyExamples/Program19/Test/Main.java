package MyExamples.Program19.Test;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.List;

class Node<T extends Integer> {
    T key;
    Node left, right;
    //List<Node> listTree;

    public Node(T item) {
        key = item;
        left = right = null; // Непонятно
        //listTree = new ArrayList<>();
    }

    public Node() {
        key = null;
        //listTree = new ArrayList<>();
        left = right = null;
    }
}

class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree() {
        root = null;
    }

    /* Given a binary tree, print its nodes according to the
    "bottom-up" postorder traversal. */
    void printPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    void printInorder() {
        printInorder(root);
    }

    // Driver method
    public static void main(String[] args) {
        // 4 2 8 5 1 6 3 7
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2); // только цифры
        tree.root.right = new Node(null);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.right.left = new Node(8);
        //      1
        //   2     3
        // 4 5   6   7
        //8

        System.out.println(
                "\nInorder traversal of binary tree is "); // Неупорядоченный обход бинарного дерева
        tree.printInorder();

        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInorder();

//        System.out.println(
//                "\nPostorder traversal of binary tree is ");
//        tree.printPostorder();
    }
}