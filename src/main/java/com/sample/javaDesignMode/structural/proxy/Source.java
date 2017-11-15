package com.sample.javaDesignMode.structural.proxy;

/**
 * @date 2017年11月13日
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");  
	}

}
