package Employeewage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");//Employee wage UC1
        //Without OOPs
//        int EmployeeAttendance= 0;
//        //Using random class
//        Random rand= new Random();
//        EmployeeAttendance= rand.nextInt(2);
//        System.out.println(EmployeeAttendance);
//
//        if(EmployeeAttendance == 1){
//            System.out.println("Employee is present!");
//        }
//        else {
//            System.out.println("Employee is absent!");
//        }
        
        //Using OOPS
        //creating object
        EmployeeWage emp=new EmployeeWage();
        //As this is in same class, we can use that method
        emp.Employeecheck();
    }

    //Making private to use abstraction concept
    private void Employeecheck(){
        int EmployeeAttendance= 0;
        //Using random class
        Random rand= new Random();
        EmployeeAttendance= rand.nextInt(2);
        System.out.println(EmployeeAttendance);

        if(EmployeeAttendance == 1){
            System.out.println("Employee is present!");
        }
        else {
            System.out.println("Employee is absent!");
        }
    }
}
