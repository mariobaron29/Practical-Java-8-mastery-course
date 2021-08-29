package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamColonOperator {
    public static void main(String[] args) {
        List<String> alphanumerics = new ArrayList<>();
        alphanumerics.add("A11");
        alphanumerics.add("A44");
        alphanumerics.add("a22");
        alphanumerics.add("a49");
        alphanumerics.add("G66");

        // all elements that start with uppercase A
        System.out.println("Start with A " +
                alphanumerics.stream()
                        .filter(e -> e.startsWith("A"))
                        .collect(Collectors.toList()));

        // all elements that start with the letter
        System.out.println("Start with A " +
                alphanumerics.stream()
                        .map(String :: toUpperCase) // this maps every String to uppercase, so it will fit the filter
                        .filter(e -> e.startsWith("A"))
                        .collect(Collectors.toList()));

        // Filter is a lazy opertion on stream
        System.out.println("Lazy operation " +
                alphanumerics.stream()
                        .filter(input -> {
                            System.out.println(input);
                            return input.startsWith("A");
                        })
                        .collect(Collectors.toList()));

        // all elements that start with the letter
        System.out.println("Start with A " +
                alphanumerics.stream()
                        .map(String :: toUpperCase) // this maps every String to uppercase, so it will fit the filter
                        .filter(e -> e.startsWith("A"))
                        .collect(Collectors.toList()));
    }
}
