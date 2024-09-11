package com.syan.common.entity;

import lombok.Data;

@Data
public class ResultInfo {

    private Integer code;

    private String msg;

    private Object data;

    private boolean success;

    private final static Integer SUCCESS_CODE = 200;



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
