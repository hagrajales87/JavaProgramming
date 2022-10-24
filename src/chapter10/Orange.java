package chapter10;

public class Orange extends Fruit{

    public Orange(){
        super(5);
    }

    public void removeSeeds(){
        System.out.println("Seeds orange removed");
    }

    public void peel(){
        System.out.println("Orange peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Orange juice is made");
    }
}
