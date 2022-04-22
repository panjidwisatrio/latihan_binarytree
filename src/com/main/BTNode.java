package com.main;

public class BTNode<E> {
    BTNode<E> left, right;
    E data;

    /* Constructor */
    public BTNode(E item) {
        left = null;
        right = null;
        data = item;
    }

    /* Function to get left node */
    public BTNode<E> getLeft() {
        return left;
    }

    /* Function to get right node */
    public BTNode<E> getRight() {
        return right;
    }

    /* Function to get data to node */
    public E getData() {
        return data;
    }
}