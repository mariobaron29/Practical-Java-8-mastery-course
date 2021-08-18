package com.company.interfaceenhancement.functionalinterface;

@FunctionalInterface
public interface InterfaceJava8 {

    public void show(); // only 1 abstract method

    public default void details(){

    }

    public default String enquire(){
        return "Functional interface";
    }


}
