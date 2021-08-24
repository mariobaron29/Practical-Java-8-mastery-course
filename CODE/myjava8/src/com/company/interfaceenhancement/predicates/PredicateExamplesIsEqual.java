package com.company.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExamplesIsEqual {
    public static void main(String[] args){
       String name = "John";
       Predicate<String> nameEqualityPredicate = Predicate.isEqual("John");

       System.out.println(nameEqualityPredicate.test(name));

    }
}
