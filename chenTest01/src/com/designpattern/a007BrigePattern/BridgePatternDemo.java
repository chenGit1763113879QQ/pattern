/**
 *BridgePatternDemo.java
 * Administrator
 *2017年6月6日上午11:01:31
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 * @author 陈中强
 * @Time  2017年6月6日 上午11:01:31
 */
public class BridgePatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:01:31
	 */
	public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();

	}

}
