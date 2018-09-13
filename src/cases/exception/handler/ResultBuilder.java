package cases.exception.handler;

import cases.exception.oo.Product;
import cases.exception.oo.Result;
import cases.exception.type.ResultEnum;

public class ResultBuilder {


    public static Result success(Product product) {
        Result result = new Result(ResultEnum.SUCCESS);
        result.setProduct(product);
        return result;
    }

    public static Result error(Integer code , String msg ) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }



}
