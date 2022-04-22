package com.main;

public class BinaryTree<E> {
    private BTNode<E> root;

    /* Constructor */
    public BinaryTree() {
        root = null;
    }

    /* Function to check if tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Functions to insert data */
    public void insert(E data) {
        root = insert(root, data);
    }

    /* Function to insert data recursively */
    private BTNode<E> insert(BTNode<E> node, E data) {
        if (node == null) {
            node = new BTNode<>(data);
        } else {
            if (node.getLeft() == null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    /* Function to count number of nodes */
    public int countNodes() {
        return countNodes(root);
    }

    /* Function to count number of nodes recursively */
    private int countNodes(BTNode<E> root) {
        if (root == null) {
            return 0;
        } else {
            int size = 1;
            size += countNodes(root.getLeft());
            size += countNodes(root.getRight());
            return size;
        }
    }

    /* Function to search for an element */
    public boolean search(E val) {
        return search(root, val);
    }

    /* Function to search for an element recursively */
    private boolean search(BTNode<E> root, E val) {
        if (root.getData() == val) {
            return true;
        } else if (root.getLeft() != null) {
            return search(root.getLeft(), val);
        } else if (root.getRight() != null) {
            return search(root.getRight(), val);
        } else {
            return false;
        }
    }

    /* Function for inorder traversal */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(BTNode<E> root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData() +" ");
            inOrder(root.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(BTNode<E> root) {
        if (root != null) {
            System.out.print(root.getData() +" ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(BTNode<E> root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() +" ");
        }
    }
}