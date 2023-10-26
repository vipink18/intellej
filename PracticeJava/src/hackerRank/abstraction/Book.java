package hackerRank.abstraction;

public abstract class Book {
    public String name;
    private String privateName;
    protected String protectedName;
    String defaultName;

    public String getName() {
        return name;
    }

    public abstract void setName(String name);

    public String getPrivateName() {
        return privateName;
    }

    public  void setPrivateName(String privateName){
        this.privateName = privateName;
    }

    public String getProtectedName() {
        return protectedName;
    }

    public abstract void setProtectedName(String protectedName);

    public String getDefaultName() {
        return defaultName;
    }

    public abstract void setDefaultName(String defaultName) ;
}
