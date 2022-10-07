package chapter4;

/*
    FOR LOOP
    Write a cashier program that will scan a given a number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String args[]){

        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double price;
        double total = 0;
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the " + (i+1) + " cost of the item");
            price = scanner.nextDouble();
            total += price;
        }

        scanner.close();
        System.out.println("The total is equals to: $" + total);
    }
}
