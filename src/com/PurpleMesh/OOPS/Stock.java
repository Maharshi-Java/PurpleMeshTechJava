package com.PurpleMesh.OOPS;

public class Stock {
    String name;
    int shares;
    double price;
<<<<<<< HEAD

    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
=======
    public Stock() {
        
    }
    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares; 
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
>>>>>>> 7a66887 (second commit)
        this.price = price;
    }

    public double getTotalValue() {
        return shares * price;
    }

    public void printStock() {
<<<<<<< HEAD
        System.out.println("Stock: " + name);
        System.out.println("Shares: " + shares);
        System.out.println("Price: " + price);
        System.out.println("Total Value: " + getTotalValue());
        System.out.println();
    }
=======
        System.out.println(name + " | Shares: " + shares + " | Price: " + price + " | Value: " + getTotalValue());
    }
    
>>>>>>> 7a66887 (second commit)
}
