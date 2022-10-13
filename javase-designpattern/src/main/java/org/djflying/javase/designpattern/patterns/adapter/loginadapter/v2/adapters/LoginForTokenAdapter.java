package org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2.adapters;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.ResultMsg;

/**
 * token登录策略
 *
 * @author daijiong
 * @version : LoginForTokenAdapter.java, v 0.1 2020/4/3 13:37 daijiong Exp $$
 */
public class LoginForTokenAdapter implements LoginAdapter {

    /**
     * 是否支持当前策略
     *
     * @param strategy
     * @return
     */
    @Override
    public boolean support(Object strategy) {
        return strategy instanceof LoginForTokenAdapter;
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
        return null;
    }
}
