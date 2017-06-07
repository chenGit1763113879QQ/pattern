/**
 *Mouse.java
 * Administrator
 *2017��6��7������2:20:12
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����2:20:12
 */
public class Mouse  implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}