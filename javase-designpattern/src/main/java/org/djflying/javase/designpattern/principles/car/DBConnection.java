package org.djflying.javase.designpattern.principles.car;

/**
 * 数据库连接
 *
 * @author daijiong
 * @version $Id: DBConnection.java, v 0.1 2019/5/12 21:33 daijiong Exp $$
 */
//public class DBConnection {
//    public String getConnection() {
//        return "MySQL数据库连接";
//    }
//}
public abstract class DBConnection {
    public abstract String getConnection();
}
