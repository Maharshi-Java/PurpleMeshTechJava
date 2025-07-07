package com.PurpleMesh.OOPS;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;

public class StockAccountLinkedList {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CompanyShares {
        private String symbol;
        private int shares;
        private double price;
        private LocalDateTime time;

       
        public CompanyShares() {}

        public CompanyShares(String symbol, int shares, double price) {
            this.symbol = symbol;
            this.shares = shares;
            this.price = price;
            this.time = LocalDateTime.now();
        }

        
        public String getSymbol() { return symbol; }
        public void setSymbol(String symbol) { this.symbol = symbol; }

        public int getShares() { return shares; }
        public void setShares(int shares) { this.shares = shares; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        public LocalDateTime getTime() { return time; }
        public void setTime(LocalDateTime time) { this.time = time; }

        public void printDetails() {
            System.out.println(symbol + " | Shares: " + shares + " | Price: " + price + " | Time: " + time);
        }
    }

    private List<CompanyShares> accountSharesLists = new ArrayList<>();
    private List<Stock> availableStocks;
    private String filename;

    public StockAccountLinkedList(String filename) throws IOException {
        this.filename = filename;
        loadAccount(filename);
    }

    private void loadAccount(String filename) throws IOException {
        File file = new File(filename);
        if (file.exists() && file.length() > 0) { // Only read if file has content
            accountSharesLists = Utility.mapper.readValue(file, new TypeReference<List<CompanyShares>>() {});
        } else {
            accountSharesLists = new ArrayList<>();
        }
    }

    public void setAvailableStocks(List<Stock> stocks) {
        this.availableStocks = stocks;
    }

    public void buy(int amount, String symbol) {
        Stock stock = getStockBySymbol(symbol);
        if (stock == null) {
            System.out.println("Stock " + symbol + " not found.");
            return;
        }

        for (CompanyShares cs : accountSharesLists) {
            if (cs.getSymbol().equals(symbol)) {
                cs.setShares(cs.getShares() + amount);
                cs.setTime(LocalDateTime.now());
                System.out.println("Bought " + amount + " shares of " + symbol + " at price " + stock.getPrice());
                return;
            }
        }

        CompanyShares newShares = new CompanyShares(symbol, amount, stock.getPrice());
        accountSharesLists.add(newShares);
        System.out.println("Bought " + amount + " shares of " + symbol + " at price " + stock.getPrice());
    }

    public void sell(int amount, String symbol) {
        for (int i = 0; i < accountSharesLists.size(); i++) {
            CompanyShares cs = accountSharesLists.get(i);
            if (cs.getSymbol().equals(symbol)) {
                if (cs.getShares() < amount) {
                    System.out.println("Not enough shares to sell: " + symbol);
                    return;
                }
                cs.setShares(cs.getShares() - amount);
                cs.setTime(LocalDateTime.now());

                if (cs.getShares() == 0) {
                    accountSharesLists.remove(i);
                }
                System.out.println("Sold " + amount + " shares of " + symbol);
                return;
            }
        }
        System.out.println("No shares found for symbol: " + symbol);
    }

    public void printReport() {
        System.out.println("\n--- Stock Account Report ---");
        for (CompanyShares cs : accountSharesLists) {
            cs.printDetails();
        }
    }

    public void save(String filename) throws IOException {
        Utility.mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), accountSharesLists);
        System.out.println("Account saved to file: " + filename);
    }

    private Stock getStockBySymbol(String symbol) {
        if (availableStocks == null) return null;
        for (Stock s : availableStocks) {
            if (s.getName().equals(symbol)) return s;
        }
        return null;
    }
}
