package com.PurpleMesh.OOPS;

import java.io.File;
import java.io.IOException;

import com.PurpleMesh.DataStructurePrograms.UnorderedLists;
import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.databind.JsonNode;


public class ListOfCompanyShares {

	public static void main(String[] args) throws IOException {
		String stockFile="stockfile.json";
		String accountFile="accountfile.json";
		UnorderedLists<Stock> sharesLists = new UnorderedLists<>();
		StockReport stockReport = new StockReport();
		JsonNode jsonNode = Utility.mapper.readTree(new File(stockFile));
		for (int i = 0; i < jsonNode.size(); i++) {
            JsonNode item = jsonNode.get(i);
            Stock stock = new Stock(
                item.get("name").asText(),
                item.get("shares").asInt(),
                item.get("price").asDouble()
            );
            sharesLists.add(stock);
            stockReport.addStock(stock);
        }
		

		
		System.out.println("Company Shares in Linked List:");
		for (int i = 0; i < sharesLists.size(); i++) {
			sharesLists.get(i).printStock();
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
