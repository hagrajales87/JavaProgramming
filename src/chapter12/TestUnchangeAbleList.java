package chapter12;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestUnchangeAbleList {

    public static void main(String args[]){

        List unchangeableList = List.of("apple", "lemon", "banana");
        //unchangeableList.add("orange"); //ERROR
        //unchangeableList.remove(1); //ERROR

        Set set = Set.of("apple", "lemon", "banana");
        //set.add("orange"); //UnsupportedOperationException
        //set.remove("lemon"); //UnsupportedOperationException

        Map map = Map.of("apple", 95, "lemon", 20);
        //map.remove("apple"); //ERROR
        //map.put("banana", 105); //ERROR


    }
}
