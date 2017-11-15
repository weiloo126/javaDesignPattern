package com.sample.javaDesignMode.creational.factoryMethod.normalFactory;

import com.sample.javaDesignMode.creational.factoryMethod.MailSender;
import com.sample.javaDesignMode.creational.factoryMethod.Sender;
import com.sample.javaDesignMode.creational.factoryMethod.SmsSender;

/**
 * 
 * @date 2017年11月14日
 */
public class SendFactory {
	
	public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
}
