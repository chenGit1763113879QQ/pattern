/**
 *BinaryObserver.java
 * Administrator
 *2017��6��6������4:57:35
 *
 */
package com.designpattern.a020ObserverPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:57:35
 */
public class OctalObserver extends Observer {

	
	   public OctalObserver(Subject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }
	   
	   
	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a020ObserverPattern.Observer#update()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����4:57:35
	 */
	@Override
	public void update() {
	     System.out.println( "Octal String: " 
	    	     + Integer.toOctalString( subject.getState() ) ); 
	}

}
