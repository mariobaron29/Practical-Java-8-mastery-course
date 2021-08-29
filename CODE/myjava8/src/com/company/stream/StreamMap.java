package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Input list: " + numbers); // Prints [1, 2, 3, 4, 5, 6]

        List<Integer> output = numbers.stream()
                .map(input -> input * 3)
                .collect(Collectors.toList());

        System.out.println("Output list: " + output);


    }
}
