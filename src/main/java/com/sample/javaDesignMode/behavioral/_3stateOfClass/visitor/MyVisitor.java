package com.sample.javaDesignMode.behavioral._3stateOfClass.visitor;

/**
 * 
 * @date 2017年11月14日
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject："+sub.getSubject());
	}

}
