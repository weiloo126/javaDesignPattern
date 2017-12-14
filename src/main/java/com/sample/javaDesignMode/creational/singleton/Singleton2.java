package com.sample.javaDesignMode.creational.singleton;

/**
 * 该单例模式使用内部类来维护单例的实现，JVM内部类的机制能够保证当这个类被加载的时候，这个类的加载过程是线程互斥的。
 * 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心Singleton中的问题。
 * 
 * @date 2017年11月14日
 */
public class Singleton2 {     
	
	/* 私有构造方法，防止被实例化 */  
    private Singleton2() {  
    }  
	
    public static Singleton2 getInstance(){           
        return SingletonFactory.instance;           
    }   

    /*使用内部类来维护单例的实现*/
	private static class SingletonFactory{           
        private static Singleton2 instance = new Singleton2();           
    } 
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return getInstance();  
    }  
}
