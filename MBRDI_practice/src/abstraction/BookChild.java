package abstraction;

public class BookChild extends Book{
    @Override
    void setTitle(String s) {
        this.title = s;
    }

    @Override
    void setPrice(double p) {
        price = p;
    }

    @Override
    double getPrice() {
        return price;
    }
}
