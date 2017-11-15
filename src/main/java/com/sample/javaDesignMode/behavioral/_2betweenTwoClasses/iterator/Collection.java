package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.iterator;

/**
 * 
 * @date 2017年11月14日
 */
public interface Collection {

	public Iterator iterator();  
    
    /*取得集合元素*/  
    public Object get(int i);  
      
    /*取得集合大小*/  
    public int size();  
}
