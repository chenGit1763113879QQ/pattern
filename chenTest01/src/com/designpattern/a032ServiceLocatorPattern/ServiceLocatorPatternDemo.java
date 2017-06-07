/**
 *ServiceLocatorPatternDemo.java
 * Administrator
 *2017年6月7日下午5:16:48
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午5:16:48
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
