package com.sample.javaDesignMode.creational.factoryMethod.staticFactoryMethod;

import com.sample.javaDesignMode.creational.factoryMethod.Sender;

/**
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 * @date 2017年11月14日
 */
public class FactoryTest {
	
	public static void main(String[] args) {          
        Sender sender = SendFactory.produceMail();  
        sender.send();  
        
        sender = SendFactory.produceSms();  
        sender.send();  
    }  
}
