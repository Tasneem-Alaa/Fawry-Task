package ecommerce.main;

import ecommerce.model.Customer;
import ecommerce.model.ExpirableProduct;
import ecommerce.model.NonExpirableProduct;
import ecommerce.model.Product;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Tasneem", 3000);
        Customer c2 = new Customer("Yara", 3000);

        Product cheese = new ExpirableProduct("Cheese", 100, 500, 400 , LocalDate.of(2025, 8, 1));
        Product biscuits = new ExpirableProduct("Biscuits", 150, 1500, 200, LocalDate.of(2025, 8, 1));
        Product tv = new NonExpirableProduct("TV", 10000, 1, 1700);
        Product scratchCard = new NonExpirableProduct("ScratchCard", 100, 1500);



        // ===== Test Case 1: Successful checkout =====
        System.out.println("===== Test Case 1: Successful checkout =====");
        c1.getCart().addToCart(cheese, 3);
        c1.getCart().addToCart(biscuits, 2);
        c1.getCart().addToCart(scratchCard, 2);
        c1.checkout();
        System.out.println();

        // ===== Test Case 2: Checkout with empty cart =====
        System.out.println("===== Test Case 2: Checkout with empty cart =====");
        c2.checkout();
        System.out.println();

        // ===== Test Case 3: Insufficient balance =====
        System.out.println("===== Test Case 3: Insufficient balance =====");
        c2.getCart().addToCart(tv, 1);
        c2.checkout();
        System.out.println();

        // ===== Test Case 4: Quantity exceeds stock =====
        System.out.println("===== Test Case 4: Quantity exceeds stock =====");
        c2.getCart().addToCart(cheese, 600);
        c2.checkout();
        System.out.println();

        // ===== Test Case 5: Expired product =====
        System.out.println("===== Test Case 5: Expired product =====");
        Product expiredCheese = new ExpirableProduct("ExpiredCheese", 100, 100,0.4, LocalDate.of(2020, 1, 1));
        c2.getCart().addToCart(expiredCheese, 1);
        c2.checkout();
        System.out.println();
    }
}
