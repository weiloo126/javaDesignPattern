package com.sample.javaDesignMode.behavioral._2betweenTwoClasses.iterator;

/**
 * 
 * @date 2017年11月14日
 */
public class MyIterator implements Iterator {

	private Collection collection;  
    private int pos = -1;  
      
    public MyIterator(Collection collection){  
        this.collection = collection;  
    }  
      
    @Override  
    public Object previous() {  
        if(pos > 0){  
            pos--;  
        }  
        return collection.get(pos);  
    }  
  
    @Override  
    public boolean hasPrevious() {  
        if(pos>0){  
            return true;  
        }else{  
            return false;  
        }  
    }
  
    @Override  
    public Object next() {  
        if(pos<collection.size()-1){  
            pos++;  
        }  
        return collection.get(pos);  
    }  
  
    @Override  
    public boolean hasNext() {  
        if(pos<collection.size()-1){  
            return true;  
        }else{  
            return false;  
        }  
    }   
  
    @Override  
    public Object first() {  
        pos = 0;  
        return collection.get(pos);  
    }  

}
