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
        long userage4 = 19; // 8 bytes of storage space. range -2^63 to 2^63 - 1
        float userTall = 1.70F; // 4 bytes of storage space. range approximately
        double usertall = 1.70; // 8 bytes of storage space. precision 15 digits. range -1.79769313486231570 x 10^308 to 1.79769313486231570 x 10^308
        char Unicode_character = 'A'; // 2 bytes of storage space. store single unicode character
        boolean TrueOrFalse = true; // only two value true or false

        // Naming a variable
        // A variable in Java can only contain letters, numbers, underscore(_) or the dollar sign($).
        // The first character cannot be a number

        // Initializing a Variable
        // Every time you declare a new variable, you need to give it an initial value.
        // You can change the value of the variable in your program later.


        System.out.println(userage1);
    }
}
