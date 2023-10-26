package Exception;

public class CustomExeption extends RuntimeException{

    CustomExeption(String msg){
        super(msg);
    }
    CustomExeption(){
        super("This is the Custom exception");
    }

}
