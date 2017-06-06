/**
 *Subject.java
 * Administrator
 *2017��6��6������4:45:22
 *
 */
package com.designpattern.a020ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:45:22
 */
public class Subject {

	
	  private List<Observer> observers = new ArrayList<Observer>();
	  private int state;
	  
	  public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      notifyAllObservers();
	   }
	   public void attach(Observer observer){
		      observers.add(observer);		
		   }
	   public void notifyAllObservers(){
		      for (Observer observer : observers) {
		         observer.update();
		      }
		   } 	
}
