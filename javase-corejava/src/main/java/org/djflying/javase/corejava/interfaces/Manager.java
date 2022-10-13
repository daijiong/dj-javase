package org.djflying.javase.corejava.interfaces;

/**
 * Description
 *
 * @author dj4817
 * @version $Id: Manager.java, v 0.1 2018/1/8 16:04 dj4817 Exp $$
 */
public class Manager extends Employee {


    /**
     * 全参构造器
     *
     * @param name
     * @param salary
     */
    public Manager(String name, double salary) {
        super(name, salary);
    }

    /**
     * Compares employees by salary
     *
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject, 0 if the salaries are the same, a positive value otherwise
     */
    @Override
    public int compareTo(Employee other) {
        if (getClass()!=other.getClass()) {
            throw new ClassCastException();
        }
        return super.compareTo(other);
    }
}
