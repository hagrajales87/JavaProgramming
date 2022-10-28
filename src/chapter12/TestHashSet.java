package chapter12;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHashSet {
    public static void main (String[] args){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        List fruitTwo = new ArrayList();
        fruitTwo.add("apple");
        fruitTwo.add("lemon");
        fruitTwo.add("banana");
        fruitTwo.add("orange");
        fruitTwo.add("lemon");

        System.out.println(fruitTwo.get(2));
        System.out.println(fruitTwo.size());
        System.out.println(fruitTwo);

    }

}
