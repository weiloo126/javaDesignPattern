package com.sample.javaDesignMode.behavioral._1superAndSub.templateMethod;

/**
 *   
 * @date 2017年11月14日
 */
public class Multiply extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1 * num2;
	}

}
