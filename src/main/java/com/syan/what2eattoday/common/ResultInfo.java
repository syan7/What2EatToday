package com.syan.what2eattoday.common;

import lombok.Data;
/**
 * @author : syan
 * @date : 2024/9/15
 * @comment : 返回封装类
 */


@Data
public class ResultInfo {

    private Integer code;

    private String msg;

    private Object data;

    private boolean success;

    private static final Integer SUCCESS_CODE = 200;



    public ResultInfo(boolean success, Integer code, String msg, Object data) {
        this.code = code;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public ResultInfo() {}

    public ResultInfo success(boolean success, String msg, Object data) {
        return new ResultInfo(success, SUCCESS_CODE, msg, data);
    }
}

