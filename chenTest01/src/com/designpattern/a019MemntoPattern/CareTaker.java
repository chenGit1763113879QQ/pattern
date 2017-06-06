/**
 *CareTaker.java
 * Administrator
 *2017年6月6日下午4:31:50
 *
 */
package com.designpattern.a019MemntoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午4:31:50
 */
public class CareTaker {

	
	 private List<Memento> mementoList = new ArrayList<Memento>();
	 
	   public void add(Memento state){
		      mementoList.add(state);
	   }

	   public Memento get(int index){
	      return mementoList.get(index);
	   }
}
