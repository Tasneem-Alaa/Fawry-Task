package ecommerce.model;

import ecommerce.service.OrderService;

public class Customer {
    private String userName;
    private Cart cart;
    private double balance;

    public Customer(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
        cart = new Cart();
    }

    public void checkout() {
        OrderService order = new OrderService();
        order.checkout(this);
    }

    public void decreaseBalance(double totalAmount) {
        this.balance-=totalAmount;
    }


    //getter and setter
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Cart getCart() {
        return cart;
    }
}
