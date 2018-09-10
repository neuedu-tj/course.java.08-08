package cases.buycart;

import java.math.BigDecimal;

public class TestCase {

    public static void main(String[] args) {

        Product p1 = new Product(1,"牛奶" , new BigDecimal(50));
        Product p2 = new Product(2,"啤酒🍺" , new BigDecimal(80));
        Product p3 = new Product(3,"iphoneX" , new BigDecimal(1000));
        Product p4 = new Product(4,"Java从入门到放弃" , new BigDecimal(10));


        Customer tom = new Customer(1, "tom" );

        ///////////////////////////////////////////////////////////////////////

        BuyItem item01 = new BuyItem(p1,2);
        BuyItem item02 = new BuyItem(p2,1);
        BuyItem item03 = new BuyItem(p4,10);
        // 5 min
        BuyItem item04 = new BuyItem(p4,1);


        Cart cart = new Cart();
        cart.addItems(item01);
        cart.addItems(item02);
        cart.addItems(item03);
        cart.addItems(item04);

        cart.detail();





    }
}
