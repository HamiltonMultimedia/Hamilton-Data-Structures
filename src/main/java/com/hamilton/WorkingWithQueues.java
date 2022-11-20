package com.hamilton;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size() + " is the amount in this queue");
        System.out.println(supermarket.peek() + " is the object at the top of this queue");
        System.out.println(supermarket.poll() + " will be removed from this queue");
        System.out.println(supermarket.size() + " this is the new size of the queue");
        System.out.println(supermarket.peek() + " is the new object at the top of this queue");
    }
    static record Person(String name, int age) {

    }
}
