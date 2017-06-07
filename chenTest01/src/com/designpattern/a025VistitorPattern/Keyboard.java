/**
 *Keyboard.java
 * Administrator
 *2017��6��7������2:06:05
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����2:06:05
 */
public class Keyboard implements ComputerPart {

	/**
	 *  @param computerPartVisitor
	 * (non-Javadoc)
	 * @see com.designpattern.a025VistitorPattern.ComputerPart#accept(com.designpattern.a025VistitorPattern.ComputerPartVisitor)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����2:06:05
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
