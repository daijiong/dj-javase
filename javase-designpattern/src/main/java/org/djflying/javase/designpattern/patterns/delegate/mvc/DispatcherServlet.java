package org.djflying.javase.designpattern.patterns.delegate.mvc;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author daijiong
 * @version : DispatcherServlet.java, v 0.1 2020/3/25 22:08 daijiong Exp $$
 */
public class DispatcherServlet extends HttpServlet {

    /** 处理器映射列表（相当于一个策略常量） */
    private static List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        try {
            // 初始化所有处理器
            Class<?> controllerAClass = ControllerA.class;
            handlerMapping.add(new Handler().setUrl("/methodA").setMethod(controllerAClass.getMethod("methodA", null)).setController(controllerAClass.newInstance()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        doDispatch(req, res);
    }

    /**
     * 任务分发
     *
     * @param req
     * @param res
     */
    private void doDispatch(HttpServletRequest req, HttpServletResponse res) {
        try {
            //获取用户请求的url，如果按照J2EE的标准、每个url对应一个Servlet，url由浏览器输入
            String url = req.getRequestURI();
            // 通过拿到的url去handlerMapping（我们把它认为是策略常量）中获取具体的Handler
            Handler handler = null;
            for (Handler h : handlerMapping) {
                if (StringUtils.equals(h.url, url)) {
                    handler = h;
                }
            }
            // 将具体的任务分发给Method（通过反射去调用其对应的方法）
            Object result = handler.getMethod().invoke(handler.getController(), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    /**
    //     * 任务分发
    //     *
    //     * @param req
    //     * @param res
    //     */
    //    private void doDispatch(HttpServletRequest req, HttpServletResponse res) throws IOException {
    //        String uri = req.getRequestURI();
    //        if (StringUtils.equals("methodA", uri)) {
    //            new ControllerA().methodA();
    //        } else if (StringUtils.equals("methodB", uri)) {
    //            new ControllerB().methodB();
    //        } else if (StringUtils.equals("methodC", uri)) {
    //            new ControllerC().methodC();
    //        } else {
    //            res.getWriter().write("404 Not Found!!!");
    //        }
    //    }

    /**
     * 处理器
     */
    class Handler {
        /** 访问路径 */
        private String url;
        /** 访问方法 */
        private Method method;
        /** 控制器 */
        private Object controller;

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }
    }
}
