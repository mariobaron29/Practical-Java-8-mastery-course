package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers); // Prints [1, 2, 3, 4, 5, 6]
        // Untl Java 7 - Odd numbers

        List<Integer> oddNumbers = new ArrayList<>();

        for (Integer num: numbers) {
            if(num%2 !=0){
                oddNumbers.add(num);
            }
        }
        System.out.println("Odd numbers with Java 7");
        System.out.println(oddNumbers);

        System.out.println("Odd numbers with Java 8");
        List<Integer> odd = numbers
                .stream()
                .filter(num -> num%2 != 0)
                .collect(Collectors.toList());
        System.out.println(odd);
    }
}
