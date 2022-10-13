package org.djflying.javase.designpattern.patterns.adapter.loginadapter.v1;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.LoginService;
import org.djflying.javase.designpattern.patterns.adapter.loginadapter.ResultMsg;

/**
 * 第三方登录服务
 *
 * @author daijiong
 * @version : ThirdLoginService.java, v 0.1 2020/4/3 11:18 daijiong Exp $$
 */
public class ThirdLoginService extends LoginService {

    /**
     * QQ登录
     * @param openId
     * @return
     */
    public ResultMsg loginForQQ(String openId) {
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法
        return loginForRegister(openId, null);
    }

    /**
     * 微信登陆
     * @param openId
     * @return
     */
    public ResultMsg loginForWeChat(String openId) {
        return null;
    }

    /**
     * token登录
     * @param token
     * @return
     */
    public ResultMsg loginForToken(String token) {
        //通过token拿到用户信息，然后再重新登陆了一次
        return null;
    }

    /**
     * 手机登录
     * @param telephone
     * @param code
     * @return
     */
    public ResultMsg loginForTelephone(String telephone, String code) {
        return null;
    }

    /**
     * 注册登录
     * @param username
     * @param password
     * @return
     */
    public ResultMsg loginForRegister(String username, String password) {
        super.register(username, null);
        return super.login(username, null);
    }
}
