/**
 *BridgePatternDemo.java
 * Administrator
 *2017��6��6������11:01:31
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * ʹ�� Shape �� DrawAPI �໭����ͬ��ɫ��Բ��
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:01:31
 */
public class BridgePatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����11:01:31
	 */
	public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();

	}

}
