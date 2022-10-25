package chapter12;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String args[]){

        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);

        System.out.println(fruit.peek()); //Return the head of the Queue
    }
}
