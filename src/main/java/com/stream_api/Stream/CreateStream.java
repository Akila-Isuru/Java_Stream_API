package com.stream_api.Stream;

import java.util.*;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        //Create Stream from a list

//        List<String> fruitlist = new ArrayList<>();
//        fruitlist.add("Apple");
//        fruitlist.add("Banana");
//        fruitlist.add("Orange");
//        fruitlist.add("Watermelon");
//        fruitlist.add("Mango");

        List<String> fruitList  = Arrays.asList("Apple", "Banana", "Orange", "Watermelon");

        Stream<String> stream =fruitList.stream();   //Create stream from List(source)

        stream.forEach((fruit) -> System.out.print(fruit+","));

        //List maintain the insertion order so Stream maintain the insertion order also

        // Create a Stream from a Set

        Set<String> fruitSet = new HashSet<>(fruitList);

        //Set doesn't maintain the insertion order so Stream doesn't too

        Stream<String> stream1 = fruitSet.stream();
        stream1.forEach((fruit) -> System.out.println(fruit+","));

        //Create a Stream from a Map

        Map<String,Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple",1);
        fruitMap.put("Banana",2);
        fruitMap.put("Orange",3);
        fruitMap.put("Watermelon",4);

        Stream<Map.Entry<String,Integer>> mapEntryStream = fruitMap.entrySet().stream();
        mapEntryStream.forEach((entry) -> System.out.println(entry.getKey()+","));

        //Create a Stream from a Map's keySet

        Stream<String> mapKeySetStream =fruitMap.keySet().stream();
        mapKeySetStream.forEach((key) -> System.out.println(key+","));

        //Create a Stream from Map's value

        Stream<Integer> mapValueStream =fruitMap.values().stream();
        mapValueStream.forEach((value) -> System.out.println(value+","));

        //Create Stream from an Array

        String[] array = {"Apple","Banana","Orange","Watermelon"};
       Stream<String> arrayStream =  Arrays.stream(array);
       arrayStream.forEach(System.out::println);

       //Create a Stream using Stream.of() method

       Stream<String> ofStream =  Stream.of("Apple","Banana","Orange","Watermelon");
        ofStream.forEach(System.out::println);

    }
}
