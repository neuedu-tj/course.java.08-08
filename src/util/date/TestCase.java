package util.date;

import java.util.Date;

public class TestCase {

    public static void main(String[] args) {

        Date now = new Date();   //

        System.out.println(now);

        System.out.println();

        System.out.println(now.getDate());

        System.out.println(now.getDay());
        System.out.println( now.getMonth() +1  );


    }

}
