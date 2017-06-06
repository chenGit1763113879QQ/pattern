/**
 *ChainPatternDemo.java
 * Administrator
 *2017年6月6日下午2:43:22
 *
 */
package com.designpattern.a014ChainOfResponsibilityPattern;

/**
 * 创建不同类型的记录器。赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。每个记录器中的下一个记录器代表的是链的一部分。
 * @author 陈中强
 * @Time  2017年6月6日 下午2:43:22
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
