package Stream.String;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str1 = "Hello World my name is vipin katiyar";
        char c = str1.chars().mapToObj(n -> (char)(n)).filter(s -> str1.indexOf(s)!= str1.lastIndexOf(s)).findFirst().get();
        System.out.println(c);
    }
}

