package Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "apple";
        String strstr = "not bad";
        strstr.replace(strstr.charAt(2),' ');
            int length = str.length();
            StringBuilder reversed = new StringBuilder();

            for (int i = length - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
        System.out.println(reversed.toString());
        }

    }

