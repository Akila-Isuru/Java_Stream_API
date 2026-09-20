package com.stream_api.Stream.StreamMethods;

import java.util.Arrays;
import java.util.List;

public class FindAverage {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,40,50);

       double average = numbers.stream() //convert the list into stream
                .mapToInt(Integer::intValue) //convert the Integer into int
                .average() //calculate the average
                .getAsDouble();
        System.out.println("Average is :"+average);
    }
}
