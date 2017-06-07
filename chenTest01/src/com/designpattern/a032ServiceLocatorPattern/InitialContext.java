/**
 *InitialContext.java
 * Administrator
 *2017年6月7日下午5:04:06
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午5:04:06
 */
public class InitialContext {

	
	public Object lookup(String jndiName){
		
		if(jndiName.equalsIgnoreCase("SERVICE1")){
			System.out.println("Looking up and creating a new service1 object");
			return new Service1();
		}else if(jndiName.equalsIgnoreCase("SERVICE2")){
	         System.out.println("Looking up and creating a new Service2 object");
	         return new Service2();
		}
		
		return null;
		
	}
}
