package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *     Iterator
 *
 * */

public class TestCase3 {

    public static void main(String[] args) {

        List<String> data = new ArrayList();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("e");


//        for (int i = 0; i < data.size(); i++) {
//            data.remove(i);
//        }

//        for (int i = data.size() - 1; i >= 0; i--) {
//            data.remove(i);
//        }

//        for (String s : data  ) {
//            data.remove(s);  // java.util.ConcurrentModificationException
//        }


        Iterator<String> it = data.iterator();

        while(it.hasNext()) {
            String info  = it.next();
            it.remove();
        }


        System.out.println(data);

    }

}
