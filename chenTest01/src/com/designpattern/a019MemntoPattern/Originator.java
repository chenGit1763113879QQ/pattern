/**
 *Originator.java
 * Administrator
 *2017年6月6日下午4:29:50
 *
 */
package com.designpattern.a019MemntoPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午4:29:50
 */
public class Originator {
	
	
	   private String state;
	
	   public void setState(String state){
	      this.state = state;
	   }
	
	   public String getState(){
	      return state;
	   }
	
	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }
	
	   public void getStateFromMemento(Memento Memento){
	      state = Memento.getState();
	   }
}
