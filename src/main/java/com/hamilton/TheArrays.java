package com.hamilton;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "blue";
        colors[1] = "purple";

        System.out.println(Arrays.toString(colors));

        colors[2] = "yellow";

        int[] numbers = {100, 200};

        // Loop through the array iteratively.
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // Reversed the iteration
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        // For-Each loop with colon (:) syntax
        for (String color : colors) {
            System.out.println(color);
        }

        // Using built-in stream() method from Arrays class
        Arrays.stream(colors).forEach(System.out::println);


    }
}
