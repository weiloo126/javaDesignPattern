package com.sample.javaDesignMode.structural.adapter.adapterOfObject;

import com.sample.javaDesignMode.structural.adapter.adapterOfObject.Source;
import com.sample.javaDesignMode.structural.adapter.adapterOfObject.Targetable;

/**
 * @author LW  
 * @date 2017年11月15日
 */
public class Adapter implements Targetable {
	
	private Source source;
	
	public Adapter(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");  
	}

}
