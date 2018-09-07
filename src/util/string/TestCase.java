package util.string;

public class TestCase {

    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        String str3 = "Hello";   // 先找 .
        String str4 = "Hello";


        System.out.println(str1.equals(str2));

        System.out.println( str1 == str2 );

        System.out.println( str3 == str4 );

    }
}
