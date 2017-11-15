package com.sample.javaDesignMode.behavioral._4throughIntermediateClass.interpretor;

/**
 * 
 * @date 2017年11月14日
 */
public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1() - context.getNum2();
	}

}
