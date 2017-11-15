package com.sample.javaDesignMode.creational.abstractFactory;

import com.sample.javaDesignMode.creational.factoryMethod.Sender;

/**
 * 
 * @date 2017年11月14日
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
		
		provider = new SendSmsFactory();
		sender = provider.produce();
		sender.send();
	}
}
