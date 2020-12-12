package com.dhruvadeep.datatypes.nonprimitive;
import java.util.Arrays;

public class ArrayTypes {
    public static void main(String[] args) {
        int[] names = new int[5];
        names[0] = 1;
        names[1] = 2;
        names[2] = 3;
        names[3] = 4;
        names[4] = 5;
        System.out.println(names);
        //Given Print will be ID OF THE LOcation
        //We use Arrays.toString() => to convert it to strings
        System.out.println(Arrays.toString(names));
    }
}
