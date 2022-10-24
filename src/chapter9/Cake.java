package chapter9;

public class Cake {

    private String flavor;
    private String price;

    public Cake(){
        System.out.println("Cake Default constructor");
    }

    public Cake(String flavor){
        this.flavor = flavor;
        System.out.println("Cake with an specific flavour");
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getFlavor(){
        return  flavor;
    }

    public String getPrice(){
        return  price;
    }
}
