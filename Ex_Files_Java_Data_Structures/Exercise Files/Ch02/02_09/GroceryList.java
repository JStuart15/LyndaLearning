/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerylist;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Producer
 */
public class GroceryList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList(Arrays.asList("milk", 
                "bread", "cheese"));
        ArrayList<String> groceries2 = new ArrayList(Arrays.asList("sugar", 
                "flour", "baking soda"));
        
        groceries.add("bacon");
        groceries.addAll(groceries2);
        System.out.println(groceries);
        
        if(groceries.contains("milk"))
            groceries.remove("milk");
        System.out.println(groceries);
   
    }
    
}
