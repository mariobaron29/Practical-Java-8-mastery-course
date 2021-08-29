package com.company.stream;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAvgSummarizing {
    public static void main(String[] args) {

        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(11);
        numberSet.add(12);
        numberSet.add(13);
        numberSet.add(14);
        numberSet.add(15);
Set<Integer> numberSet2 = new HashSet<>();
        numberSet2.add(11);
        numberSet2.add(12);
        numberSet2.add(13);
        numberSet2.add(224);
        numberSet2.add(15);
        numberSet2.add(105);

        Double avg = numberSet.stream()
                .collect(Collectors.averagingInt(value -> value));

        System.out.println("Avg: " + avg);

        IntSummaryStatistics sumStats = numberSet.stream()
                .collect(Collectors.summarizingInt(value -> value));

        System.out.println("sumStats: " + sumStats);

        IntSummaryStatistics sumStats2 = numberSet.stream()
                .collect(Collectors.summarizingInt(value -> value));

        System.out.println("sumStats2: " + sumStats2);

        sumStats.combine(sumStats2); // Combines both summaries

        System.out.println("sumStats combine with sumStats2: " + sumStats);

    }
}
