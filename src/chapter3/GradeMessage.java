package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message= "Excelent job!";
                break;
            case "B":
                message= "Great job!";
                break;
            case "C":
                message= "God job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh ho!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        System.out.println("Your grade is " + grade);
        System.out.println(message);
    }
}
