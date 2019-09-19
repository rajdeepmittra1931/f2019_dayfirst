package com.lambton;

public class student
{
    int studentID;
    String studentName;

    void setValues()
    {
        studentID = 1;
        studentName = "Rajdeep";
    }

    void display()
    {
        System.out.println("Student ID   : " + studentID);
        System.out.println("Student Name : " + studentName);
    }
}