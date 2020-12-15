package com.dhruvadeep.flowcontrol.loops;

public class ForEach {
    public static void main(String[] args) {
//        for(dataType item : array) {
//          ...    //=> item->array value
//        }

        //Eg. Sum of the arrays
        int[] numbers = {11, 23, 12, 12, 12};
        int sum = 0;
        for(int summ: numbers) {
            sum += summ;
        }
        System.out.println(sum);


        //Second way
        sum = 0; //Refactoring
        for(int i=0; i< numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
