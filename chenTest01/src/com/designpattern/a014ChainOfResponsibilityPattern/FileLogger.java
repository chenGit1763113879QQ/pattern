/**
 *ConsoleLogger.java
 * Administrator
 *2017��6��6������2:41:06
 *
 */
package com.designpattern.a014ChainOfResponsibilityPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����2:41:06
 */
public class FileLogger extends AbstractLogger {

	
	   public FileLogger(int level){
		      this.level = level;
		   }
	   
	/**
	 *  @param message
	 * (non-Javadoc)
	 * @see com.designpattern.a014ChainOfResponsibilityPattern.AbstractLogger#write(java.lang.String)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����2:41:06
	 */
	@Override
	protected void write(String message) {
		 System.out.println("File::Logger: " + message);
	}

}
