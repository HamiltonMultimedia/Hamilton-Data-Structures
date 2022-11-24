package com.hamilton;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, WorkingWithQueues.Person> map = new HashMap<>();
        map.put(1, new WorkingWithQueues.Person("Alex", 21));
        map.put(2, new WorkingWithQueues.Person("Alexa", 23));
        map.put(3, new WorkingWithQueues.Person("Veronica", 31));
        System.out.println(map);
    }
}