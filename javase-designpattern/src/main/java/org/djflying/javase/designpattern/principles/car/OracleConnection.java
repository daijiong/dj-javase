package org.djflying.javase.designpattern.principles.car;

/**
 * Oracle数据库连接
 *
 * @author daijiong
 * @version $Id: OracleConnection.java, v 0.1 2019/5/12 21:41 daijiong Exp $$
 */
public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
