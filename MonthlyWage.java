package com.company;

import java.util.Scanner;


public class MonthlyWage {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int wage;
        int monthly_wage;
        System.out.print("Enter how many hours worked: ");
        int hours = input.nextInt();

        wage = hours * 20;
        monthly_wage = wage *20;
        System.out.println("total monthly wage is " +monthly_wage);
    }
}