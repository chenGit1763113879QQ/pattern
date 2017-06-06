/**
 *Shape.java
 * Administrator
 *2017年6月6日上午10:58:48
 *
 */
package com.designpattern.a007BrigePattern;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * @author 陈中强
 * @Time  2017年6月6日 上午10:58:48
 */
public abstract class Shape {

	
	   protected DrawAPI drawAPI;
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	   
}
