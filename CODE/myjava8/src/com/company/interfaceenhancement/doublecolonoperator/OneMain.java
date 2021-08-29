package com.company.interfaceenhancement.doublecolonoperator;

public class OneMain {

    public static void main(String[] args) {
        LambdaOne lambdaOne = () -> System.out.println("From LambdaOne");
        lambdaOne.show();

        Employee employee = new Employee();

        // with no parameters
        LambdaOne lambaOne2 = employee :: details;
        lambaOne2.show();

        // with parameter
        LambdaTwo lambdaTwo = employee :: details2;
        lambdaTwo.show2(55);

        // with static class
        LambdaTwo lambdaTwoStatic = Employee :: detailsStatic;
        lambdaTwoStatic.show2(55);
    }

}
