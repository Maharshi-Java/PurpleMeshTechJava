package com.PurpleMesh.OOPS;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.util.ArrayList;

public class StockAccount {

    static class CompanyShares {
=======
import java.io.File;
import java.io.IOException;
import java.security.PrivateKey;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;

public class StockAccount {
 
@JsonIgnoreProperties(ignoreUnknown = true)
   public static class CompanyShares {
>>>>>>> 7a66887 (second commit)
        String symbol;
        int shares;
        double price;
        LocalDateTime time;

<<<<<<< HEAD
=======
        public CompanyShares() {
            
        }
        
>>>>>>> 7a66887 (second commit)
        public CompanyShares(String symbol, int shares, double price) {
            this.symbol = symbol;
            this.shares = shares;
            this.price = price;
            this.time = LocalDateTime.now();
        }

        public void printDetails() {
            System.out.println(symbol + " | Shares: " + shares + " | Price: " + price + " | Time: " + time);
        }
<<<<<<< HEAD
    }

    ArrayList<CompanyShares> transactions = new ArrayList<>();
    ArrayList<Stock> availableStocks;

    public StockAccount(ArrayList<Stock> availableStocks) {
        this.availableStocks = availableStocks;
    }

    public void buy(String symbol, int shares) {
        for (Stock s : availableStocks) {
            if (s.name.equals(symbol)) {
                transactions.add(new CompanyShares(symbol, shares, s.price));
                System.out.println("Bought " + shares + " of " + symbol + " at price " + s.price);
                return;
            }
        }
        System.out.println("Stock " + symbol + " not found in available stocks");
    }

    public void sell(String symbol, int shares) {
        for (CompanyShares cs : transactions) {
            if (cs.symbol.equals(symbol) && cs.shares >= shares) {
                cs.shares -= shares;
                System.out.println(" Sold " + shares + " of " + symbol);
                return;
            }
        }
        System.out.println("Not enough shares of " + symbol + " to sell");
    }

    public void printReport() {
        System.out.println(" Transaction Report:");
        for (CompanyShares cs : transactions) {
            cs.printDetails();
        }
    }
=======
        
        public double getValue()
        {
        	return shares*price;
        }
        
        public String getSymbol()
        { 
        	return symbol;
        }
        public void setSymbol(String symbol)
        { 
        	this.symbol = symbol;
        	}

        public int getShares() {
        	return shares;
        	}
        public void setShares(int shares) {
        	this.shares = shares;
        	}

        public double getPrice() {
        	return price;
        	}
        public void setPrice(double price) { 
        	this.price = price;
        	}

        public LocalDateTime getTime() { 
        	return time; 
        	}
        public void setTime(LocalDateTime time) { 
        	this.time = time;
        	}

    }
    
    private Map<String, CompanyShares> accountShares= new HashMap<String, StockAccount.CompanyShares>();
    private List<Stock> availableStocks;
    private String filename;
    
    public StockAccount(String filename) throws IOException {
        this.filename = filename;
        loadAccount(filename);
    }

    private void loadAccount(String filename2) throws IOException {
		File file = new File(filename);
		if(file.exists())
		{
			List<CompanyShares> shares=Utility.mapper.readValue(file, new TypeReference<List<CompanyShares>>() {
			});
			for(CompanyShares cs:shares)
			{
				accountShares.put(cs.symbol, cs);
			}
			
			
		}
		
	}

	public void setAvailableStocks(List<Stock> stocks) {
        this.availableStocks = stocks;
    }

	public void buy(int amount,String symbol)
	{
		Stock stock= getStockBySymbol(symbol);
		if (stock == null) {
            System.out.println("Stock " + symbol + " not found.");
            return;
        }
		
		CompanyShares cShares=accountShares.get(symbol);
		if (cShares != null) {
			cShares.shares += amount;
        } else {
        	cShares = new CompanyShares(symbol, amount, stock.price);
            accountShares.put(symbol, cShares);
        }

        System.out.println("Bought " + amount + " shares of " + symbol + " at price " + stock.price);
		
	}
	
	public void sell(int amount,String symbol)
	{
		CompanyShares cShares= accountShares.get(symbol);
		
		if(cShares == null  || cShares.shares<amount)
		{
			System.out.println("Not enough shares:"+symbol);
			return;
		}
		cShares.shares -=amount;
		if(cShares.shares==0)
		{
			accountShares.remove(symbol);
		}
		 System.out.println("Sold " + amount + " shares of " + symbol);
	}

	public void save(String filename) throws IOException{
		List<CompanyShares> companyShares=new ArrayList<>(accountShares.values());
		Utility.mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filename), companyShares);
		System.out.println("Account saved to file: " + filename);
	}
	private Stock getStockBySymbol(String symbol) {
		if(availableStocks == null) return null;
		for(Stock s: availableStocks)
		{
			if(s.name.equals(symbol))
			{
				return s;
			}
		}
		
		return null;
	}
	 public void printReport() {
	        System.out.println("\n--- Stock Account Report ---");
	        accountShares.values().forEach(CompanyShares::printDetails);
	        
	    }
    
    

>>>>>>> 7a66887 (second commit)
}
