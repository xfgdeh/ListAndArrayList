package com.ximena;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryList(String item){
        groceryList.add(item);
        //System.out.println("Items on your groceryList are: "+ item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size()+" items in your groceryList");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String currentItem,String newItem){
        int position = searchGroceryItem(currentItem);
        if(position>=0){
            modifyGroceryList(position,newItem);
        }
    }

    private void modifyGroceryList(int position, String item){
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position+1)+ " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = searchGroceryItem(item);
        if(position>=0){
            removeGroceryItem(position);
            System.out.println("Grocery item: " + item + " has been removed");
        }
    }

    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(theItem);

    }

    private int searchGroceryItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = searchGroceryItem(searchItem);
        if (position>=0){
            return true;
        }
        return false;
    }

    /*public String searchGroceryItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
       return  null;
    }*/


}
