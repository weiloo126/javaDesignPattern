package com.sample.javaDesignMode.behavioral._3stateOfClass.memento;

/**
 *   
 * @date 2017年11月14日
 */
public class Storage {

	private Memento memento;  
    
    public Storage(Memento memento) {  
        this.memento = memento;  
    }  
  
    public Memento getMemento() {  
        return memento;  
    }  
  
    public void setMemento(Memento memento) {  
        this.memento = memento;  
    }  
}
