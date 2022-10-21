package chapter8;

import java.util.Scanner;

/*
 * Write a method that prints a given String
 * backwards. For example if given 'camel',
 * it prints 'lemac'
 */
public class BackwardsWords {

    public static void main (String args[]){
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a word");
        text = scanner.nextLine();
        reverseString(text);
        scanner.close();
    }

    /**
     * Prints a String in reverse order
     * @param word String to reverse
     */
    public static void reverseString(String text){
        for(int i= text.length()-1 ; i >= 0 ; i--){
            System.out.print(text.charAt(i));
        }
    }
}
