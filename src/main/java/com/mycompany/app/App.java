package com.mycompany.app;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
