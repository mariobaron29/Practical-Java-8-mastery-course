package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
        fruits.add("Papaya");

        // find fruits whose name length is greater than 5

        // Filter  list of fruits with name lengths greater than 5
        List<String> names = fruits.stream()
                                    .filter(len -> len.length() > 5)
                                    .collect(Collectors.toList());

        // Map the lengths of each filtered fruit
        List<Integer> lengths = names.stream()
                .map(f -> f.length())
                .collect(Collectors.toList());

        // This is a way to filter and map in a compact way if you only need the lengths
        // List<Integer> lengths = fruits.stream()
        //                               .filter(len -> len.length() > 5)
        //                               .map(f -> f.length())
        //                               .collect(Collectors.toList());

        Long count = fruits.stream()
                            .filter(len -> len.length() > 5)
                            .count();

        System.out.println("Names: " + names);
        System.out.println("Lengths: " + lengths);
        System.out.println("Number of fruits: " + count);

    }
}
