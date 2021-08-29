package com.company.stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
        // sequential streams follows order and runs items in streams in a sequence, they are slow in processing.
        // Parallel streams run in multiple threads and do not follow order, they are faster in processing

        //Sequential stream
        System.out.println("Sequential stream");
        intList.stream()
                .forEach(System.out::println);

        // Parallel stream
        System.out.println("Parallel stream");
        intList.stream()
                .parallel()
                .forEach(System.out::println);
        // Or in a shorter way
        System.out.println("Shorter: ");
        intList.parallelStream()
                .forEach(System.out::println);


    }
}
