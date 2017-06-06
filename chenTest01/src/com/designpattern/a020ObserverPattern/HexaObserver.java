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
public class HexaObserver extends Observer {

	
	   public HexaObserver(Subject subject){
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
	      System.out.println( "Hex String: " 
	    	      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	      
	}

}
