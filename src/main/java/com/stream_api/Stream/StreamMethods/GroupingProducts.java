package com.stream_api.Stream.StreamMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
    private String name;
    private String category;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }


}

public class GroupingProducts {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics"),
                new Product("Smartphone", "Electronics"),
                new Product("Headphones", "Electronics"),

                new Product("T-Shirt", "Clothing"),
                new Product("Jeans", "Clothing")
        );

//        Groups the product by its category
        Map<String,List<Product>> map = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));   //This groupBy method returns a map

        System.out.println(map);

    }
}
