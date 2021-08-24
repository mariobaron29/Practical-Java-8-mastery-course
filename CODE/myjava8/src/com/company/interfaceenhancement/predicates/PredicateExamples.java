package com.company.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args){
        Integer[] numbers = {2,6,9,4,8,22,19};
        Predicate<Integer> isOdd = num -> num % 2 != 0;

        for(Integer num: numbers){
            if(isOdd.test(num)){
                System.out.println("Odd num: "+ num);
            }else if(isOdd.negate().test(num)){
                System.out.println("Even num: "+ num);
            }
        }

        System.out.println("Greater than 10");
        // find all od numbers greater than 10
        Predicate<Integer> gt10 = num -> num > 10;
        for(Integer num: numbers) {
            if (gt10.and(isOdd).test(num)) {
                System.out.println("Odd num  greater than 10: " + num);
            }
        }

    }
}
