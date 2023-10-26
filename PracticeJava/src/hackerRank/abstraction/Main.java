package hackerRank.abstraction;

abstract class Shape{
    public abstract double area();

    public void display(){
        System.out.println("Shape "+area());
    }
}
class Square extends Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double area(){
        return side*side;
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }


}


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        Square square = new Square(5);
        circle.display();
        square.display();
    }
}
