/**
 *Mouse.java
 * Administrator
 *2017年6月7日下午2:20:12
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:20:12
 */
public class Mouse  implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}