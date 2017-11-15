package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.observer;

/**
 * 
 * @date 2017年11月14日
 */
public interface Subject {
	  
    /*增加观察者*/  
    public void add(Observer observer);  
      
    /*删除观察者*/  
    public void del(Observer observer);  
      
    /*通知所有的观察者*/  
    public void notifyObservers();  
      
    /*自身的操作*/  
    public void operation();
}
