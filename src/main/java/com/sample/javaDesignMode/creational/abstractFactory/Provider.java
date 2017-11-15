package com.sample.javaDesignMode.creational.abstractFactory;

import com.sample.javaDesignMode.creational.factoryMethod.Sender;

/**
 * 
 * @date 2017年11月14日
 */
public interface Provider {

	public Sender produce();  
}
