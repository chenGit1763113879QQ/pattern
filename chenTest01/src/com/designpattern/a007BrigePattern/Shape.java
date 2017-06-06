/**
 *Shape.java
 * Administrator
 *2017��6��6������10:58:48
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * ʹ�� DrawAPI �ӿڴ��������� Shape��
 * @author ����ǿ
 * @Time  2017��6��6�� ����10:58:48
 */
public abstract class Shape {

	
	   protected DrawAPI drawAPI;
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	   
}
