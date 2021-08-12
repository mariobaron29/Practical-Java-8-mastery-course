package com.company.interfaceenhancement.lambda.thread;

public class ThreadMain {

    public static void main(String[] a) {

        //Runnable runnable = new CodeToRunAsSeparateThread(); // Thanks to Lambda expressions we no longer need to do this or create a class that implements Runnable
        Runnable runnable = () -> {
            for(Integer count = 0; count <5; count++){
                System.out.println("Child thread counter value is: " + count);
            }
        };

        Thread thread1 = new Thread(runnable);

        thread1.start();

        for(Integer count = 0; count <5; count++){
            System.out.println("Main thread counter value is: " + count);
        }
    }
}
