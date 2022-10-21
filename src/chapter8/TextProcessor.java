package chapter8;

/*
 * Write a method that counts the number of words in a String
 * and prints them individually on a new line.
 */

public class TextProcessor {

    public static void main(String[] args){
        countWords("I love Test Automation University");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Count words and prints them
     * @param text Full string to be split.
     */
    public static  void countWords(String text){

        var words = text.split(" ");
        for(var word : words){
            System.out.println(word);
        }
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);
    }
}
