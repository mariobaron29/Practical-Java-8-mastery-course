package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(55,22,1,48,101,77);
        List<Integer> duplicateNumbers = Arrays.asList(55,22,1,48,101,77,55,22,1,48,101,77);

        Integer min = numbers.stream()
                .min((a,b) -> {
                    return a.compareTo(b);
                }).get();

        Integer max = numbers.stream()
                .max((a,b) -> {
                    return a.compareTo(b);
                }).get();

        System.out.println("Min: " + min + ", Max: " + max);

        Integer min2 = numbers.stream()
                .min(StreamMinMax::sortElements)
                .get();

        Integer max2 = numbers.stream()
                .max(StreamMinMax::sortElements)
                .get();

        System.out.println("Min2: " + min2 + ", Max2: " + max2);

        List<Integer> duplicateSorted = duplicateNumbers.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> uniqueSorted = duplicateNumbers.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Duplicate sorted list: " + duplicateSorted);
        System.out.println("Unique sorted list: " + uniqueSorted);
    }

    public static Integer sortElements(Integer a, Integer b){
        return a.compareTo(b);
    }
}
