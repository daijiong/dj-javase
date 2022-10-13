package org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2.adapters;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.ResultMsg;

/**
 * QQ登录策略
 *
 * @author daijiong
 * @version : LoginForQQAdapter.java, v 0.1 2020/4/3 13:27 daijiong Exp $$
 */
public class LoginForQQAdapter implements LoginAdapter {

    /**
     * 是否支持当前策略
     *
     * @param strategy
     * @return
     */
    @Override
    public boolean support(Object strategy) {
        return strategy instanceof LoginForQQAdapter;
    }

    /**
     * 登录
     *
     * @param id
     * @param strategy
     * @return
     */
    @Override
    public ResultMsg login(String id, Object strategy) {
        return new ResultMsg(1, "使用QQ号为：" + id + "登录成功", null);
    }
}
