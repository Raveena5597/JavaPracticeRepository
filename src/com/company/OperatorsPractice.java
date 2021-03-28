package com.company;

public class OperatorsPractice {
    /*
    1. Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.
    2.Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.
    3.Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
    4.Write a program to check if the two numbers 23 and 45 are equal.
    5.Write a program to print the power of 7 raised to 5.
    6.Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true.
    */
    public static void main(String[] args) {
        //1
        int length = 5;
        int breadth = 7;
        System.out.println("Area="+(length*breadth)+"\nPerimeter="+(2*(length+breadth)));
        //2
        int l=2,b=3,h=5;
        System.out.println("Perimeter of a triangle="+(l+b+h));
        //3
        System.out.println((((8+2345)/3)%5)*5);
        //4
        System.out.println(23==45);
        //5
        System.out.println(Math.pow(7,5));
        //6
        
    }
}
