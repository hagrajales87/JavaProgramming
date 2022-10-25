package chapter11;

public class Farm {

    public static void main(String[] args) {
        Animal pig = new Pig();
        pig.eat();
        pig.makesound();

        Animal duck = new Duck();
        duck.eat();
        duck.makesound();

        giveFood(duck);
        giveFood(pig);

    }
    public static void giveFood(Animal animal){
        if(animal instanceof Duck){
            System.out.println("Take your duck food");
        }
        if(animal instanceof Pig){
            System.out.println("Take your pig food");
        }
    }

}
