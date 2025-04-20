import java.util.*;
import java.io.*;

class Stack_Class {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(); // Create a stack of size 5

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack after pushing elements: " + stack);

        // Pop an element from the stack
        System.out.println("Popped element: " + stack.pop());

        // Display the stack after popping an element
        System.out.println("Stack after popping an element: " + stack);
    }
}