package com.company.interfaceenhancement.predicates;

public class PredicateDemoMain {

    public static void main(String[] args){
        // With Java 7
        Predicate predicate = new PredicateDemo();
        boolean result = predicate.test(20);

        System.out.println(result);

    }
}
