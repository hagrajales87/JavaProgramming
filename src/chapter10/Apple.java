package chapter10;

public class Apple extends Fruit{


    public Apple(){
        super(5);
    }

    public void removeSeeds(){
        System.out.println("Seeds apple removed");
    }

    public void peel(){
        System.out.println("Apple peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }
}
