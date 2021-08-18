package com.company.interfaceenhancement.staticmethod;

public class StaticMethodDemoClass implements StaticMethodDemo{

    public static void main(String[] args){
        StaticMethodDemoClass obj = new StaticMethodDemoClass();

        StaticMethodDemo.show(); // Static methods can be called by the name of the interface

        obj.show();
    }

    public static void show(){
        System.out.println("I'm a normal method from this class:" + StaticMethodDemoClass.class.getName());
    }

}
