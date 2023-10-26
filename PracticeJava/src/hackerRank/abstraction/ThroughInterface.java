package hackerRank.abstraction;

interface Drawable{
    void draw();
}

class Circle1 implements Drawable{
    private double radius;

    Circle1(double radius){this.radius = radius;}
    public void draw(){
        System.out.println("Area of circle with radius "+radius+" :"+ (Math.PI*radius*radius));
    }
}


public class ThroughInterface {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(12);
        circle1.draw();
    }
}
