package com.PurpleMesh.OOPS;

import java.util.ArrayList;

public class StockReport {
    ArrayList<Stock> stockList = new ArrayList<>();

    public void addStock(Stock stock) {
<<<<<<< HEAD
        stockList.add(stock);
=======
        stockList.add(stock); 
>>>>>>> 7a66887 (second commit)
    }

    public void printReport() {
        double total = 0;
       
        for (int i = 0; i < stockList.size(); i++) {
            Stock s = stockList.get(i);
            s.printStock();
            total += s.getTotalValue();
        }
        System.out.println("Total Portfolio Value: " + total);
    }

    public ArrayList<Stock> getStocks() {
        return stockList;
    }
}
