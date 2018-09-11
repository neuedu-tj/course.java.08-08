package collection.map;


import java.util.*;

public class TestCase1 {

    /**
     *    Map     --> HashMap , HashTable , TreeMap
     * */
    public static void main(String[] args) {

            Map<String , Object> maps = new HashMap();

            maps.put("CN" , "China");
            maps.put("US" , "US");
            maps.put("JP" , "小日本");
//            maps.put("JP" , "小日本");

//            System.out.println(maps);

//            System.out.println(maps.get("CN"));

//            Set<String> keys = maps.keySet();
//
//            Iterator<String> it = keys.iterator();
//
//            while(it.hasNext()) {
//                String key = it.next();
//
//                System.out.println(key +" -> " + maps.get(key));
//            }

        Collection collection = maps.values();
        System.out.println(collection);


    }
}
