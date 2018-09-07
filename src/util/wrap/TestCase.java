package util.wrap;

public class TestCase {

    public static void main(String[] args) {

        int a = 0 ;

        String info = "10";

        System.out.println(Integer.parseInt(info)+1+"10"+23+4+45  );

        System.out.println(Integer.toBinaryString(3));

        Integer x = 1200;
        Integer y = 1200;   //Integer-> cache  --> -128-127

        System.out.println(x.equals(y));
        System.out.println( x == y );


        Integer z = new Integer(100);


    }

}
