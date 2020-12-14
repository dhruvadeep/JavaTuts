package com.dhruvadeep.flowcontrol.loops;

public class ForLoop {
    public static void main(String[] args) {
        int sum=0;
//        for (initialExpression; testExpression; updateExpression) {
//            // body of the loop
//        }
//
//        Here,
//
//                The initialExpression initializes and/or declares variables and executes only once.
//        The condition is evaluated. If the condition is true, the body of the for loop is executed.
//                The updateExpression updates the value of initialExpression.
//        The condition is evaluated again. The process continues until the condition is false.


        //fOR LOOPS TO GET SUM FROM RANGE
        for(int i=1; i<=100; i++ ){
            sum += i;
        }
        System.out.printf("Total: %d\n\n", sum);




        //For-Each Element
        //Declaring a array
        String[] birds = {
                "Peacock",
                "Hen",
                "Sparrow",
                "Nightingale"
        };

        for (String name: birds) {
            System.out.printf("Name of Bird: %s\n", name);
        }







    }
}
