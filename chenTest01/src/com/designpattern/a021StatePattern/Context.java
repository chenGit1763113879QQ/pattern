/**
 *Context.java
 * Administrator
 *2017年6月6日下午5:09:10
 *
 */
package com.designpattern.a021StatePattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午5:09:10
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
