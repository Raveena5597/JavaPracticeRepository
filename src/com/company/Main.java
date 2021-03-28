package com.company;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Primitive Data types
        byte age = 25;
        int viewCount = 1_234_567_890;
        long billionViewCount = 1_234_567_890_123L;
        float price=10.99F;
        char letter='R';
        boolean isEligible= true;
        System.out.println(age);
        //Reference types
        Date now = new Date();
        System.out.println(now);
        //Memory allocation example for reference types
        Point point1=new Point(1,1);
        Point point2=point1;
        point1.y=4;
        System.out.println(point2);
    }
}
