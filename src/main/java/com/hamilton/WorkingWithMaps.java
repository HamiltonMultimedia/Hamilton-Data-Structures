package com.hamilton;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
//        maps();
        maps();
        Map<WorkingWithQueues.Person, Diamond> map = new HashMap<>();
        map.put(new WorkingWithQueues.Person("Victoria", 30), new Diamond("Congo Diamond"));
        System.out.println(map.get(new WorkingWithQueues.Person("Victoria", 30)));
        System.out.println(map.entrySet());
    }

    private static void maps() {
        Map<Integer, WorkingWithQueues.Person> map = new HashMap<>();
        map.put(1, new WorkingWithQueues.Person("Alex", 21));
        map.put(2, new WorkingWithQueues.Person("Alexa", 23));
        map.put(3, new WorkingWithQueues.Person("Veronica", 31));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
        System.out.println(map.getOrDefault(5, new WorkingWithQueues.Person("default", 00)));
        System.out.println(map.values());
    }

    record Diamond(String name){}
}
