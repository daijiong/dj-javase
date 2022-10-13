package org.djflying.javase.designpattern.patterns.delegate.simple;

/**
 * 老板
 *
 * @author daijiong
 * @version : Boss.java, v 0.1 2020/3/25 21:57 daijiong Exp $$
 */
public class Boss {

    /**
     * 下达命令
     *
     * @param command
     */
    public void command(String command, org.djflying.javase.designpattern.patterns.delegate.simple.Manager manager) {
        manager.execute(command);
    }
}
