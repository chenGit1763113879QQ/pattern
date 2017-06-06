/**
 *Circle.java
 * Administrator
 *2017��6��6������11:00:00
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:00:00
 */
public class Circle extends Shape {

	 private int x, y, radius;
	
	  public Circle(int x, int y, int radius, DrawAPI drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }
	  
	  /**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a007BrigePattern.Shape#draw()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����11:00:00
	 */
	@Override
	public void draw() {
		  drawAPI.drawCircle(radius,x,y);

	}

}
