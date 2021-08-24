package com.company.interfaceenhancement.lambda;

public class VehicleLambdaMain {

    public static void main(String[] args){
        System.out.println("Main Lambda method");

        Vehicle vehicle = () -> System.out.println("Vehicle details from Lambda");
        vehicle.details();

        Calculator calculator = (Integer a, Integer b) -> a+b;

        Integer result = calculator.add(5, 7);
        System.out.println("Calc add: " + result);

   /*
        TO TURN A METHOD INTO A LAMBDA FUNCTION
        1. Remove modifier
        2. Remove return type
        3. Remove the method name
        4. Add arrow sign ->
    */

        MultiplyInterface multiplyInterface = () -> System.out.println("I am a converted lambda function ");
        multiplyInterface.multiply();
    }

}

