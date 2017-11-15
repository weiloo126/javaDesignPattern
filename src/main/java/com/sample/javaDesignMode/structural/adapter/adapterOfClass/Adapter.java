package com.sample.javaDesignMode.structural.adapter.adapterOfClass;

/**
 * 
 * @date 2017年11月15日
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");  
	}

}
