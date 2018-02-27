package com.sample.javaDesignMode.creational.abstractFactory;

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
