package com.sample.javaDesignMode.creational.factoryMethod.normalFactory;

import com.sample.javaDesignMode.creational.factoryMethod.Sender;

/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * @date 2017年11月14日
 */
public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");  
        sender.send();  
        
        sender = factory.produce("mail");  
        sender.send();  
        
        sender = factory.produce("wx");  
        sender.send();  
	}
}
