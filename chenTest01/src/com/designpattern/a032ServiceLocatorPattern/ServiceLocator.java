/**
 *ServiceLocator.java
 * Administrator
 *2017年6月7日下午5:10:52
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午5:10:52
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
