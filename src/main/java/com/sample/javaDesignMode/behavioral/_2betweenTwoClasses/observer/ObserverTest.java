package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.observer;

/**
 * MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，当MySubject变化时，Observer1和Observer2必然变化。
 * AbstractSubject类中定义着需要监控的对象列表，可以对其进行修改：增加或删除监控对象，且当MySubject变化时，负责通知在列表内存在的对象。
 * 
 * @date 2017年11月14日
 */
public class ObserverTest {
	
	 public static void main(String[] args) {  
        Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
          
        sub.operation();  
    }  
}
