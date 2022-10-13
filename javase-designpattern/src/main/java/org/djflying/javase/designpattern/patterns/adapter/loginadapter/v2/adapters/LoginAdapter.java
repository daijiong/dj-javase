package org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2.adapters;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.ResultMsg;

/**
 * 登录策略
 *
 * @author daijiong
 * @version : LoginAdapter.java, v 0.1 2020/4/3 13:25 daijiong Exp $$
 */
public interface LoginAdapter {

    /**
     * 是否支持当前策略
     * @param strategy
     * @return
     */
    boolean support(Object strategy);

    /**
     * 登录
     *
     * @param id
     * @param strategy
     * @return
     */
    ResultMsg login(String id, Object strategy);
}
