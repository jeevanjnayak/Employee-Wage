package com.company;

import java.util.Random;
import java.util.Scanner;

public class MonthlyWage {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int Is_Present = 1, monthly_wage = 0, total_hour = 0;
        int day_present = 0;
        System.out.print("Enter how many hours worked: ");
        int hours = input.nextInt();
        for(int i=1;i<=31;i++) {
            Double EmpStatus = Math.floor(Math.random() * 10) % 2;
            if (EmpStatus == Is_Present) {
                if (day_present < 20 && total_hour < 100) {
                    day_present += 1;
                    total_hour += hours;
                }

            }
        }
        System.out.println("working day "+day_present);
        System.out.println("total hour worked "+total_hour);
        monthly_wage = total_hour * 20;
        System.out.println("monthly salary is "+monthly_wage);
    }
}
