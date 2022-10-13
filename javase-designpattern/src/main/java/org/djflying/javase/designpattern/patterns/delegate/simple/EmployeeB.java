package org.djflying.javase.designpattern.patterns.delegate.simple;

/**
 * 员工B
 *
 * @author daijiong
 * @version : EmployeeB.java, v 0.1 2020/3/25 22:03 daijiong Exp $$
 */
public class EmployeeB implements IEmployee {

    @Override
    public void execute(String command) {
        System.out.println("我是员工B，我擅长架构，我在执行" + command + "命令");
    }
}
