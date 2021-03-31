package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        try {
            String word = "Hello World";
            for (int i = 0; i <= 10000; i++) {
                System.out.println(word);
                word = "\t " + word;
                TimeUnit.SECONDS.sleep(2);
                }
            }
         catch (Exception e) {
        }
    }
}
