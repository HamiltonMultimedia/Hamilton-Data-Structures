package com.hamilton;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<WorkingWithQueues.Person> linkedList = new LinkedList<>();
        linkedList.add(new WorkingWithQueues.Person("Alex", 21));
        linkedList.add(new WorkingWithQueues.Person("Alexa", 21));
        ListIterator<WorkingWithQueues.Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next() + " from next node");
        }
        System.out.println("=================================================");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous() + " from previous node");
        }

    }
}
