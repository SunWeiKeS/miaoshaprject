package com.miaosha.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonReturnType {
    private String status;//表明对应请求的返回处理的结果 success 或 fail
    private Object data;//status 为success则返回前端需要的json数据，如果为fail，则data内使用通用的错误码格式

    //定义一个通用的创建方法
    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");
    }

    public static CommonReturnType create(Object result, String status){
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return type;
    }
}
