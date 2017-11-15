package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.iterator;

/**
 * 
 * @date 2017年11月14日
 */
public class MyCollection implements Collection {

	public String string[] = {"A","B","C","D","E"};  
	
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i];  
	}

	@Override
	public int size() {
		return string.length;  
	}

}
