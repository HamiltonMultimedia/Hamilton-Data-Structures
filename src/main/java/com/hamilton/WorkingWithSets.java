package com.hamilton;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.add(new Ball("black"));
        balls.add(new Ball("white"));
        System.out.println(balls.size() + " is the amount of objects contained in the balls Set");
        balls.forEach(System.out::println);
        balls.remove(new Ball("white"));
        System.out.println(balls.size() + " is the amount of objects contained in the balls Set");
        balls.forEach(System.out::println);
    }

    record Ball(String color) {

    }
}
