package com.sample.javaDesignMode.creational.singleton;

/**
 * 从Java1.5版本起，实现Singleton只需编写一个包含单个元素的枚举类型即可。
 * 
 * 这种方法在功能上与共有域方法相近，但是它更加简洁，无偿地提供序列化机制，绝对防止多次实例化，即使是在面对复杂的序列化或者反射攻击的时候。
 * 虽然这种方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 * 
 * @date 2017年11月27日
 */
public enum Singleton4 {

	INSTANCE;
	
	public void get(){
		
	}
}
