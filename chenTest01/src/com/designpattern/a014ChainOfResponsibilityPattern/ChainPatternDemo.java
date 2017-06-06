/**
 *ChainPatternDemo.java
 * Administrator
 *2017��6��6������2:43:22
 *
 */
package com.designpattern.a014ChainOfResponsibilityPattern;

/**
 * ������ͬ���͵ļ�¼�����������ǲ�ͬ�Ĵ��󼶱𣬲���ÿ����¼����������һ����¼����ÿ����¼���е���һ����¼�������������һ���֡�
 * @author ����ǿ
 * @Time  2017��6��6�� ����2:43:22
 */
public class ChainPatternDemo {

	
	   private static AbstractLogger getChainOfLoggers(){

		      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		      errorLogger.setNextLogger(fileLogger);
		      fileLogger.setNextLogger(consoleLogger);

		      return errorLogger;	
		   }
	   
	   public static void main(String[] args) {
		   
		   AbstractLogger loggerChain = getChainOfLoggers();
		   
		      loggerChain.logMessage(AbstractLogger.INFO, 
		    	         "This is an information.");

		      System.out.println("==========================");
    	      loggerChain.logMessage(AbstractLogger.DEBUG, 
    	         "This is an debug level information.");

    	      System.out.println("==========================");
    	      loggerChain.logMessage(AbstractLogger.ERROR, 
    	         "This is an error information.");
	}	   
}
