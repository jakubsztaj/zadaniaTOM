package com.company;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static String getletters(String input, boolean isEven) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> (i % 2 == 0) == isEven ? Character.toString(input.charAt(i)) : " ")
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i <= 100; i++) {
                String word = "Hello World";
                System.out.println(getletters(word, true));
                TimeUnit.SECONDS.sleep(1);
                System.out.println(getletters(word, false));
                TimeUnit.SECONDS.sleep(1);

            }
        } catch (Exception e) {
        }
    }
}
