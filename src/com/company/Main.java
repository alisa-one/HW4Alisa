package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Запуск потока:   " + Thread.currentThread().getName());

        Runner runner = new Runner();
        Thread rnr = new Thread(runner);




            rnr.start();
            try {
                rnr.join();
            } catch (InterruptedException e) {

            }


            System.out.println("Завершение потока:   "+ Thread.currentThread().getName());




    }


}
