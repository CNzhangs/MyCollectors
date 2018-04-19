package com.zhangs.collector.controller;

import com.zhangs.collector.response.Result;
import com.zhangs.collector.response.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController<T,REPO> {
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        e.printStackTrace();
        return new Result(ResultCode.UNKNOWN_ERROR);
    }
}
