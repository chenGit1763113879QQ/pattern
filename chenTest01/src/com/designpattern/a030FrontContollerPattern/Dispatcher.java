/**
 *Dispatcher.java
 * Administrator
 *2017��6��7������4:28:12
 *
 */
package com.designpattern.a030FrontContollerPattern;

/**
 * ���������� Dispatcher
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:28:12
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
