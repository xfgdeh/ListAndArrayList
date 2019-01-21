package com.ximena;

import java.util.Scanner;

/**
 * Created by ximena on 21/01/2019.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args){
      boolean quit = false;
        int choice = 0 ;
        printInstructions();
        System.out.println("Please enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
        }
    }

    public static void printInstructions(){
        System.out.println();
    }
}
