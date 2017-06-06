/**
 *Circle.java
 * Administrator
 *2017年6月6日上午11:00:00
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:00:00
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
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:00:00
	 */
	@Override
	public void draw() {
		  drawAPI.drawCircle(radius,x,y);

	}

}
