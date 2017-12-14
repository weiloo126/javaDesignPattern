package com.sample.javaDesignMode.creational.factoryMethod.multiFactoryMethod;

import com.sample.javaDesignMode.creational.factoryMethod.MailSender;
import com.sample.javaDesignMode.creational.factoryMethod.Sender;
import com.sample.javaDesignMode.creational.factoryMethod.SmsSender;

/**
 *   
 * @date 2017年11月14日
 */
public class SendFactory {
	
	public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
