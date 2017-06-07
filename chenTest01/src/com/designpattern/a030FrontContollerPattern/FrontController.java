/**
 *FrontController.java
 * Administrator
 *2017��6��7������4:28:58
 *
 */
package com.designpattern.a030FrontContollerPattern;

/**
 * ����ǰ�˿����� FrontController��
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:28:58
 */
public class FrontController {

	   private Dispatcher dispatcher;

	   public FrontController(){
	      dispatcher = new Dispatcher();
	   }

	   private boolean isAuthenticUser(){
	      System.out.println("User is authenticated successfully.");
	      return true;
	   }

	   private void trackRequest(String request){
	      System.out.println("Page requested: " + request);
	   }

	   public void dispatchRequest(String request){
		      //��¼ÿһ������
		      trackRequest(request);
		      //���û����������֤
		      if(isAuthenticUser()){
		         dispatcher.dispatch(request);
		      }	
		   }  
	   
	   
	   
	
}
