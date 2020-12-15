package com.dhruvadeep.flowcontrol.loops;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Sum of positive numbers and loop
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while(number >= 0){
            sum += number;
            System.out.print("Enter a nuber: ");
            number = input.nextInt();
        } //While End

        System.out.printf("Sum of all numbers: %d", sum);
    }
}
