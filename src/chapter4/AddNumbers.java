package chapter4;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    DO WHILE LOOP:
    Write a program that allows a user to enter two numbers,
    and then sums up the two numbers. The user should be able to
    repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main (String args[]){

        boolean again;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double total = num1 + num2;
            System.out.println("The total is: " + total);

            System.out.println("Would you like to start over? Press Y or N:");
            if(scanner.next().equalsIgnoreCase("y")){
                again = true;
            }
            else{
                again = false;
            }

        }while(again);

        scanner.close();
    }
}
