package com.sample.javaDesignMode.structural.bridge;

/**
 * @author LW  
 * @date 2017年11月13日
 */
public class MyBridge extends Bridge {
	
	@Override
	public void method(){  
        getSource().method();  
    }  
}
