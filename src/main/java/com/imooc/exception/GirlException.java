package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Data;

@Data
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

}
