package com.PurpleMesh.OOPS;

import java.io.File;
import java.io.IOException;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.databind.JsonNode;

public class StockAccountMain {

	public static void main(String[] args) throws IOException {
		String stockFile="stockfile.json";
		String accountFile="accountfile.json";
		
		StockReport stockReport = new StockReport();
		JsonNode jsonNode = Utility.mapper.readTree(new File(stockFile));
		for (int i = 0; i < jsonNode.size(); i++) {
            JsonNode item = jsonNode.get(i);
            Stock stock = new Stock(
                item.get("name").asText(),
                item.get("shares").asInt(),
                item.get("price").asDouble()
            );
            stockReport.addStock(stock);
        }
		
		 StockAccount account = new StockAccount(accountFile);
	        account.setAvailableStocks(stockReport.getStocks());

	        account.buy(10, "TCS");
	        account.buy(5, "INFY");
	        account.sell(3, "TCS");

	        account.printReport();
	        account.save(accountFile);
	}

}
