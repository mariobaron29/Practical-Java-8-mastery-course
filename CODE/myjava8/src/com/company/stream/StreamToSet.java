package com.company.stream;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamToSet {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(3);
        numSet.add(4);
        numSet.add(7);
        numSet.add(9);

        Set<Integer> filteredSet = numSet.stream()
                .filter(a -> a > 3)
                .collect(Collectors.toSet());

        System.out.println(filteredSet);

        // You can also convert the output into a map
        Map<Integer, Integer> newMap = numSet.stream()
                .collect(Collectors.toMap(x -> x, y -> y * 100) );

        System.out.println("Map: " + newMap);
    }
}
