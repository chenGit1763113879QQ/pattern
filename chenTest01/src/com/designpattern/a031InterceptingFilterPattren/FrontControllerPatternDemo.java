/**
 *FrontControllerPatternDemo.java
 * Administrator
 *2017年6月7日下午4:59:14
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:59:14
 */
public class FrontControllerPatternDemo {

	
   public static void main(String[] args) {
	      FilterManager filterManager = new FilterManager(new Target());
	      filterManager.setFilter(new AuthenticationFilter());
	      filterManager.setFilter(new DebugFilter());

	      Client client = new Client();
	      client.setFilterManager(filterManager);
	      client.sendRequest("HOME");
	   }
   
}
