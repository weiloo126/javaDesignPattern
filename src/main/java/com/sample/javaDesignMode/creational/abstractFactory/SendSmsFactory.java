package com.sample.javaDesignMode.creational.abstractFactory;

import com.sample.javaDesignMode.creational.factoryMethod.Sender;
import com.sample.javaDesignMode.creational.factoryMethod.SmsSender;

/**
 * 
 * @date 2017年11月14日
 */
public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
