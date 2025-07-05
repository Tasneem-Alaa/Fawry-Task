package ecommerce.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products = new HashMap<>();

    public void addToCart(Product product,int quantity)
    {
        if (product.isExpired())
        {
            //throw new IllegalArgumentException(product.getName() + " is expired.");
            System.out.println(product.getName() + " is expired.");
        }
        //if (quantity > product.getQuantity()) throw new IllegalArgumentException("Not enough stock.");

        int availableQuantity = product.getQuantity();
        if(quantity > availableQuantity)
        {
            //throw new IllegalArgumentException("Not enough stock.");
            System.out.println("Not enough stock.");
        }
        products.put(product, products.getOrDefault(product, 0) + quantity);
        //products.merge(product, quantity, Integer::sum);

    }
    public void removeFromCart(Product product)
    {
        products.remove(product);
    }
    public void clearCart()
    {
        products.clear();
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
