package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){

        //1. Ask for the season of the year.
            System.out.println("Which is the current season of the year?");
            Scanner scanner = new Scanner(System.in);
            String season = scanner.next();

        //2. Insert a Whole number.
            System.out.println("Insert a whole number");
            int wholeNumber = scanner.nextInt();

        //3. Insert and adjective.
            System.out.println("Insert an adjective");
            String adjective = scanner.next();

        //4. Result
            System.out.println("On a "+adjective+" "+season+ " day, I drink a minimum of " +wholeNumber +" cups of coffee.");
    }
}
