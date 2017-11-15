package com.sample.javaDesignMode.creational.abstractFactory;

import com.sample.javaDesignMode.creational.factoryMethod.MailSender;
import com.sample.javaDesignMode.creational.factoryMethod.Sender;

/**
 * 
 * @date 2017年11月14日
 */
public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
