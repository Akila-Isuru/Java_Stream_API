package com.stream_api.Stream.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringList {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape"); //source

//        Traditional way before java 8
        List<String> filteredStrings = new ArrayList<>();

        for(String fruit : fruits){
            if(!fruit.equals("apple")){
                filteredStrings.add(fruit);
            }
        }
        System.out.println("Filtered strings in traditional way :"+filteredStrings);

//        Using java 8 Stream api to filter strings from a list

        List<String> filteredFruits = fruits.stream().filter((fruit)->!fruit.equals("apple"))
                .toList();
        System.out.println("Filtered strings in stream api filtering :"+filteredFruits);



    }
}
