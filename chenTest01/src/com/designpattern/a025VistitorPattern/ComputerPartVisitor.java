/**
 *ComputerPartVisitor.java
 * Administrator
 *2017��6��7������2:04:18
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����2:04:18
 */
public interface ComputerPartVisitor {

	public void visit(Computer compter);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	
}
