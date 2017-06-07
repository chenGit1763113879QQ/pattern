/**
 *Keyboard.java
 * Administrator
 *2017年6月7日下午2:06:05
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:06:05
 */
public class Keyboard implements ComputerPart {

	/**
	 *  @param computerPartVisitor
	 * (non-Javadoc)
	 * @see com.designpattern.a025VistitorPattern.ComputerPart#accept(com.designpattern.a025VistitorPattern.ComputerPartVisitor)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:06:05
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
