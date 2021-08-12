package com.company.interfaceenhancement.defaultmethod;

public class Car implements VehicleJava8{ // since it implements a Java8 default interface, it will not complain about unimplemented methods
    public static void main(String[] a){
        Car car = new Car();
        car.details();
    }

}
