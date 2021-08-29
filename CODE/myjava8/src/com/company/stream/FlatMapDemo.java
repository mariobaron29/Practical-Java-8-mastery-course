package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(11,22,33,44,55,66,77);

        System.out.println("numList: " + numList);

        // Normal operations with the map operation
        List<Integer> newList = numList.stream()
                .map(x -> x*2)
                .collect(Collectors.toList());

        System.out.println("new list: " + newList);

        // Make a list of lists
        List newList2 = numList.stream()
                .map(x -> Arrays.asList(x, x+1))
                .collect(Collectors.toList());

        System.out.println("new list with lists: " + newList2);

        // With flatMap operations.
        //In Java 8 Streams, the flatMap() method applies operation as a mapper function
        // and provides a stream of element values. It means that in each iteration of
        // each element the map() method creates a separate new stream. By using the
        // flattening mechanism, it merges all streams into a single resultant stream.
        List newList3 = numList.stream()
                .flatMap(x -> Stream.of(x, x+1))
                .collect(Collectors.toList());

        System.out.println("new list with FlatMap: " + newList3);
    }
}
