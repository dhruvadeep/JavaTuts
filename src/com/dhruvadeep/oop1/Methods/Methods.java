package com.dhruvadeep.oop1.Methods;

public class Methods {
    public static void main(String[] args) {
/*
A method is a block of code that performs a specific task.

Suppose you need to create a program to create a circle and color it. You can create two methods to solve this problem:

a method to draw the circle
a method to color the circle
Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.

In Java, there are two types of methods:

User-defined Methods: We can create our own method based on our requirements.
Standard Library Methods: These are built-in methods in Java that are available to use.
Let's first learn about user-defined methods.
*/

        //DECLARING A METHOD IN JAVA
        //  returnType methodName() {
        //   // method body
        //  }

/*
* Here,

returnType - It specifies what type of value a method returns For example if a method has an int return type then it returns an integer value.

If the method does not return a value, its return type is void.
nameOfMethod - It is an identifier that is used to refer to the particular method in a program.
method body - It includes the programming statements that are used to perform some tasks. The method body is enclosed inside the curly braces { }.
*/


        // For example,
        //
        //int addNumbers() {
        //// code
        //}

//        modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
//             method body
//        }

        /*
        * modifier => public, private, protected, etc
        * static =>  If we use the static keyword, it can be accessed without creating objects.
        *            For example, the sqrt() method of standard Math class is static.
        *            Hnce, we can directly call Math.sqrt() without creating an instance of Math class.
        * returnType => Data Type (int, double, etc)
        * parameter1/parameter2 => These are values passed to a method. We can pass any number of arguments to a method.
        * */


        // Calling a method
        // nameOfMethod(paramenters,....);
        //Eg.
        //Creating a object
        Methods obj = new Methods();
        int result = obj.sumOF(23, 123);
        System.out.println(result);
    }

    //Eg.
    public int sumOF(int a, int b) {
        return a + b; //Returning the value
    }
}
