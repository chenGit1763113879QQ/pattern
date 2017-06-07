/**
 *FrontController.java
 * Administrator
 *2017年6月7日下午4:28:58
 *
 */
package com.designpattern.a030FrontContollerPattern;

/**
 * 创建前端控制器 FrontController。
 * @author 陈中强
 * @Time  2017年6月7日 下午4:28:58
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
		      //记录每一个请求
		      trackRequest(request);
		      //对用户进行身份验证
		      if(isAuthenticUser()){
		         dispatcher.dispatch(request);
		      }	
		   }  
	   
	   
	   
	
}
