package com.sample.javaDesignMode.structural.adapter.adapterOfObject;

import com.sample.javaDesignMode.structural.adapter.adapterOfObject.Source;

/**
 * 对象的适配器模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。
 * 
 * @date 2017年11月15日
 */
public class AdapterTest {

	public static void main(String[] args) {
		Source source =  new Source();
		Adapter adapterOfObject = new Adapter(source);
		adapterOfObject.method1();
		adapterOfObject.method2();
	}
}
