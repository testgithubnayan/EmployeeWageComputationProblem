package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");
        int empPresent = (int) (Math.floor(Math.random() * 10) % 2);
        if(empPresent == 1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
