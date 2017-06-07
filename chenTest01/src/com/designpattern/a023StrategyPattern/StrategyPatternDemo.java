/**
 *StrategyPatternDemo.java
 * Administrator
 *2017��6��7������11:57:57
 *
 */
package com.designpattern.a023StrategyPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����11:57:57
 */
public class StrategyPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����11:57:57
	 */
	public static void main(String[] args) {
		
	      Context context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSubstract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}

}
