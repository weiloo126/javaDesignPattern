package com.sample.javaDesignMode.behavioral._1superAndSub.strategy;

/**
 * 
 * @date 2017年11月14日
 */
public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\+");  
        return arrayInt[0] + arrayInt[1]; 
	}

}
