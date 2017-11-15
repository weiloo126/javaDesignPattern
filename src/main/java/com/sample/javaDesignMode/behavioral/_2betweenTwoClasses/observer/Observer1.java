package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.observer;

/**
 * 
 * @date 2017年11月14日
 */
public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!"); 
	}

}
