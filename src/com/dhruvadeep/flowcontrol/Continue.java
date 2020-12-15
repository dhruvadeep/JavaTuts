package com.dhruvadeep.flowcontrol;

public class Continue {
    public static void main(String[] args) {
        //The continue statement skips the current iteration of a loop (for, while, do...while, etc).
        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if value of i is between 4 and 9
            // continue is executed
            if (i > 4 && i < 9) {
                continue; //Breaks the for loop
            }
            System.out.println(i);
        }
    }
}
