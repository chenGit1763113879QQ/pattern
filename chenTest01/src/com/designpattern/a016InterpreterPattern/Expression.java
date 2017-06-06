/**
 *Expression.java
 * Administrator
 *2017年6月6日下午3:17:33
 *
 */
package com.designpattern.a016InterpreterPattern;

/**
 * 创建一个表达式接口。
 * @author 陈中强
 * @Time  2017年6月6日 下午3:17:33
 */
public interface Expression {

	 public boolean interpret(String context);
	 
}
