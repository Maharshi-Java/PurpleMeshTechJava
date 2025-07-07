package com.PurpleMesh.OOPS;

import com.fasterxml.jackson.databind.JsonNode;

public class InventoryFactory {
	
	public static Inventory createInventory(String category,JsonNode item)
	{
		
		String name=item.get("name").asText();
		double weight = item.get("weight").asDouble();
        double price = item.get("price").asDouble();
        return new Inventory(category, name, weight, price);
	}

}
