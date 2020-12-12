package com.dhruvadeep.datatypes.primitive;

public class CharType {
    public static void main(String[] args) {
        char letter = '\u0051'; //Unicode for letter Q
        System.out.println(letter);
        char letter2 = 51; // Still 3 => Html for 3 is 51 (HTML5 code)
        System.out.println(letter2);
    }
}

// Notes

/*
* It's a 16-bit Unicode character.
* The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
* Default value: '\u0000'
* 2 bytes in memory
*/
