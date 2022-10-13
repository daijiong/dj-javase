package org.djflying.javase.designpattern.patterns.facade.simple;

class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}