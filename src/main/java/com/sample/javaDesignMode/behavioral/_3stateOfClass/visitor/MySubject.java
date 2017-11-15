package com.sample.javaDesignMode.behavioral._3stateOfClass.visitor;

/**
 *  
 * @date 2017年11月14日
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
