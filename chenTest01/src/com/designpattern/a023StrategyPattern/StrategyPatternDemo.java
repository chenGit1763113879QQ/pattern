/**
 *StrategyPatternDemo.java
 * Administrator
 *2017年6月7日上午11:57:57
 *
 */
package com.designpattern.a023StrategyPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 上午11:57:57
 */
public class StrategyPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午11:57:57
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
