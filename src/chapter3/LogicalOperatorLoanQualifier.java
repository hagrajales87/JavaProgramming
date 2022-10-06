package chapter3;

/*
    NESTED IFS:
    To qualify for a loan, a person must take at least $30,000
    and have been working at their current job for at least 2 years
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main (String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearEmployed = 2;

        // Get what we don't
        System.out.println("Enter your Salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary && years >= requiredYearEmployed){

                System.out.println("Congrats! You qualify for the loan");

        }
        else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan " + "and have more than " + years +" of experience");
        }

    }
}
