package collection.list;

import collection.list.compare.CompareByPrice;
import collection.support.Product;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCase7 {

    public static void main(String[] args) {

        Product p1 = new Product(1,"A" , 50 , 80);
        Product p2 = new Product(2,"B" , 20 , 180);
        Product p3 = new Product(3,"C" , 10 , 20);
        Product p4 = new Product(4,"D" , 100 , 10);
        Product p5 = new Product(5,"E" , 70 , 30);

        List<Product> productList = new ArrayList();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);

//        Collections.sort(productList , new CompareByPrice());    //可通过不同的排序器实例  来变化多种排序策略 .

        System.out.println(productList);



    }
}
