/**
 *Context.java
 * Administrator
 *2017��6��6������5:09:10
 *
 */
package com.designpattern.a021StatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����5:09:10
 */
public class Context {

	
	   private State state;

	   public Context(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	   
}
