package com.company.interfaceenhancement.defaultmethod;

public class Bus implements VehicleJava7{
    // the fact that it implements from a Java 7 interface, makes you implement all the methods that you might add to the interface on all the classes that implement from it

    void show(){
        Bus b = new Bus();
        b.details();

    }

    @Override
    public void details() {

    }
}
