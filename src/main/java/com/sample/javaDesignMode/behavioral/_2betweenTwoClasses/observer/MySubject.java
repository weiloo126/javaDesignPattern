package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.observer;

/**
 * 
 * @date 2017年11月14日
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");  
        notifyObservers();  
	}

}
