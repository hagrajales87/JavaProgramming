package chapter6;

/*
    Write a class that creates instances of the Rectangle class to find the
    total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String args[]){
        /************
         * RECTANGLE 1
         ************/

        // Create instance of Rectangles class
        Rectangle room1 = new Rectangle();
        room1.setLength(3);
        room1.setWidth(3);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("The first room area: "+areaOfRoom1);
        System.out.println("The perimeter is: " + room1.calculatePerimeter());

        /************
         * RECTANGLE 2
         ************/
        // Create instance of Rectangles class
        Rectangle room2 = new Rectangle(4, 4);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("The first room area: "+areaOfRoom2);

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: "+ totalArea);
    }
}
