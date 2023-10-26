package Stream.String;

import java.util.stream.Stream;

public class StreamConcatenation {
    public static void main(String[] args) {
        Stream str1 = Stream.of("StringOne");
        Stream str2 = Stream.of("StringTwo");

        Stream.concat(str1,str2)
        .forEach(System.out::print);
    }
}
