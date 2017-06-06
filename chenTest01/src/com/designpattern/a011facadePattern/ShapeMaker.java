/**
 *ShapeMaker.java
 * Administrator
 *2017��6��6������1:58:55
 *
 */
package com.designpattern.a011facadePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����1:58:55
 */
public class ShapeMaker {

	
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	   
}
