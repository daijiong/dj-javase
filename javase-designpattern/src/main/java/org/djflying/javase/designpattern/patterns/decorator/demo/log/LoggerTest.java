package org.djflying.javase.designpattern.patterns.decorator.demo.log;

import org.slf4j.Logger;

import java.io.*;

/**
 * Created by Tom.
 */
public class LoggerTest {
    //    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    private static final Logger logger = JsonLoggerFactory.getLogger(LoggerTest.class);

    public static void main(String[] args) {
        logger.error("系统错误");
        try {
            InputStream in = new FileInputStream("");
            BufferedInputStream bis = new BufferedInputStream(in);
            bis.read();
            bis.close();
            BufferedReader br = new BufferedReader(new FileReader(""));
            br.readLine();
            BufferedReader bs = new BufferedReader(new StringReader(""));
            bs.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
