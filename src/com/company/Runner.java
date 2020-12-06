package com.company;

public class Runner implements Runnable {
    private int name;


    public void run() {

        for (int i = 1; i < 5; i++) {
            Thread.currentThread().setName(String.valueOf(i));
            System.out.println("Runner  " + Thread.currentThread().getName() + "   берет палочку");
            System.out.println("Runner  " + Thread.currentThread().getName() + "  бежит к  Runner " + (i + 1));
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {

            }
        }

        System.out.println("Runner   5 берет палочку ");
        System.out.println("Runner  5  бежит к финишу");


        for (int j = 5; j >1; j--) {
            Thread.currentThread().setName(String.valueOf(j));
            System.out.println("Runner  " + Thread.currentThread().getName() + "   берет палочку");
            System.out.println("Runner  " + Thread.currentThread().getName() + "  бежит к  Runner " + (j - 1));
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {

            }
        }

        System.out.println("Runner   1  берет палочку ");

    }


}
