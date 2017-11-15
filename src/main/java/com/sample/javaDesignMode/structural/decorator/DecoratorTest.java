package com.sample.javaDesignMode.structural.decorator;

/**
 * @date 2017年11月13日
 */
public class DecoratorTest {
	
	public static void main(String[] args) {
		Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method(); 
	}
}
