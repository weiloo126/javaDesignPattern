package com.sample.javaDesignMode.creational.factoryMethod.staticFactoryMethod;

import com.sample.javaDesignMode.creational.factoryMethod.Sender;

/**
 * 将多个工厂方法模式里的方法置为静态的，不需要创建工厂类实例，直接调用即可。
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
