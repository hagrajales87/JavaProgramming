package chapter10;

public class Juice {

    public static void main(String args[]){
        Apple apple = new Apple();
        System.out.println("The apple has " + apple.getCalories() + " calories");
        apple.peel();
        apple.makeJuice();

        Orange orange = new Orange();
        System.out.println("The orange has " + orange.getCalories() + " calories");
        orange.peel();
        orange.makeJuice();

        Fruit greenApple = new Apple();
        System.out.println("The green apple has " + greenApple.getCalories() + " calories");
        ((Apple) greenApple).peel();
        greenApple.makeJuice();

        Fruit tangeloOrange = new Orange();
        tangeloOrange.setCalories(6);
        System.out.println("The green apple has " + tangeloOrange.getCalories() + " calories");
        tangeloOrange.makeJuice();

        Fruit fruit = new Fruit();

        giveTheJuice(tangeloOrange);
        giveTheJuice(apple);
        giveTheJuice(fruit);

    }

    public static void giveTheJuice(Fruit fruit){
        if(fruit instanceof Orange){
            System.out.println("Here is your Orange Juice");
        }else if(fruit instanceof Apple) {
            System.out.println("Here is your Apple Juice");
        }else{
            System.out.println("Unknown fruit");
        }
    }
}
