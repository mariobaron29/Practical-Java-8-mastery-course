package com.company.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        // Calculate sum of 10 numbers
        OptionalInt optSum =  IntStream.rangeClosed(1,10)
                .reduce((a,b) -> a + b);

        System.out.println("optSum: " + optSum.getAsInt());
    }
}
