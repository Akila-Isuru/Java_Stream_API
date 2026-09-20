package com.stream_api.Stream.Filter;

import java.util.Arrays;
import java.util.List;

public class StringCase {
    public static void main(String[] args) {

        List<String> words= Arrays.asList("Apple","Orange","Banana");

        List<String> streamUpper= words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(streamUpper);

        List<String> streamLower= words.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println(streamLower);

    }
}
