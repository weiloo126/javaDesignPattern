package com.sample.javaDesignMode.behavioral._1superAndSub.strategy;

/**
 * AbstractCalculator是辅助类，提供辅助方法
 * 
 * @date 2017年11月14日
 */
public abstract class AbstractCalculator {

	public int[] split(String exp, String opt){  
        String array[] = exp.split(opt);  
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  
}
