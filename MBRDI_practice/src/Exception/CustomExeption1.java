package Exception;

public class CustomExeption1 extends Exception {
    CustomExeption1(){
        super("CustomException1 is thrown");
        super.getMessage();
        this.getMessage();

    }
    CustomExeption1(String msg){
        super(msg);
    }
}
