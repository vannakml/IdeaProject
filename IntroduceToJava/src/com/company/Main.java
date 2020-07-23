package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("I miss you.");
        System.out.println("Java is complicated");

        // Data type

        // 8 bits = 1 byte
        // 1 bit could be 0's or 1's
        byte userage1 = 20; // 1 byte of storage space. range -128 to 127 (-2^8 to 2^8 - 1)
        short userage2 = 20; // 2 bytes of storage space. range -32768 to 32767 (-2^16 to 2^16 - 1)
        int userage3 = 19;  // 4 bytes of storage space. range -2^31 to 2^31 - 1
        long numberOfInhabitants = 21021313012678L; // 8 bytes of storage space. range -2^63 to 2^63 - 1
        // It is rarely used unless you really need to store a very large integer.
        // In order to specify a long value, you have to add a suffix "L" to the end of the number.
        float userTall = 1.70F; // 4 bytes of storage space. range approximately
        // It has precision of about 7 digits. If the float store more than 7 digits it will round off 7 digits.
        // By default, whenever you specify a floating point in Java, it is automatically considered to be a Double.
        // If you want Java to treat the floating point number as a float, you have to add suffix "F" to the end of number.
        double usertall = 1.70; // 8 bytes of storage space. precision 15 digits. range -1.79769313486231570 x 10^308 to 1.79769313486231570 x 10^308
        char Unicode_character = 'A'; // 2 bytes of storage space. store single unicode character
        // To initialize char data type, we need to enclose the character in single quote.
        boolean TrueOrFalse = true; // only two value true or false

        // Naming a variable
        // A variable in Java can only contain letters, numbers, underscore(_) or the dollar sign($).
        // The first character cannot be a number

        // Initializing a Variable
        // Every time you declare a new variable, you need to give it an initial value.
        // You can change the value of the variable in your program later.
        // We can declare and initialize two variable of the same data type in one statement.
        // Declare and initialize a variable in two separate statement :
        byte year; // Declare variable first
        year = 20; // Initialize it later

        // Assignment operator
        // The sign = means we are assigning the right hand_side value to the left hand_side
        int x = 5;
        int y = 10;
        x = y;
        System.out.println(x);
        System.out.println(y);

        // Basic operator
        int X = 7, Y = 3;
        // Addition +
        // Subtraction -
        // Multiplication *
        // Division
        // Modulus
        // In Java, division gives an integer answer if both X and Y are integer.
        // However, if either X or Y is a non integer, we will get a non integer answer.

        // More assignment operator
        // +=, -=, *=
        // x -= 2 or x = x - 2
        // Most programming language also have the ++ and -- operator
        // ++ used to increase the value of a variable by 1
        // ++ can be in front of behind the variable name.
        int counter = 1;
        // counter++
        System.out.println(counter++); // the program will print the original value first and incrementing.
        // Now counter = 2
        // ++counter
        System.out.println(++counter); // the program will incrementing first and print it out.

        // Type casting In Java
        // Sometimes it is necessary to convert from one data type to another, such as from double to int.
        // If we want to convert a smaller data type into a large data type we do not need to do anything explicitly.
        short age = 10;
        double myDouble = age;
        // However if we want to convert form large data type to smaller data type, we need to indicate it explicitly using a pair of parenthesis.
        int x1 = (int) 20.9;
        // Narrowing conversion is not safe and should be avoided. the value here is 20 not 21.
        float num1 = (float) 20.9; // no need suffix "F". The value will be 20.9

        // Chapter4: Array and String

        // String
        // Need to enclose the string in a double quote


    }
}
