package org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.ResultMsg;

/**
 * 第三方登录服务
 *
 * @author daijiong
 * @version : IThirdLoginService.java, v 0.1 2020/4/3 13:19 daijiong Exp $$
 */
public interface IThirdLoginService {
    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWeChat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telephone
     * @param code
     * @return
     */
    ResultMsg loginForTelephone(String telephone, String code);

    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegister(String username, String passport);

}
