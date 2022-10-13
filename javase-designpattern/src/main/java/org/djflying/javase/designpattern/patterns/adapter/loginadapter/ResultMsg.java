package org.djflying.javase.designpattern.patterns.adapter.loginadapter;

/**
 * 接口返回结果
 *
 * @author daijiong
 * @version : ResultMsg.java, v 0.1 2020/4/3 11:13 daijiong Exp $$
 */
public class ResultMsg {

    private int    code;
    private String msg;
    private Object data;

    public ResultMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "code：" + code + "message：" + msg;
    }
}
