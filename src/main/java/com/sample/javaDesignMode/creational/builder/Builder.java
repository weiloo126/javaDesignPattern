package com.sample.javaDesignMode.creational.builder;

import java.util.ArrayList;
import java.util.List;

import com.sample.javaDesignMode.creational.factoryMethod.MailSender;
import com.sample.javaDesignMode.creational.factoryMethod.Sender;
import com.sample.javaDesignMode.creational.factoryMethod.SmsSender;

/**
 * 
 * @date 2017年11月15日
 */
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();  
    
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}
