package chapter7;

import java.util.Arrays;
import java.util.Random;

/*
    Create a Lottery Quick Pick application that will
    generate a Lottery ticket with 6 random numbers
    between 1-69.
 */
public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;


    public static void main (String args[]){

        int[] ticket = generateNumbers();
        //Arrays.sort(ticket);
        printTicket(ticket);
    }

    public  static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i = 0 ; i < LENGTH ; i++){
            int randomNumber;

              /*
            Generate random number then search to make sure it doesn't
            already exist in the array. If it does, regenerate and search again.
             */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(binarySearch(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        //Number is unique if we get here. Add it to the array.
        return ticket;
    }

    /**
     * Does a sequential search o the array to find a value.
     * @param array Array to search through.
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not.
     */
    public static boolean search(int[] array, int numberToSearchFor){
        boolean isTheThere = false;
        /*  This is called an enhanced loop.
            It iterates through 'array'
            each time assigns the current element to 'value'
        */
        for (int value : array){
            if(value == numberToSearchFor){
                isTheThere = true;
            }
        }
        return isTheThere;
    }

    public static boolean binarySearch(int[] otherArray, int numberToSearchFor){

        //Array must be sorted first
        int[] secondArray = otherArray;
        Arrays.sort(secondArray);

        int index = Arrays.binarySearch(otherArray, numberToSearchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }


    public static void printTicket(int ticket[]){
        for(int i = 0 ; i < LENGTH ; i++){
            System.out.println("The " + (i+1) +" ticket number is: " +ticket[i]);
        }
    }
}
