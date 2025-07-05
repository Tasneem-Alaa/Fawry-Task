package ecommerce.service;

import ecommerce.model.Cart;
import ecommerce.model.Customer;
import ecommerce.model.Product;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    public void checkout(Customer customer) {
        //check if the cart is empty
        Cart cart = customer.getCart();
        if (cart.isEmpty()) {
            System.out.println("❌ Cart is empty.");
            return;
        }

        Map<Product, Integer> products = cart.getProducts();
        Map<Product, Integer> shippingProducts = new HashMap<>();
        double subtotal = 0.0;
        double totalWeight = 0.0; //grams
        double totalShipping = 0.0;

        //loop to get the shipping products and check for all product (expire & stock)
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int qnt = entry.getValue();

            if(product.isShippable()) {
                shippingProducts.put(product,qnt);
                totalWeight+= qnt * product.getWeight();
            }

            if (product.isExpired()) {
                System.out.println("❌ Product expired: " + product.getName());
                return;
            }

            if (qnt > product.getQuantity()) {
                System.out.println("❌ Not enough stock for: " + product.getName());
                return;
            }

            subtotal += qnt * product.getPrice();
        }

        //shipping and get the shipping amount
        System.out.println("**  Shipment notice **");
        ShippingService ship = new ShippingService();
        totalShipping = ship.shipping(shippingProducts,totalWeight);

        //check for user balance
        double totalAmount = totalShipping + subtotal;
        if (customer.getBalance() < totalAmount) {
            System.out.println("❌ Insufficient balance.");
            return;
        }

        //print the receipt and increase the products amount
        System.out.println("** Checkout receipt **");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int qnt = entry.getValue();

            product.decreaseAmount(qnt);
            System.out.print(qnt + "x " + product.getName()+"       ");
            System.out.println((int)(qnt * product.getPrice()));
        }
        cart.clearCart();
        customer.decreaseBalance(totalAmount);
        System.out.println("----------------------");
        System.out.print("Subtotal:     ");
        System.out.println((int)subtotal);
        System.out.print("Shipping:     ");
        System.out.println((int)totalShipping);
        System.out.print("Amount:       ");
        System.out.println((int)totalAmount);
        System.out.printf("Remaining balance: %.2f\n", customer.getBalance());
    }
}
