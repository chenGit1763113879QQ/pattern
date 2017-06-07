/**
 *Monitor.java
 * Administrator
 *2017��6��7������2:20:23
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����2:20:23
 */
public class Monitor  implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}