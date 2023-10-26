package Exception;

public class CustomException2 extends Throwable{
        CustomException2(){

            super();
            System.out.println("CustomException2 occurred ");
        }
        CustomException2(String msg){
            super(msg);

        }
        CustomException2(String a,int ab){
            this("this method called");
        }
}
