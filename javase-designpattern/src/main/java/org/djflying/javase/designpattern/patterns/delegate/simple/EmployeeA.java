package org.djflying.javase.designpattern.patterns.delegate.simple;

/**
 * A员工
 *
 * @author daijiong
 * @version : EmployeeA.java, v 0.1 2020/3/25 22:01 daijiong Exp $$
 */
public class EmployeeA implements IEmployee {
    @Override
    public void execute(String command) {
        System.out.println("我是员工A，我擅长加密，我在执行" + command + "命令");
    }
}
