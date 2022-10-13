package org.djflying.javase.designpattern.principles.car;

/**
 * MySQL数据库连接
 *
 * @author daijiong
 * @version $Id: MySQLConnection.java, v 0.1 2019/5/12 21:40 daijiong Exp $$
 */
public class MySQLConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
