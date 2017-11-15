package com.sample.javaDesignMode.behavioral._1superAndSub.strategy;

/**
 * @author LW  
 * @date 2017年11月14日
 */
public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");  
        return arrayInt[0] * arrayInt[1];  
	}

}
