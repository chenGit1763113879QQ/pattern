/**
 *ServiceLocatorPatternDemo.java
 * Administrator
 *2017��6��7������5:16:48
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����5:16:48
 */
public class ServiceLocatorPatternDemo {

	
	   public static void main(String[] args) {
	      Service service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();
	      service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();		
	   }	
}
