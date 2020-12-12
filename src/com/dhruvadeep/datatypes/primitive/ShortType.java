package com.dhruvadeep.datatypes.primitive;

public class ShortType {
    public static void main(String[] args) {
        short temperature;
        temperature = -200;
        System.out.println(temperature);
    }
}

/*
* The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
* If it's certain that the value of a variable will be within -32768 and 32767, then it is used instead of other integer data types (int, long).
* Default value: 0
* 2 byte in memory
*/