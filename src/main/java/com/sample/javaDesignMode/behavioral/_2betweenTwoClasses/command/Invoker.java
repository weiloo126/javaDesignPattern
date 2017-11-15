package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.command;

/**
 * 
 * @date 2017年11月14日
 */
public class Invoker {
	
	private Command command;  
    
    public Invoker(Command command) {  
        this.command = command;  
    }  
  
    public void action(){  
        command.exe();  
    }  
}
