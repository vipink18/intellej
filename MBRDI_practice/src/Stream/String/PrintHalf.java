package Stream.String;

import java.util.Arrays;
import java.util.List;

public class PrintHalf  {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("WooHoo", "HelloWorld","abcDef");
        list.stream().map(n -> n.substring(0, (n.length()/2))).forEach(System.out::println);

        Runnable runnable = ()-> {
            for (int i=0;i<5;i++) {
                System.out.println("thread created : "+i);
                try{
                    Thread.sleep(1000);

                }catch(InterruptedException e){
                    System.out.println(e.getStackTrace());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }



}
