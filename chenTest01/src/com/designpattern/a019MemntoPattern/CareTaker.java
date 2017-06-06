/**
 *CareTaker.java
 * Administrator
 *2017��6��6������4:31:50
 *
 */
package com.designpattern.a019MemntoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:31:50
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
