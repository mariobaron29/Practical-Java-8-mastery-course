package com.company.interfaceenhancement.predicates;

import java.util.ArrayList;

public class PredicateDemoMainJava8 {

    public static void main(String[] args){
        // With Java 8
        Predicate<Integer> predicate = (Integer age) -> {return age > 18; };
        //OR you can also write it as
        //Predicate<Integer> predicate = age -> age > 18;
        System.out.println(predicate.test(20));

        ArrayList<String> names = new ArrayList<>();

        Predicate<ArrayList> predicate1 = (ArrayList list) -> list.isEmpty();
        System.out.println(predicate1.test(names));

        names.add("John");
        System.out.println(predicate1.test(names));

    }
}
