/**
 *StatePatternDemo.java
 * Administrator
 *2017年6月6日下午5:14:02
 *
 */
package com.designpattern.a021StatePattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午5:14:02
 */
public class StatePatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午5:14:02
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
