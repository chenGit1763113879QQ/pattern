/**
 *BinaryObserver.java
 * Administrator
 *2017年6月6日下午4:57:35
 *
 */
package com.designpattern.a020ObserverPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午4:57:35
 */
public class BinaryObserver extends Observer {

	
	   public BinaryObserver(Subject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }
	   
	   
	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a020ObserverPattern.Observer#update()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午4:57:35
	 */
	@Override
	public void update() {
	      System.out.println( "Binary String: " 
	    	      + Integer.toBinaryString( subject.getState() ) );

	}

}
