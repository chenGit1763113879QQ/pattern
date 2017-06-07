/**
 *ComputerPart.java
 * Administrator
 *2017年6月7日下午2:02:47
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:02:47
 */
public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}
