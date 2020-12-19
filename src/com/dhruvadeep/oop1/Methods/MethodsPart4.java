package com.dhruvadeep.oop1.Methods;

public class MethodsPart4 {
    public static void main(String[] args) {
        // Methods are used for code reusability
        // Printing square table till 10
        //Calling the method class
        MethodsPart4 sqrt = new MethodsPart4();
        for(int i=0; i<=10; i++){
            int result = sqrt.square(i);
            System.out.println(result);
        }
    }
    public int square(int a) {
        return a * a;
    }
}



////////STATIC TYPE DOESNT NEED TO BE CALLED AND CAN BE USED DIRECTLY
