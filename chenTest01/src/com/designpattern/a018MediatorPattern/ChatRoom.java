/**
 *ChatRoom.java
 * Administrator
 *2017年6月6日下午4:20:25
 *
 */
package com.designpattern.a018MediatorPattern;

import java.util.Date;


/**
 * @author 陈中强
 * @Time  2017年6月6日 下午4:20:25
 */
public class ChatRoom {

	
	   public static void showMessage(User user, String message){
		      System.out.println(new Date().toString()
		         + " [" + user.getName() +"] : " + message);
		   }
	   
}
