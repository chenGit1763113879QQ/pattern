/**
 *Context.java
 * Administrator
 *2017��6��7������11:52:10
 *
 */
package com.designpattern.a023StrategyPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����11:52:10
 */
public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public int executeStrategy(int num1,int num2){
		return strategy.doOperation(num1, num2);
	}
}
