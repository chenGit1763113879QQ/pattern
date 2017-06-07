/**
 *CustomerFactory.java
 * Administrator
 *2017年6月7日上午9:23:42
 *
 */
package com.designpattern.a022NullObjectPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 上午9:23:42
 */
public class CustomerFactory {
	
	public static final String[] names = {"Rob","Joe","Julie"};
	
	public static AbstractCustomer getCustomer(String name){
		for(int i = 0; i < names.length; i++){
			
			if(names[i].equalsIgnoreCase(name)){
				
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
		
	}

}
