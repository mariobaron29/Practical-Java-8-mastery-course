package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekSkip {
    public static void main(String[] args) {
        List<String> flats = Arrays.asList("B01", "B08","B11","t01","B05","B05","t07");

        List<String> flatsWithB = flats.stream()
                . filter(flat -> flat.startsWith("B"))
                .sorted()
                .peek(System.out::println) // More of a debugging feature, for example print values at that point
                .distinct()
                .skip(2) // Skips the first n positions of the list
                .collect(Collectors.toList());

        System.out.println("Flats with B: " + flatsWithB);
    }
}
