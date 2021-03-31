package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i <= 10000; i++) {
                System.out.println("Hello");
                TimeUnit.SECONDS.sleep(2);
            }
        } catch (Exception e) {
        }
    }
}
