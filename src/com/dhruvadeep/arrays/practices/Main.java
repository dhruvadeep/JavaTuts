package com.dhruvadeep.arrays.practices;

public class Main {
/*
* Create an array of 5 floats and calculate their sum.
* Write a program to find out whether a given integer is present in an array or not.
* Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
* Create a Java program to add two matrices of size 2x3.
* Write a Java program to reverse an array.
* Write a Java program to find the maximum element in an array.
* Write a Java program to find the maximum element in a Java array.
* Write a Java program to find whether an array is sorted or not.
*/

    public static void main(String[] args) {
        // 1. Create an array of 5 floats and calculate their sum.
        float sum = 0;
        float[] numbers = { 12.2F, 1.23F, 1.2F, 2.22F, 8.2F};
        for(float a: numbers) {
            sum += a;
        }
        System.out.println("Total: " + sum);



        // 2. Write a program to find out whether a given integer is present in an array or not.
        int num = 23;
        int[] numbers1 = {12, 23, 24, 11, 8, 1};
        boolean isPresent = false;
        for (int a: numbers1) {
            if (a==num) {
                isPresent = true;
                break;
            } else {
                isPresent = false;
            }
        }
        System.out.println(isPresent);



        // 3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        double avg;
        double total =0;
        double[] marks = {67.2, 78.2, 91.2 ,99.2, 82.1};
        for (double a: marks){
            total += a;
        }
        avg = total / marks.length;
        System.out.println("Average marks: " + avg);



        // 4. Create a Java program to add two matrices of size 2x3
        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++) {
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            } System.out.println("");
        }



        // 5. Write a Java program to reverse an array.
        int[] orderedPair = {1, 2, 3, 4, 5};
        int lenght = orderedPair.length;
        System.out.println("Ordered Array");
        for(int a: orderedPair) {
            System.out.print(a + " ");
        }
        System.out.println("\nReversed Array");
        for(int i = lenght; i>0; i--) {
            System.out.print(orderedPair[i-1] + " ");
        }



        // 6. Write a Java program to find the maximum element in an array.
        int[] num2 = {12, 36, 12, 32, 1, 92, 122};
        int largest = 0;
        for (int a: num2) {
            if (largest <= a) {
                largest = a;
            }
        }
        System.out.println("\nLargest Number from array: " + largest);



        // 7. Write a Java program to find the maximum element in a Java array
        System.out.println(Integer.MAX_VALUE);



        // 8. Check if the array is sorted
        int[] sort = {1, 2, 3, 5, 4};
        boolean isSorted = false;
        for(int i=1; i<sort.length; i++) {
            int a = sort[i-1];
            int b = sort[i];
//            System.out.println(a +" "+b);
//            Debugging purpose
            if (a <= b) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        System.out.println("Loop isSorted: " + isSorted);
    }
}
