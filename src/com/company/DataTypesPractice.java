package com.company;

public class DataTypesPractice {
    /*
    1.Write a Java program to print an int, a double and a char on screen.
    2.Write a program to print the area of a rectangle of sides 2 and 3 units respectively.
    3.Write a program to print the product of the numbers 8.2 and 6.
    4.Print the ASCII value of the character 'h'.
    5.Write a program to assign a value of 100.235 to a double variable and then convert it to int.
    6.Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
    7.Write a program to add an integer variable having value 5 and a double variable having value 6.2.
    8.Write a program to find the square of the number 3.9.
     */
    public static void main(String[] args) {
        int a = 1234567890;
        double b = 1.123456789012345678901234567890123456789012234566585;
        char c = 'R';
        System.out.println("int:" + a + "\ndouble:" + b + "\nchar:" + c);
        //2
        int length = 2;
        int breadth = 3;
        int area = length * breadth;
        System.out.println(area);
        //3
        System.out.println(8.2 * 6);
        //4
        System.out.println((int) 'h');
        //5
        double x = 100.235;
        System.out.println((int) x);
        //6
        int q = 3 + 'd';
        System.out.println((char) q);
        //7
        int p = 5;
        double r = 6.2;
        System.out.println(p + r);
        //8
        System.out.println(3.9*3.9);

    }
}
