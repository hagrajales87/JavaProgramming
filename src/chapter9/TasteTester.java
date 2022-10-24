package chapter9;

public class TasteTester {

    public static void main (String args[]){
        Cake cake = new Cake();
        cake.setFlavor("Chocolate");
        cake.setPrice("80");
        System.out.println("Our " + cake.getFlavor() + " and has a price of " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavor("Red fruits");
        birthdayCake.setPrice("100");
        birthdayCake.setCandles(12);

        System.out.println("Our " + birthdayCake.getFlavor() + " birthday cake " + " with " + birthdayCake.getCandles() + " candles, has a price of $" + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice("400");
        weddingCake.setTiers(3);
        System.out.println("Our " + weddingCake.getFlavor() + " birthday cake " + " with " + weddingCake.getTiers() + " tiers, has a price of $" + weddingCake.getPrice());

    }
}
