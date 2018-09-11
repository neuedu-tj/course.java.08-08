package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestCase {

    public static void main(String[] args) {

        Set sets = new HashSet();

//        sets.add("4");
//        sets.add(1);
//        sets.add(3);
//        sets.add(2);
//
//        sets.add(1);


            sets.add("II");
            sets.add("I");
            sets.add("III");
            sets.add("IV");



        System.out.println(sets);

        Iterator it = sets.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
