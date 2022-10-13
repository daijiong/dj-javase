package org.djflying.javase.designpattern.patterns.flyweight.demo1;

import java.sql.Connection;

/**
 * 数据库连接池测试类
 *
 * @author daijiong
 * @version : ConnectionPoolTest.java, v 0.1 2020/5/21 22:00 daijiong Exp $$
 */
public class ConnectionPoolTest {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();
        // 处理业务
        pool.release(connection);
    }
}
