/**
 *FlyweightPatternDemo.java
 * Administrator
 *2017��6��6������2:06:52
 *
 */
package com.designpattern.a012FlyweightPattern;

/**
 * ʹ�øù�����ͨ��������ɫ��Ϣ����ȡʵ����Ķ���
 * @author ����ǿ
 * @Time  2017��6��6�� ����2:06:52
 */
public class FlyweightPatternDemo {

	
	   private static final String colors[] = 
		      { "Red", "Green", "Blue", "White", "Black" };
	   
	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����2:06:52
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
