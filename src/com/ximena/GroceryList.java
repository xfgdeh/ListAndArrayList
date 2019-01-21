package com.ximena;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("items in your grocery list are : " + groceryList.size());
        for(int i=0; i>groceryList.size(); i++){
            System.out.println((i+1) +". "+ groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position, String item){
        groceryList.set(position, item);
        System.out.println("GroceryItem " + (position+1)+ "has been modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(theItem);
    }

    public String searchGroceryItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
       return  null;
    }

}
