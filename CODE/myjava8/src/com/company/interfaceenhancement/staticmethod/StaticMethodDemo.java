package com.company.interfaceenhancement.staticmethod;

public interface StaticMethodDemo {

    public static void show(){ // staic methods aren't available in implementing class, you can have mre than 1 static methods per interface
        System.out.println("I am a Java 8 static method.");
    }
}
