package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.command;

/**
 * @author LW  
 * @date 2017年11月14日
 */
public class MyCommand implements Command {
	
	private Receiver receiver;  
    
    public MyCommand(Receiver receiver) {  
        this.receiver = receiver;  
    }  
    
	@Override
	public void exe() {
		receiver.action();
	}

}
