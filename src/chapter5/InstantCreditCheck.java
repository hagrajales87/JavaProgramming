package chapter5;

import java.util.Scanner;

/*
    VARIABLE SCOPE
    Write an 'instant credit check' program that approves
    anyone who makes more than $25,000 and has a credit score
    of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requieredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //Initialize what we kno

        double salary;
        int creditScore;

        //Get what we don't know
        salary =getSalary();
        creditScore = getCreditScore();
        scanner.close();

        //Check if the user is qualified
        boolean qualified =isUserQualified(salary, creditScore);

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your CreditScore:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(double salary, int creditScore ){

        if(salary >= requiredSalary && creditScore >= requieredCreditScore){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean qualified){
        if(qualified){
            System.out.println("Congratulations your instant credit check was approved");
        }
        else{
            System.out.println("Sorry your instant credit check was not approved");
        }
    }
}
