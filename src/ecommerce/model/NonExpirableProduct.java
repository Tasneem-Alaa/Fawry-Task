package ecommerce.model;

import java.time.LocalDate;

public class NonExpirableProduct extends Product implements Shippable {


    public NonExpirableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }
    public NonExpirableProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity, weight);
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
