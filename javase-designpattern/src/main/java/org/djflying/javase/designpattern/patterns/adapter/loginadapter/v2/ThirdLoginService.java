package org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2;

import org.djflying.javase.designpattern.patterns.adapter.loginadapter.LoginService;
import org.djflying.javase.designpattern.patterns.adapter.loginadapter.ResultMsg;
import org.djflying.javase.designpattern.patterns.adapter.loginadapter.v2.adapters.*;

/**
 * 第三方登录：适配器模式整合策略模式和工厂模式
 *
 * @author daijiong
 * @version : ThirdLoginService.java, v 0.1 2020/4/3 13:21 daijiong Exp $$
 */
public class ThirdLoginService extends LoginService implements IThirdLoginService {

    /**
     * QQ登录
     *
     * @param id
     * @return
     */
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    /**
     * 微信登录
     *
     * @param id
     * @return
     */
    @Override
    public ResultMsg loginForWeChat(String id) {
        return processLogin(id, LoginForWeChatAdapter.class);
    }

    /**
     * 记住登录状态后自动登录
     *
     * @param token
     * @return
     */
    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    /**
     * 手机号登录
     *
     * @param telephone
     * @param code
     * @return
     */
    @Override
    public ResultMsg loginForTelephone(String telephone, String code) {
        return processLogin(telephone, LoginForTelephoneAdapter.class);
    }

    /**
     * 注册后自动登录
     *
     * @param username
     * @param passport
     * @return
     */
    @Override
    public ResultMsg loginForRegister(String username, String passport) {
        super.register(username, passport);
        return super.login(username, passport);
    }

    /**
     * 登录流程处理：工厂模式整合策略模式
     *
     * @param id
     * @param adapter
     * @return
     */
    private ResultMsg processLogin(String id, Class<? extends LoginAdapter> adapter) {
        try {
            LoginAdapter loginAdapter = adapter.newInstance();
            // 判断传过来的适配器是否支持业务处理
            if (loginAdapter.support(adapter)) {
                return loginAdapter.login(id, loginAdapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
