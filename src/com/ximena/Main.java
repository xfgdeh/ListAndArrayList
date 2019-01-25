package com.ximena;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args){
      boolean quit = false;
        int choice = 0 ;
        printInstructions();
        while(!quit) {
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter item name: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static  void modifyItem(){
        System.out.print("Please enter item: to be replaced ");
        String itemName = scanner.nextLine();
        System.out.print("Please enter replacement item: ");
        String itemName1 = scanner.nextLine();

        groceryList.modifyGroceryList(itemName, itemName1);
    }
    public static void  removeItem(){
        System.out.print("Please enter item to be removed: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }
    public static void  searchForItem(){
       System.out.print("Please enter item you want find: ");
       String searchItemName = scanner.nextLine();
        if(groceryList.onFile(searchItemName)){
            System.out.println("Found " +searchItemName+" in our groceryList");
        }else{
            System.out.println(searchItemName+" not found in our groceryList");
        }
    }
    public static void processArrayList(){
        //First Way of retrieving an arrayList
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        System.out.println(newArray);

        //Second way of retrieving an ArrayList
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        System.out.println(nextArray);

        //Third way of retrieving an ArrayList // doesn't work
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.println(myArray);

    }
}
