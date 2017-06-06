/**
 *RedCircle.java
 * Administrator
 *2017年6月6日上午10:55:33
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类。
 * @author 陈中强
 * @Time  2017年6月6日 上午10:55:33
 */
public class GreenCircle implements DrawAPI {

	/**
	 *  @param radius
	 *  @param x
	 *  @param y
	 * (non-Javadoc)
	 * @see com.designpattern.a007BrigePattern.DrawAPI#drawCircle(int, int, int)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午10:55:33
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: green, radius: "
	    	         + radius +", x: " +x+", "+ y +"]");
	}

}
