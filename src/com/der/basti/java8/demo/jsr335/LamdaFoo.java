package com.der.basti.java8.demo.jsr335;

import java.util.concurrent.TimeUnit;

public class LamdaFoo {

	public static void runThreadUseLambda() {
        new Thread(() -> System.out.println("lambda")).start();
    }

    public static void runThreadUseInnerClass() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inner class");
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        runThreadUseLambda();
        runThreadUseInnerClass();

        TimeUnit.SECONDS.sleep(1);
    }
}
