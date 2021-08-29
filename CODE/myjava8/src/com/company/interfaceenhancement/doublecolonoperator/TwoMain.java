package com.company.interfaceenhancement.doublecolonoperator;

public class TwoMain {

    public static void main(String[] args) {

        // With lamda function
        ConsRefFuncInterface consRefFuncInterface = () -> new Employee();
        consRefFuncInterface.getEmployee();

        // With column operator
        ConsRefFuncInterface consRefFuncInterface2 = Employee :: new;
        consRefFuncInterface2.getEmployee();
    }
}
