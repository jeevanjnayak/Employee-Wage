package com.company;

public class trimonthly {

    public static void main(String[] args) {
        int Is_Present = 1;
        Double EmpStatus = Math.floor(Math.random() * 10) % 2;
        if(EmpStatus == Is_Present)
            System.out.println("The employee is present");
        else
            System.out.println("The employee is absent");


    }
}
