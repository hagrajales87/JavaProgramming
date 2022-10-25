package chapter11;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double calculateArea(){
        return length * width;
    }
}
