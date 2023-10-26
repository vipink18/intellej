package hackerRank.abstraction;

public class BookChild extends Book {

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setPrivateName1(String privateName) {
       setPrivateName(privateName);
    }

    @Override
    public void setProtectedName(String protectedName) {
        this.protectedName = protectedName;
    }

    @Override
    public void setDefaultName(String defaultName) {
        this.defaultName =defaultName;
    }
}
