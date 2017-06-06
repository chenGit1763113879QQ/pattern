/**
 *Rectangle.java
 * Administrator
 *2017��6��6������1:56:39
 *
 */
package com.designpattern.a012FlyweightPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����1:56:39
 */
public class Circle implements Shape {

	   private String color;
	   private int x;
	   private int y;
	   private int radius;
	
	   
	   public Circle(String color){
		      this.color = color;		
		   }
	
	   public void setX(int x) {
	      this.x = x;
	   }
	
	   public void setY(int y) {
	      this.y = y;
	   }
	
	   public void setRadius(int radius) {
	      this.radius = radius;
	   }
	   
		   
	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a011facadePattern.Shape#draw()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����1:56:39
	 */
	@Override
	public void draw() {
	      System.out.println("Circle: Draw() [Color : " + color 
	    	         +", x : " + x +", y :" + y +", radius :" + radius);

	}

}
