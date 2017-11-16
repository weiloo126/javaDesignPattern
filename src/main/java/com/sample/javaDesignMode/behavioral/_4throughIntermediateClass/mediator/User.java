package com.sample.javaDesignMode.behavioral._4throughIntermediateClass.mediator;

/**
 * 
 * @date 2017年11月14日
 */
public abstract class User {

	private Mediator mediator;  
    
    public Mediator getMediator(){  
        return mediator;  
    }  
      
    public User(Mediator mediator) {  
        this.mediator = mediator;  
    }  
  
    public abstract void work();  
}
