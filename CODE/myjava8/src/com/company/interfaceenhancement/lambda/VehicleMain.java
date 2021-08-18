package com.company.interfaceenhancement.lambda;

public class VehicleMain {

    public static void main(String[] args){
        System.out.println("Main method");

        VehicleImpl vehicleImpl = new VehicleImpl();
        vehicleImpl.details();

        Vehicle vehicle = new VehicleImpl();
        vehicle.details();
    }
}
