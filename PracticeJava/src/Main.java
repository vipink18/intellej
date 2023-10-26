import hackerRank.abstraction.BookChild;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BookChild bookChild = new BookChild();

        bookChild.setName("Public Name");
        System.out.println(bookChild.getName());

        bookChild.setPrivateName1("Private Name");
        System.out.println(bookChild.getPrivateName());

        bookChild.setProtectedName("Protected Name");
        System.out.println(bookChild.getProtectedName());

        bookChild.setDefaultName("Default Name");
        System.out.println(bookChild.getDefaultName());

    }
}