package com.sample.javaDesignMode.creational.factoryMethod;

/**
 * 
 * @date 2017年11月14日
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender!");  
	}

}
