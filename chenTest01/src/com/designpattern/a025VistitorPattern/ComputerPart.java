/**
 *ComputerPart.java
 * Administrator
 *2017��6��7������2:02:47
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����2:02:47
 */
public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}
