package com.company;

import java.util.Random;
import java.util.Scanner;

public class EmpPresent {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int Is_Present = 1,daily_wage = 0, monthly_wage = 0;
        int day_present = 0;
        System.out.print("Enter how many hours worked: ");
        int hours = input.nextInt();
        for(int i=1;i<=31;i++) {
            Double EmpStatus = Math.floor(Math.random() * 10) % 2;
            if (EmpStatus == Is_Present) {
                day_present += 1;

            }
        }
        daily_wage = hours * 20;
        monthly_wage = daily_wage * day_present;
        System.out.println("monthly salary is "+monthly_wage);
    }
}
