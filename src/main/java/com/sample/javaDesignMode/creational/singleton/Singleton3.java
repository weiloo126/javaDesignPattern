package com.sample.javaDesignMode.creational.singleton;

import java.util.Vector;

/**
 * 其实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
 * 也有人这样实现：因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的
 * 
 * 考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。
 * 
 * @date 2017年11月15日
 */
public class Singleton3 {
	
	private static Singleton3 instance = null;  
	  
    private Singleton3() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton3();  
        }  
    }  
  
    public static Singleton3 getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  
    
    /*采用"影子实例"的办法为单例对象的属性同步更新*/
    private Vector properties = null;  
    
    public Vector getProperties() {  
        return properties;  
    }  
    
    public void updateProperties() {  
    	Singleton3 shadow = new Singleton3();  
        properties = shadow.getProperties();  
    }  
}
