package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 *     ListIterator
 * */

public class TestCase4 {

    public static void main(String[] args) {

        List<String> data = new ArrayList();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("e");


        ListIterator<String> it = data.listIterator();

        while(it.hasNext()) {
            String info  = it.next();
            System.out.println(info);
        }

        System.out.println("-----------------");

        while(it.hasPrevious()) {
            String info  = it.previous();
            System.out.println(info);
        }


//        System.out.println(data);

    }

}
