package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.chainOfResponsibility;

/**
 * 
 * @date 2017年11月14日
 */
public abstract class AbstractHandler {

	private Handler handler;  
	
	public Handler getHandler() {  
        return handler;  
    }  
  
    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }  
}
