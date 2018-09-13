package cases.exception;

import cases.exception.oo.Product;
import cases.exception.oo.Result;
import cases.exception.service.BuyService;

import java.math.BigDecimal;

public class TestCase {

    public static void main(String[] args) {

        Product p1 = new Product(1, "thinking in java" ,  new BigDecimal("99.00"));

        BuyService service = new BuyService();

        Result result = service.buy(p1 , 1000);

        System.out.println(result);


    }
}
