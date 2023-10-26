package abstraction;

public class Main {
    public static void main(String[] args) {
        BookChild bookChild = new BookChild() ;
        System.out.println(bookChild.getTitle());
        bookChild.setTitle("The new ERA");
        System.out.println(bookChild.getTitle());
        System.out.println(bookChild.getClass());
        System.out.println(bookChild.getPrice());
        bookChild.setPrice(3.33);
        System.out.println(bookChild.getPrice());
            }
        }

