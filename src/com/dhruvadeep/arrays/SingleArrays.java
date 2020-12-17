package com.dhruvadeep.arrays;

public class SingleArrays {
    public static void main(String[] args) {
        // How to declare an array in Java?
        //In Java, here is how we can declare an array.
        //
        //dataType[] arrayName;
        //dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
        //arrayName - it is an identifier
        //For example,
        //
        //double[] data;
        //Here, data is an array that can hold values of type double.



        //How many can we declare
        // How to Initialize Arrays in Java?
        //In Java, we can initialize arrays during declaration. For example,

        int[] age = {12, 23, 3, 13, 2};
//        or
        int[] age1 = new int[5];
        age1[0] = 12;
        age1[1] = 23;
        age1[2] = 3;
        age1[3] = 13;
        age1[4] = 2;
//      here [0, 4]=> index of elemet
//      GET THE ITEM Value by item[index of]


        //Printing with for each loop
        for(int age2: age1) {
            System.out.println(age2);
        }



    }
}
