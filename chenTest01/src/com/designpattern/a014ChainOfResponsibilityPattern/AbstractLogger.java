/**
 *AbstractLogger.java
 * Administrator
 *2017��6��6������2:38:27
 *
 */
package com.designpattern.a014ChainOfResponsibilityPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����2:38:27
 */
public abstract class AbstractLogger {

	
	   public static int INFO = 1;
	   public static int DEBUG = 2;
	   public static int ERROR = 3;
	   
	   protected int level;
	   
	   
	   //�������е���һ��Ԫ��
	   protected AbstractLogger nextLogger;
	   
	   
	   public void setNextLogger(AbstractLogger nextLogger){
		      this.nextLogger = nextLogger;
		   }
	   

	   public void logMessage(int level, String message){
	      if(this.level <= level){
	         write(message);
	      }
	      if(nextLogger !=null){
	         nextLogger.logMessage(level, message);
	      }
	   }

	   

	   abstract protected void write(String message);
	   
}
