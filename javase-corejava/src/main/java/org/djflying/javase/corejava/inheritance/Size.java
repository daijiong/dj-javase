package org.djflying.javase.corejava.inheritance;

/**
 * Size枚举
 *
 * @author dj4817
 * @version $Id: Size.java, v 0.1 2018/1/4 18:05 dj4817 Exp $$
 */
public enum Size {

                  SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * Getter method for property <tt>abbreviation</tt>.
     *
     * @return property value of abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }
}
