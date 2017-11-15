package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.chainOfResponsibility;

/**
 * 
 * @date 2017年11月14日
 */
public class MyHandler extends AbstractHandler implements Handler {

	private String name;  
	  
    public MyHandler(String name) {  
        this.name = name;  
    }  
	
	@Override
	public void operate() { 
        if(getHandler() != null){  
    		System.out.println(name+" pass on!"); 
            getHandler().operate();  
        }else{
    		System.out.println(name+" deal!"); 
        }
	}

}
