package chapter8;

/*
 * Validate the complexity of a proposed password by assuring it meets these rules:
 * at least 8 characters long
 * contain an uppercase letter
 * not contain the username
 * not the same as the old password
 */

import java.util.Scanner;

public class PasswordValidator {

    private static final int LONG = 8;
    private static Scanner scanner = new Scanner(System.in);
    private static String newPassword;

    public static void main (String args[]){
        String oldPassword = "AprilThe2023";
        String userName = "pruebasQA";

        passwordValidator(oldPassword, userName);
    }

    public static void passwordValidator(String oldPassword,String userName) {


        boolean isANotValidPassword = true;

        do {
            boolean itHasAnUpperCase = false;
            System.out.println("Insert the new password");
            newPassword = scanner.next();

            if (newPassword.length() >= 8) {
                for (int i = 0; i < newPassword.length(); i++) {
                    if (Character.isUpperCase(newPassword.charAt(i))) {
                        itHasAnUpperCase = true;
                    }
                }
                if (itHasAnUpperCase) {
                    if (!newPassword.contains(userName)) {
                        if (!newPassword.equalsIgnoreCase(oldPassword)) {
                            isANotValidPassword = false;
                        }
                        else {
                            System.out.println("The New password Should be different to the old password");
                        }
                    } else {
                        System.out.println("The new password must not contain the username");
                    }
                } else {
                    System.out.println("The password must contain an uppercase letter");
                }
            }
            else {
                System.out.println("The password must be at least 8 characters long");
            }
        } while (isANotValidPassword);

    }
}
