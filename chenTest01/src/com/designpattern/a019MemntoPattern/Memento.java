/**
 *Memento.java
 * Administrator
 *2017年6月6日下午4:29:05
 *
 */
package com.designpattern.a019MemntoPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午4:29:05
 */
public class Memento {

	
	private String state;
	
	
	   public Memento(String state){
		      this.state = state;
		   }

		   public String getState(){
		      return state;
		   }	
		   
}
