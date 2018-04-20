package com.zhangs.collector.response;

public class Result<T> {
    public Result(int code) {
        this.code = code;
        this.msg = generateMsg(code);
    }

    public static Result fail(String msg) {
        return new Result(ResultCode.REQUEST_PARAMS_ERROR,msg);
    }

    public static <T> Result success(T t) {
        Result<T> result = new Result<>(200);
        result.setData(t);
        result.setMsg("ok");
        return result;
    }
    public static <T> Result success() {
        Result<T> result = new Result<>(200);
        result.setMsg("ok");
        return result;
    }
    private String generateMsg(int code) {
        switch (code) {
            case ResultCode.WEAK_NET_WORK:
                return "network error";
            case ResultCode.REQUEST_PARAMS_ERROR:
                return "you must set valid params";
        }
        return "unknown error";
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private int code;
    private String msg;
    private T data;

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public boolean isSuccess(){
        return code==200;
    }
}
