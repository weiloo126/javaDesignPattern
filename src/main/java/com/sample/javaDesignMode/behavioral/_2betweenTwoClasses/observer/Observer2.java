package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.observer;

import com.sample.javaDesignMode.behavioral._2betweenTwoClasses.observer.Observer;

/**
 * 
 * @date 2017年11月14日
 */
public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");  
	}

}
