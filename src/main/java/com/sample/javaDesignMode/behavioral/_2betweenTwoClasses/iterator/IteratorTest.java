package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.iterator;

/**
 * 
 * @date 2017年11月14日
 */
public class IteratorTest {

	public static void main(String[] args) {  
        Collection collection = new MyCollection();  
        Iterator it = collection.iterator();  
        
        System.out.println("------------from start to end------------");
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
        
        System.out.println("------------from end to start------------");
        
        while(it.hasPrevious()){
        	System.out.println(it.previous());
        }
    }  
}
