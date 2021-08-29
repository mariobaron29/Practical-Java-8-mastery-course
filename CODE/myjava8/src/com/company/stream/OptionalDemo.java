package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> flats = Arrays.asList("B01", "B08","B11","t01","B05","B05","t07");
        Optional<String> result = flats.stream()
                .filter(flat -> flat.startsWith("B"))
                .findFirst();
        Optional<String> result2 = flats.stream()
                .filter(flat -> flat.startsWith("M"))
                .findFirst();

        if(result.isPresent()){
            System.out.println(result.get());
        }
        else{
            System.out.println("No element found");
        }

        // In a much shorter way:
        result.ifPresent(data -> System.out.println("Data in short is: " + data));

        // Or just
        result.ifPresent(System.out::println);

        // You can also return the value if found or return something otherwise
        String orElse = result2.orElse("No data found");

        // You can also throw an exception
        result2.orElseThrow(() -> new RuntimeException());
    }
}
