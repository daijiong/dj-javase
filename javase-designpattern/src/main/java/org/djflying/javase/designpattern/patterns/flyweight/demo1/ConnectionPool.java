package org.djflying.javase.designpattern.patterns.flyweight.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 数据库连接池
 *
 * @author daijiong
 * @version : ConnectionPool.java, v 0.1 2020/5/21 21:51 daijiong Exp $$
 */
public class ConnectionPool {

    /** 连接池 */
    private Vector<Connection> pool;
    private int                poolSize = 100;

    public ConnectionPool() {
        pool = new Vector<>(poolSize);
        for (int i = 0; i < poolSize; i++) {
            try {
                Connection connection = DriverManager.getConnection("", "", "");
                pool.add(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }

    public synchronized void release(Connection connection){
        pool.add(connection);
    }
}
