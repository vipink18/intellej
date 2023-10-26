package abstraction;

abstract class Book{
    String title;
    double price;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
    abstract void setPrice(double p);
    abstract double getPrice();
}
