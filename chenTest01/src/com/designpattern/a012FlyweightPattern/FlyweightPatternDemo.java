/**
 *FlyweightPatternDemo.java
 * Administrator
 *2017年6月6日下午2:06:52
 *
 */
package com.designpattern.a012FlyweightPattern;

/**
 * 使用该工厂，通过传递颜色信息来获取实体类的对象
 * @author 陈中强
 * @Time  2017年6月6日 下午2:06:52
 */
public class FlyweightPatternDemo {

	
	   private static final String colors[] = 
		      { "Red", "Green", "Blue", "White", "Black" };
	   
	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午2:06:52
	 */
	public static void main(String[] args) {
	      for(int i=0; i < 20; ++i) {
	          Circle circle = 
	             (Circle)ShapeFactory.getCircle(getRandomColor());
	          circle.setX(getRandomX());
	          circle.setY(getRandomY());
	          circle.setRadius(100);
	          circle.draw();
	       }

	}
	   private static String getRandomColor() {
		      return colors[(int)(Math.random()*colors.length)];
		   }
		   private static int getRandomX() {
		      return (int)(Math.random()*100 );
		   }
		   private static int getRandomY() {
		      return (int)(Math.random()*100);
		   }
}
