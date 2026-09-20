package com.stream_api.Stream.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

/**
 * map() is a intermediate operation
 * The map() method is used to apply a function to each element in the stream and return a new stream with the
 transformed data
 *commonly used to convert objects,modify data or extract specific fields from coplex objects
 */
public class StreamMap {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple","Banana","Orange","Watermelon"); // source
        Stream<String> fruitStream = fruits.stream();
        List<String> fruitList = fruitStream.map((element)->element.toUpperCase())
                .toList();

        System.out.println(fruitList);

    }
}
