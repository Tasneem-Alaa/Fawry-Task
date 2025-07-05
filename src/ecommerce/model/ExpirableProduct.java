package ecommerce.model;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements Shippable{
    private LocalDate expireDate;

    public ExpirableProduct(String name, double price, int quantity, LocalDate expireDate) {
        super(name, price, quantity);
        this.expireDate = expireDate;
    }
    public ExpirableProduct(String name, double price, int quantity, double weight, LocalDate expireDate) {
        super(name, price, quantity, weight);
        this.expireDate = expireDate;
    }


    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(getExpireDate());
    }

}
