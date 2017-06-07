/**
 *ServiceLocator.java
 * Administrator
 *2017��6��7������5:10:52
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����5:10:52
 */
public class ServiceLocator {

	
	private static Cache cache;
	
	static{
		cache = new Cache();
	}
	
	public static Service getService(String  jndiName){
		
		Service service = cache.getService(jndiName);
		
		if(service != null){
			return service;
		}
		
		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
		
	}
	
}
