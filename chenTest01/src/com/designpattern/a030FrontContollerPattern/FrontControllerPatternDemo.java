/**
 *FrontControllerPatternDemo.java
 * Administrator
 *2017年6月7日下午4:30:52
 *
 */
package com.designpattern.a030FrontContollerPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:30:52
 */
public class FrontControllerPatternDemo {

	
	   public static void main(String[] args) {
		      FrontController frontController = new FrontController();
		      frontController.dispatchRequest("HOME");
		      frontController.dispatchRequest("STUDENT");
		   }
	   
}
