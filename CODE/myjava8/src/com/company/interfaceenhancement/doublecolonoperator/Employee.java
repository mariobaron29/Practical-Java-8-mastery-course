package com.company.interfaceenhancement.doublecolonoperator;

public class Employee {

    public Employee(){
        System.out.println("Default constructor");
    }

    public void details(){
        System.out.println("Showing employee details");
    }

    public void details2(int num){
        System.out.println("Showing employee details: " + num);
    }

    public static void detailsStatic(int num){
        System.out.println("Showing employee details static: " + num);
    }
}
