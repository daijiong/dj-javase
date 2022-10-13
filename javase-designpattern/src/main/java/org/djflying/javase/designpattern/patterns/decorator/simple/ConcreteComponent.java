package org.djflying.javase.designpattern.patterns.decorator.simple;

public class ConcreteComponent extends Component {

    @Override
    public void operation() {  
        //相应的功能处理
        System.out.println("处理业务逻辑");
    }  
  
}  