package com.sample.javaDesignMode.behavioral._4throughIntermediateClass.mediator;

/**
 * 
 * @date 2017年11月14日
 */
public class User1 extends User {


	public User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 exe!");  
	}

}
