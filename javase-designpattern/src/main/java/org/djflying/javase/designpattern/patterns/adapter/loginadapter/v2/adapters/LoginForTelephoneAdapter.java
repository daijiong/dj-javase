package org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2.adapters;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.ResultMsg;

/**
 * 手机登录策略
 *
 * @author daijiong
 * @version : LoginForTelephoneAdapter.java, v 0.1 2020/4/3 13:38 daijiong Exp $$
 */
public class LoginForTelephoneAdapter implements LoginAdapter {

    /**
     * 是否支持当前策略
     *
     * @param strategy
     * @return
     */
    @Override
    public boolean support(Object strategy) {
        return strategy instanceof LoginForTelephoneAdapter;
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
