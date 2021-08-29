package com.company.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtras {
    public static void main(String[] args) {
        int[] a = {2,4,6,1,4,5};

        IntStream is = Arrays.stream(a); // This method of converting to Stream only works for primitive int, double, long
        Stream s1 = Stream.of(a); // This method works with any type of Object

        // range of numbers from Stream
        IntStream stream2 = IntStream.range(2,11);
        stream2.forEach(value -> {
            System.out.println("Range value: " + value);
        });

        // range of numbers from Stream includes limit values
        System.out.println("With rangeClosed");
        IntStream stream3 = IntStream.rangeClosed(2,11);
        stream3.forEach(value -> {
            System.out.println("Range value: " + value);
        });
    }
}
