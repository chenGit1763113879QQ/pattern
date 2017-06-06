/**
 *MementoPatternDemo.java
 * Administrator
 *2017��6��6������4:32:54
 *
 */
package com.designpattern.a019MemntoPattern;

/**
 * ʹ�� CareTaker �� Originator ����
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:32:54
 */
public class MementoPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����4:32:54
	 */
	public static void main(String[] args) {
		
		
		Originator originator = new Originator();
	    CareTaker careTaker = new CareTaker();
	    
	    
	      originator.setState("State #1");
	      originator.setState("State #2");
	      careTaker.add(originator.saveStateToMemento());
	      originator.setState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      originator.setState("State #4");
	      
	      
	      System.out.println("Current State: " + originator.getState());		
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	}

}