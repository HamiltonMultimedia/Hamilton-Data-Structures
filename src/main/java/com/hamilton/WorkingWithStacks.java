package com.hamilton;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        // Stacks in Java use Vectors which use Lists
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek() + " is at the top of this stack");
        System.out.println(stack.size() + " is the size of this stack");
    }
}
