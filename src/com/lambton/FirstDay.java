
package com.lambton;

import java.util.Arrays;

public class FirstDay
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java Programming");

        //Variable declaration
        int a, b, c;

        //Value Assignment
        a = 10;
        b = 20;

        c = a + b;

        //Display Result
        System.out.println("SUM : " + c);

        int x = Integer.MAX_VALUE;
        System.out.println("X : " + x);

        int y = x + 1;
        System.out.println("Y : " + y);
        System.out.println("Min : " + Integer.MIN_VALUE);



        student s1 = new student();
        s1.setValues();
        s1.display();

        student s2 = new student();
        s2.studentID = 2;
        s2.studentName = "RAJDEEEP";
        s2.display();

        student s3 = new student();
        s3.studentID = 3;
        s3.studentName = "RSAJ";
        s3.display();



    }
}