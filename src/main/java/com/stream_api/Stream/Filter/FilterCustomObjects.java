package com.stream_api.Stream.Filter;

import java.util.ArrayList;
import java.util.List;

class Product{
    private String name;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    private double price;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    private String category;
}

public class FilterCustomObjects {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 120000.00, "Electronics"));
        products.add(new Product("Smartphone", 85000.00, "Electronics"));
        products.add(new Product("Headphones", 12000.00, "Electronics"));
        products.add(new Product("T-Shirt", 2500.00, "Clothing"));
        products.add(new Product("Jeans", 4500.00, "Clothing"));
        products.add(new Product("Jacket", 8900.00, "Clothing"));

        List<Product> filteredproducts = products.stream()
                                              .filter((product)->product.getCategory().equals("Electronics"))
                                                 .toList();

        System.out.println("Filtered products :"+filteredproducts);

        //Applying multiple filter conditions

        //1.products must belong to the "Electronic" category
        //2.Product price must be greater than 15000

        List<Product> filterProducts = products.stream().filter(
                (product )-> product.getCategory().equals("Electronics") && product.getPrice()>15000
        ).toList();

        System.out.println("Filtered products :"+filterProducts);



    }
}
