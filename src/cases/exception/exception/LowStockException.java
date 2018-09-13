package cases.exception.exception;

import cases.exception.type.ResultEnum;
import lombok.Data;

@Data
public class LowStockException extends  Exception {

    private Integer code ;

    public LowStockException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }




}
