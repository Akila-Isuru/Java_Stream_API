package com.stream_api.Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap2 {
    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> list=listOfStrings.stream().map((element)->Integer.parseInt(element))
                .toList();

        System.out.println(list);

    }
}
