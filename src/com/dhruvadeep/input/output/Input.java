package com.dhruvadeep.input.output;
import java.util.Scanner; //Importing the class library

public class Input {
    public static void main(String[] args) {
        //Calling the Scanner function
        Scanner input = new Scanner(System.in);
        //System.in => Keyboard input

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        //nextInt() => integer type
        //nextDouble() => Double type
        //next() => String type

        System.out.println(age); //Printing the input


        //we also need to close the class or it will take memory
        input.close();
    }
}
