<<<<<<< HEAD
package com.PurpleMesh.OOPS;
=======
 package com.PurpleMesh.OOPS;
>>>>>>> 7a66887 (second commit)

import java.io.File;
import java.io.IOException;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

public class StockMain {

	public static void main(String[] args) throws IOException {
		String filePath="stocks.json";
		
		StockReport stockReport= new StockReport();
		
		try {
			JsonNode jsonNode= Utility.mapper.readTree(new File(filePath));
			
			for(int i=0;i<jsonNode.size();i++)
			{
				JsonNode items=jsonNode.get(i);
				String name= items.get("name").asText();
				int shares= items.get("shares").asInt();
				double price=items.get("price").asDouble();
				
				Stock stock=new Stock(name, shares, price);
				stockReport.addStock(stock);
			}
			
			stockReport.printReport();
			
<<<<<<< HEAD
			StockAccount account = new StockAccount(stockReport.getStocks());

            account.buy("TCS", 10);
            account.buy("INFY", 5);
            account.sell("TCS", 5);

            account.printReport();
=======
>>>>>>> 7a66887 (second commit)

		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}

	}

}
