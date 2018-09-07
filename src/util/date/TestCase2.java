package util.date;

import java.util.Calendar;
import java.util.Date;

public class TestCase2 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.DAY_OF_MONTH));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c.get(Calendar.AM_PM));


//        Date now = new Date();
//        System.out.println( now.before(new Date(0)));
            c.add(Calendar.DAY_OF_YEAR, 100);
            System.out.println(c.getTime() );



    }
}
