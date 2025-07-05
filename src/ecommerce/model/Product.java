package ecommerce.model;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public abstract class Product {
    private String name;
    private double price;
    private int quantity; //grams
    private double weight;
    private boolean shippable;

//    private boolean expirable;

    public abstract boolean isExpired();
    public boolean isShippable() {
        if(weight>0)
            return true;
        else
            return false;
    }

    public void decreaseAmount(int qnt){
        this.quantity-=qnt;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity,double weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }
}
