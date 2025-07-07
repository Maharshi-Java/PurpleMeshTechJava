package com.PurpleMesh.OOPS;

import java.io.File;
import java.io.IOException;
<<<<<<< HEAD
import java.nio.channels.Pipe.SourceChannel;
import java.util.Iterator;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryManager {

	public static void main(String[] args) {
        String filePath = "inventory.json"; 
        
         
        
=======
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.databind.JsonNode;

public class InventoryManager {
	
	private static List<Inventory> list= new ArrayList<Inventory>();
	public void printInventory()
    {
    	for(Inventory item:list)
    	{
    		System.out.println(item.toJson());
    		System.out.println(item.calculateTotalPrice());
    	}
    }

	public void loadInventoryFromFile(String filePath) {
>>>>>>> 7a66887 (second commit)
        try {
			JsonNode rootNode= Utility.mapper.readTree(new File(filePath));
			
			Iterator<String> categories = rootNode.fieldNames();
			
			while(categories.hasNext())
			{
				String category= categories.next();
				JsonNode jsonNode= rootNode.get(category);
				
				for(int i=0;i<jsonNode.size();i++)
				{
					JsonNode item = jsonNode.get(i);
<<<<<<< HEAD
					String name= item.get("name").asText();
					double weight=item.get("weight").asDouble();
					double price=item.get("price").asDouble();
					double totalPrice=weight*price;
					
					System.out.println("Category: " + category);
                    System.out.println("Name: " + name);
                    System.out.println("Weight: " + weight);
                    System.out.println("Price: " + price);
                    System.out.println("Total Price: " + totalPrice);
                    System.out.println();
				}
			}
                
            
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        


	}

=======

					Inventory inventory=InventoryFactory.createInventory(category, item);
				    list.add(inventory);
					
				}
				

	       }
        }catch (IOException e) {
			
			e.printStackTrace();
		}

     } 
	public static void main(String[] args) {
     String filePath = "inventory.json"; 
     InventoryManager inventoryManager= new InventoryManager();
     inventoryManager.loadInventoryFromFile(filePath);
     inventoryManager.printInventory();
          
     
 }
	
>>>>>>> 7a66887 (second commit)
}
