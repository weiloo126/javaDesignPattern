package com.sample.javaDesignMode.creational.prototype;

import java.io.IOException;

/**
 *   
 * @date 2017年11月15日
 */
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		SerializableObject obj = new SerializableObject("original");
		Prototype prototype = new Prototype("original", obj);
		
		Prototype shallowPrototype = (Prototype) prototype.clone();
		Prototype deepPrototype = (Prototype) prototype.deepClone();
		
		System.out.println("--------------before update--------------");

		System.out.println(prototype.toString());
		System.out.println(shallowPrototype.toString());
		System.out.println(deepPrototype.toString());
		
		prototype.setString("update");
		prototype.getObj().setValue("update");
		
		System.out.println("--------------after update--------------");

		System.out.println(prototype.toString());
		System.out.println(shallowPrototype.toString());
		System.out.println(deepPrototype.toString());
	}
}
