package com.PurpleMesh.OOPS;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.databind.JsonNode;

public class InventoryReader {

	public static void main(String[] args) {
        String filePath = "inventory.json"; 
        
          
        
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
					String name= item.get("name").asText();
					double weight=item.get("weight").asDouble();
					double price=item.get("price").asDouble();
					Inventory inventoryItem = new Inventory(category, name, weight, price);
					
//					System.out.println("Category: " + inventoryItem.getCategory());
//                    System.out.println("Name: " + inventoryItem.getName());
//                    System.out.println("Weight: " + inventoryItem.getWeight());
//                    System.out.println("Price: " + inventoryItem.getPrice());
                   
                    System.out.println("------------");
                    System.out.println("JSON: " + inventoryItem.toJson());
                    System.out.println("Total Price: " + inventoryItem.calculateTotalPrice());
                    System.out.println();
				}
			}
                
            
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        


	}

}
