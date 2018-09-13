package cases.exception.oo;


import cases.exception.type.ResultEnum;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Result {

    private int code;   //代码
    private String msg ;    //消息
    private Product product;    //货品  / null

    public Result() { }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }


}
