/**
 *FrontControllerPatternDemo.java
 * Administrator
 *2017��6��7������4:30:52
 *
 */
package com.designpattern.a030FrontContollerPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:30:52
 */
public class FrontControllerPatternDemo {

	
	   public static void main(String[] args) {
		      FrontController frontController = new FrontController();
		      frontController.dispatchRequest("HOME");
		      frontController.dispatchRequest("STUDENT");
		   }
	   
}
