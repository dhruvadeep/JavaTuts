package com.dhruvadeep.arrays;

public class MultiArrays {
    public static void main(String[] args) {
//        int[][] a = new int[3][4];
        // 3=> rows
        // 4=> columns
        // 3rd => 3D
        int[][] a = {
                {1,2,3},
                {4,5,6,9},
                {7}
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        // Printing all elements
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}




