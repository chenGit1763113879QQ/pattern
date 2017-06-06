/**
 *StatePatternDemo.java
 * Administrator
 *2017��6��6������5:14:02
 *
 */
package com.designpattern.a021StatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����5:14:02
 */
public class StatePatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����5:14:02
	 */
	public static void main(String[] args) {

		 Context context = new Context();
		 
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	      
	}

}
