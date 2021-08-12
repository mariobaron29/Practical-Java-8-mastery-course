package com.company.interfaceenhancement.defaultmethod;

public interface VehicleJava8 {

    default void details(){ // By default available to all implementing classes
        System.out.println("I am a Java 8 default method");
    }

    default void mileage(){

    }
}
