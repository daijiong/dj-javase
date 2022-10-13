package org.djflying.javase.designpattern.patterns.decorator.demo.log;

import org.slf4j.Logger;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Tom.
 */
public class JsonLogger extends LoggerDecorator {
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject result = newJsonObject();
        result.put("message", s);
        logger.info(result.toString());
    }

    @Override
    public void error(String s) {
        JSONObject result = newJsonObject();
        result.put("message", s);
        logger.info(result.toString());
    }

    private JSONObject newJsonObject() {
        return new JSONObject();
    }
}
