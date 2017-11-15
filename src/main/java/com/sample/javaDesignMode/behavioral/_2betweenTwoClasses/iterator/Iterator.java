package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.iterator;

/**
 * 
 * @date 2017年11月14日
 */
public interface Iterator {
	
	boolean hasPrevious();  
	 //前移  
    public Object previous();  
      
    //后移  
    public Object next();  
    
    public boolean hasNext();  
      
    //取得第一个元素  
    public Object first();
}
