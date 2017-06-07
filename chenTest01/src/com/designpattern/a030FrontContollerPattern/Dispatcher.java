/**
 *Dispatcher.java
 * Administrator
 *2017年6月7日下午4:28:12
 *
 */
package com.designpattern.a030FrontContollerPattern;

/**
 * 创建调度器 Dispatcher
 * @author 陈中强
 * @Time  2017年6月7日 下午4:28:12
 */
public class Dispatcher {
	   private StudentView studentView;
	   private HomeView homeView;
	   public Dispatcher(){
	      studentView = new StudentView();
	      homeView = new HomeView();
	   }

	   public void dispatch(String request){
	      if(request.equalsIgnoreCase("STUDENT")){
	         studentView.show();
	      }else{
	         homeView.show();
	      }	
	   }
	}
