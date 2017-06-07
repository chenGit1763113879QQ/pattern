/**
 *Client.java
 * Administrator
 *2017��6��7������4:57:21
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:57:21
 */
public class Client {

	
	   FilterManager filterManager;
	

	   public void setFilterManager(FilterManager filterManager){
	      this.filterManager = filterManager;
	   }
	
	   public void sendRequest(String request){
	      filterManager.filterRequest(request);
	   }
	   
}
