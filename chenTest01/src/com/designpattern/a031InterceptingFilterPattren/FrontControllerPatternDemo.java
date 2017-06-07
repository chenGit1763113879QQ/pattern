/**
 *FrontControllerPatternDemo.java
 * Administrator
 *2017��6��7������4:59:14
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:59:14
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
