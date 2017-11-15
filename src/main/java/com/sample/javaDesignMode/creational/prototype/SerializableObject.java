package com.sample.javaDesignMode.creational.prototype;

import java.io.Serializable;

/**
 * 
 * @date 2017年11月15日
 */
public class SerializableObject implements Serializable{
	
	private static final long serialVersionUID = 1L;  
	
	private String value;

	public SerializableObject(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SerializableObject [value=" + value + "]";
	}
	
}
