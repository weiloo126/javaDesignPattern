package com.sample.javaDesignMode.creational.factoryMethod.staticFactoryMethod;

import com.sample.javaDesignMode.creational.factoryMethod.MailSender;
import com.sample.javaDesignMode.creational.factoryMethod.Sender;
import com.sample.javaDesignMode.creational.factoryMethod.SmsSender;

/**
 * 
 * @date 2017年11月14日
 */
public class SendFactory {
	
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
