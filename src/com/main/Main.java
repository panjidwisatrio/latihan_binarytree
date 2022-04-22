package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Creating object of BT */
        BinaryTree<Integer> tree = new BinaryTree<>();

        /*  Perform tree operations  */
        System.out.println("Binary Tree Test\n");
        char ch;

        do {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter integer element to insert");
                    tree.insert(23);
                    tree.insert(10);
                    tree.insert(5);
                    tree.insert(8);
                    tree.insert(11);
                    tree.insert(4);
                    tree.insert(7);
                }
                case 2 -> {
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : " + tree.search(input.nextInt()));
                }
                case 3 -> System.out.println("Nodes = " + tree.countNodes());
                case 4 -> System.out.println("Empty status = " + tree.isEmpty());
                default -> System.out.println("Wrong Entry \n ");
            }

            /*  Display tree  */
            System.out.print("\nPost order : ");
            tree.postOrder();
            System.out.print("\nPre order : ");
            tree.preOrder();
            System.out.print("\nIn order : ");
            tree.inOrder();

            System.out.println("\n\nDo you want to continue (Type y or n)\n");
            ch = input.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');
    }
}
