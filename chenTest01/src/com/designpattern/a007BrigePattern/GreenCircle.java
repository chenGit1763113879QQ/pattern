/**
 *RedCircle.java
 * Administrator
 *2017��6��6������10:55:33
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * ����ʵ���� DrawAPI �ӿڵ�ʵ���Ž�ʵ���ࡣ
 * @author ����ǿ
 * @Time  2017��6��6�� ����10:55:33
 */
public class GreenCircle implements DrawAPI {

	/**
	 *  @param radius
	 *  @param x
	 *  @param y
	 * (non-Javadoc)
	 * @see com.designpattern.a007BrigePattern.DrawAPI#drawCircle(int, int, int)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����10:55:33
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: green, radius: "
	    	         + radius +", x: " +x+", "+ y +"]");
	}

}
