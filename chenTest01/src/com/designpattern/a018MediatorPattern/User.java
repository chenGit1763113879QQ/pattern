/**
 *User.java
 * Administrator
 *2017��6��6������4:21:13
 *
 */
package com.designpattern.a018MediatorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:21:13
 */
public class User {

	
	   private String name;

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public User(String name){
	      this.name  = name;
	   }

	   public void sendMessage(String message){
	      ChatRoom.showMessage(this,message);
	   }
	   
}
