package org.djflying.javase.designpattern.patterns.adapter.loginadapter;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2.ThirdLoginService;

/**
 * 登录服务测试类
 *
 * @author daijiong
 * @version : LoginTest.java, v 0.1 2020/4/3 11:23 daijiong Exp $$
 */
public class LoginTest {
    public static void main(String[] args) {
//        ThirdLoginService thirdLoginService = new ThirdLoginService();
//        thirdLoginService.loginForQQ("asdasjfasf");
        ThirdLoginService thirdLoginService = new ThirdLoginService();
        ResultMsg result = thirdLoginService.loginForQQ("sdasd");
        System.out.println(result);
    }
}
