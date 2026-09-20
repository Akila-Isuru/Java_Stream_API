package com.stream_api.Stream.StreamMethods;


import java.util.Arrays;
import java.util.List;

//Find the square of the first three even numbers using java 8 Stream
public class FindSquare {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);

        List<Integer> squares =numbers.stream()
                .filter((number)->number % 2 == 0)
                .limit(3)
                .map((number)->number*number)
                .toList();

        System.out.println("Squares are :"+squares);

    }
}
