/**
 *ConsoleLogger.java
 * Administrator
 *2017年6月6日下午2:41:06
 *
 */
package com.designpattern.a014ChainOfResponsibilityPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午2:41:06
 */
public class ErrorLogger extends AbstractLogger {

	
	   public ErrorLogger(int level){
		      this.level = level;
		   }
	   
	/**
	 *  @param message
	 * (non-Javadoc)
	 * @see com.designpattern.a014ChainOfResponsibilityPattern.AbstractLogger#write(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午2:41:06
	 */
	@Override
	protected void write(String message) {
		 System.out.println("Error  Console::Logger: " + message);
	}

}
