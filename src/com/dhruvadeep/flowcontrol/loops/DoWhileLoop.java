package com.dhruvadeep.flowcontrol.loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //The do...while loop is similar to while loop.
        //However, the body of do...while loop is executed once before the test expression is checked.
        //For example,

        /*

         do {
            ----Statement----
         } while ()

         */

        //Printing 1 to 10
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while(number <= 10);
    }
}
