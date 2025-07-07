package com.PurpleMesh.OOPS;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.databind.JsonNode;

public class StockAccountLinkedListMain {

    public static void main(String[] args) throws IOException {
        String stockFile = "stockfile.json";
        String accountFile = "accountfile.json";

       
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

        
        StockAccountLinkedList account = new StockAccountLinkedList(accountFile);
        account.setAvailableStocks(stockReport.getStocks());
        TransactionStackManager stackManager = new TransactionStackManager();
        TransactionQueueManager queueManager = new TransactionQueueManager();

        
        account.buy(10, "TCS");
        stackManager.recordTransaction("Bought", 10, "TCS");
        queueManager.recordTransactionTime(LocalDateTime.now());
        
        account.buy(5, "INFY");
        stackManager.recordTransaction("Bought", 5, "INFY");
        queueManager.recordTransactionTime(LocalDateTime.now());
        
        
        
        
        account.sell(25, "TCS");
        stackManager.recordTransaction("Sold", 25, "TCS");
        queueManager.recordTransactionTime(LocalDateTime.now());
       
        account.printReport();
        account.save(accountFile);
    }
}
