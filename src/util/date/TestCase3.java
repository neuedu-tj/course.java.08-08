package util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCase3 {
    public static void main(String[] args) throws Exception {

        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = sdf.format(now);

        System.out.println(time);

        System.out.println("----------------------------");

        String info = "2018-09-07 02:58:47";
        Date time2 = sdf.parse(info);
        System.out.println(time2);

    }
}
