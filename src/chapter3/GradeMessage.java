package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);

        String message;
        String grade;
        do {
            grade = scanner.next();

            switch (grade) {
                case "A":
                    message = "Excelent job!";
                    break;
                case "B":
                    message = "Great job!";
                    break;
                case "C":
                    message = "God job!";
                    break;
                case "D":
                    message = "You need to work a bit harder";
                    break;
                case "F":
                    message = "Uh ho!";
                    break;
                default:
                    message = "Error. Invalid grade";
                    System.out.println("Error. Invalid grade, Try Again");
                    break;
            }
        }while(message.equalsIgnoreCase("Error. Invalid grade"));

        System.out.println(message.equalsIgnoreCase(grade));
        System.out.println("Your grade is " + grade);
        System.out.println(message);
    }
}
