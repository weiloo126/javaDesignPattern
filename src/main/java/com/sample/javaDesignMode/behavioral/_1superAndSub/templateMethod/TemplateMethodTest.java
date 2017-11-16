package com.sample.javaDesignMode.behavioral._1superAndSub.templateMethod;

/**
 * @author LW  
 * @date 2017年11月14日
 */
public class TemplateMethodTest {

	public static void main(String[] args) {  
        String exp = "8+8";  
        AbstractCalculator cal = new Plus();  
        int result = cal.calculate(exp, "\\+");  
        System.out.println(exp + "=" + result);  
        
        exp = "10-7";  
        cal = new Minus();  
        result = cal.calculate(exp, "-");  
        System.out.println(exp + "=" + result);  
        
        exp = "4*6";  
        cal = new Multiply();  
        result = cal.calculate(exp, "\\*");  
        System.out.println(exp + "=" + result);   
    }  
}
