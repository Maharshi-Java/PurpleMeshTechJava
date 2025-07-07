package com.PurpleMesh.OOPS;



public class Inventory {
    private String category;
    private String name;
    private double weight;
    private double price;

    public Inventory(String category, String name, double weight, double price) {
        this.category = category;
        this.name = name;
<<<<<<< HEAD
        this.weight = weight;
        this.price = price;
=======
        this.weight = weight; 
        this.price = price; 
>>>>>>> 7a66887 (second commit)
    }

    public double calculateTotalPrice() {
        return weight * price;
    }
<<<<<<< HEAD
=======
    
    public String toJson() {
        return String.format("{\"category\":\"%s\",\"name\":\"%s\",\"weight\":%.2f,\"price\":%.2f}", 
                              category, name, weight, price);
    }
    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
>>>>>>> 7a66887 (second commit)

    
}
