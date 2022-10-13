package org.djflying.javase.designpattern.patterns.adapter.loginadapter;

/**
 * 用户登录服务
 *
 * @author daijiong
 * @version : LoginService.java, v 0.1 2020/4/3 11:09 daijiong Exp $$
 */
public class LoginService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg register(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password) {
        return null;
    }
}
