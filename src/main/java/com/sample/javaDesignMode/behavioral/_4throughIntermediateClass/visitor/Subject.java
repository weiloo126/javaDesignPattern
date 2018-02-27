package com.sample.javaDesignMode.behavioral._4throughIntermediateClass.visitor;

/**
 * 
 * @date 2017年11月14日
 */
public interface Subject {
	
	/*accept方法，接受将要访问它的对象*/
	public void accept(Visitor visitor);  
	
	/*getSubject()获取将要被访问的属性*/
    public String getSubject();  
}
