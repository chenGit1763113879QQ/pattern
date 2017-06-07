/**
 *ComputerPartVisitor.java
 * Administrator
 *2017年6月7日下午2:04:18
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:04:18
 */
public interface ComputerPartVisitor {

	public void visit(Computer compter);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	
}
