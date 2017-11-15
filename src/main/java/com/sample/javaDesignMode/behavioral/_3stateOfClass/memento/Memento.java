package com.sample.javaDesignMode.behavioral._3stateOfClass.memento;

/**
 * 
 * @date 2017年11月14日
 */
public class Memento {
	
	private String value;  
	  
    public Memento(String value) {  
        this.value = value;  
    }  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
}
