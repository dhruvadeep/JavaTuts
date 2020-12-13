package com.dhruvadeep.input.output;

public class Output {
    public static void main(String[] args) {
        int age = 16;

        System.out.println(age); //It prints string inside the quotes similar like print() method.
                                  // Then the cursor moves to the beginning of the next line.

        System.out.print(age+"\n"); //It prints string inside the quotes.

        System.out.printf("Hello %ds", age); //Same as C/C++ => printf
    }
}

