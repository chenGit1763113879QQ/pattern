/**
 *ChatRoom.java
 * Administrator
 *2017��6��6������4:20:25
 *
 */
package com.designpattern.a018MediatorPattern;

import java.util.Date;


/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:20:25
 */
public class ChatRoom {

	
	   public static void showMessage(User user, String message){
		      System.out.println(new Date().toString()
		         + " [" + user.getName() +"] : " + message);
		   }
	   
}
