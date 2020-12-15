package com.dhruvadeep.flowcontrol;

public class Break {
    public static void main(String[] args) {
        //The break statement in Java terminates the loop immediately,
        //and the control of the program moves to the next statement following the loop.
        // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }


        //Also it can break Labeled loops
        //Eg
        first:
        for( int i = 1; i < 5; i++) {

            // the for loop is labeled as second
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);

                // the break statement breaks the first for loop
                if ( i == 2)
                    break first;
            }
        }
    }
}
