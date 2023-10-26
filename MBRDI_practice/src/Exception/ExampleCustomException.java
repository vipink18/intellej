package Exception;

public class ExampleCustomException {
    public static void main(String[] args) {
        try{
            if(example()){
                throw new CustomExeption();
            }
            else
                throw new CustomExeption1("Custom Exception 1"+ new CustomException2("vipin",10));
        }
        catch (CustomExeption customExeption){
            System.out.println("Exception Caught "+ customExeption.getMessage());
        }
        catch(CustomExeption1 customExeption1){
            System.out.println("Exception1 Caught customExeption1.getMessage(): "+ customExeption1.getMessage());
            System.out.println("customExeption1.getStackTrace() :"+ customExeption1.getStackTrace());
        }



    }public static boolean example(){
        return false;
    }
}
