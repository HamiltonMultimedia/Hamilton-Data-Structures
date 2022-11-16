package com.hamilton;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors);

        // Iterating over the array
        // using the sexy For-Each (:) syntax
        for (String color : colors) {
            System.out.println(color);
        }

        // Iterating over the array
        // using the built-in forEach() method
        // and the double colon (::) operator
        // also known as the Method Reference Operator
        colors.forEach(System.out::println);
    }
}
