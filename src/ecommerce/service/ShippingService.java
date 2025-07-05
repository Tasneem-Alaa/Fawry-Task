package ecommerce.service;

import ecommerce.model.Product;

import java.util.Map;

public class ShippingService {
    private final double SHIPPING_FEE_PER_KG = 15;
    public double shipping(Map<Product, Integer> shippingProducts, double totalWeight) {
//        double totalWeight = 0.0;
        double totalShipping = 0.0;
        for (Map.Entry<Product, Integer> entry : shippingProducts.entrySet()) {
            Product product = entry.getKey();
            int qnt = entry.getValue();

            System.out.print(qnt + "x " + product.getName()+"       ");
            System.out.println((int)(qnt * product.getWeight())+"g");
        }
        System.out.printf("Total package weight: %.2fkg\n", totalWeight/1000);
        System.out.println();

        return SHIPPING_FEE_PER_KG * totalWeight;

    }
}
