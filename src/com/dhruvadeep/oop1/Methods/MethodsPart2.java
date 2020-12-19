package com.dhruvadeep.oop1.Methods;

public class MethodsPart2 {
    public static void main(String[] args) {
        //Eg. for void
        MethodsPart2 obj = new MethodsPart2();
        obj.square(10);
    }
    public void square(int a) {
        int square = a * a;
        System.out.println("Square is: " + square);
    }
}
