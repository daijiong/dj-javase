package org.djflying.javase.designpattern.patterns.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 经理
 *
 * @author daijiong
 * @version : Manager.java, v 0.1 2020/3/25 21:58 daijiong Exp $$
 */
public class Manager {

    public Map<String, IEmployee> employeeMap = new HashMap<>();

    public Manager(){
        employeeMap.put("加密", new EmployeeA());
        employeeMap.put("架构", new EmployeeB());
    }

    public void execute(String command){
        employeeMap.get(command).execute(command);
    }
}
