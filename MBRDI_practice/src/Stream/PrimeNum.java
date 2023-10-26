package Stream;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//import org.apache.commons.math3.primes;

public class PrimeNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,4,6,7,3,4,7,8);

        list.stream().filter(PrimeNum::isPrime).collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }

    public static boolean isPrimeCheck(int number){
//        boolean isPrime = Primes.isPrime(number);
        BigInteger bigInt = BigInteger.valueOf(number);
        return bigInt.isProbablePrime(100);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
    }
