package com.company;

import java.util.Scanner;


public class EmpWage {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int Is_Present = 1;
        int wage;
        double EmpStatus = Math.floor(Math.random() * 10) % 2;
        if (EmpStatus == Is_Present) {
            System.out.print("Enter how many hours worked: ");
            int hours = input.nextInt();
            wage = hours * 20;
            if (hours == 8)
                System.out.println("full time wage is " + wage);
            else if(hours < 8)
                System.out.println("part time wage is " + wage);
            else
                System.out.println("invalid hour");
        } else
            System.out.println("Employee is absent");
    }
}