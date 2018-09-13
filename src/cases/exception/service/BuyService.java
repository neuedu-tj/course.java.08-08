package cases.exception.service;

import cases.exception.exception.LowStockException;
import cases.exception.handler.ResultBuilder;
import cases.exception.oo.Product;
import cases.exception.oo.Result;
import cases.exception.type.ResultEnum;

public class BuyService {

    //库存
    public static final Integer storage = 10;

    public Result buy(Product product , int amount) {

       try{
           if(storage - amount >= 0 ) {

               Result result = ResultBuilder.success(product);

               return result;
           } else if(  storage - amount  < 0 ) {
               throw new LowStockException(ResultEnum.ERROR_LOWSTOCK);
           }
       } catch (LowStockException e ) {
           Result result = ResultBuilder.error(e.getCode() , e.getMessage() );
           return result;
       }
       return null;
    }


}
