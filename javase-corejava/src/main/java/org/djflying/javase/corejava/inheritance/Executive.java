package org.djflying.javase.corejava.inheritance;

/**
 * 经理类
 * declare the class using the final modifier to prevent others from subclassing
 *
 * @author dj4817
 * @version $Id: Executive.java, v 0.1 2018/1/3 16:44 dj4817 Exp $$
 */
public final class Executive extends Manager {

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    @Override
    public final String getName() {
        return super.getName();
    }
}
