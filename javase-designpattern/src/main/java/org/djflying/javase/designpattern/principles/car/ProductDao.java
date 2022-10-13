package org.djflying.javase.designpattern.principles.car;

/**
 * 产品dao
 *
 * @author daijiong
 * @version $Id: ProductDao.java, v 0.1 2019/5/12 21:35 daijiong Exp $$
 */
public class ProductDao {
    private DBConnection dbConnection;

    /**
     * Getter method for property <tt>dbConnection</tt>.
     *
     * @return property value of dbConnection
     */
    public DBConnection getDbConnection() {
        return dbConnection;
    }

    /**
     * Setter method for property <tt>dbConnection</tt>.
     *
     * @param dbConnection value to be assigned to property dbConnection
     */
    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
