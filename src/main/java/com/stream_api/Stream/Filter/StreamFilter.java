package com.stream_api.Stream.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Filter() method is used to select elements from a stream based on a condition
 * It's an Intermediate Operation
 * It takes a condition also called a predicate and returns a new stream containing only the elements that
   satisfy that condition
 */
public class StreamFilter {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // source

        //Traditional way of filtering even numbers from a list

        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer number : numbers) {
            if(number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers in traditional way :"+evenNumbers);

        //using Filter() method

        List<Integer> evenNumbersFilter =numbers.stream().filter((number)->number %2==0)
                .toList();
        System.out.println("Even numbers in stream  api filtering :"+evenNumbersFilter);


//        SHORTEST WAY
//        System.out.println(numbers.stream().filter((number)->number%2==0).toList());

    }
}
