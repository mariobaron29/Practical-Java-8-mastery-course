package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(3);
        numbers.add(41);
        numbers.add(5);
        numbers.add(66);

        //normal insertion order
        System.out.println(numbers);

        //Ascending sort
        System.out.println(
                numbers.stream()
                .sorted()
                .collect(Collectors.toList()));

        //Custom sort
        System.out.println(
                numbers.stream()
                .sorted((elem1, elem2) -> elem2.compareTo(elem1)) // Descending
                .collect(Collectors.toList()));
    }
}
