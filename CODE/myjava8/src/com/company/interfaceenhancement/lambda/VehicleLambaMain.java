package com.company.interfaceenhancement.lambda;

public class VehicleLambaMain {

    public static void main(String[] args){
        System.out.println("Main Lambda method");

        Vehicle vehicle = () -> {
            System.out.println("Vehicle details from Lambda");
        };
        vehicle.details();

        Calculator calculator = (Integer a, Integer b) -> {
            return a+b;
        };

        Integer result = calculator.add(5, 7);
        System.out.println("Calc add: " + result);
    }
}

