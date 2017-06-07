/**
 *Client.java
 * Administrator
 *2017年6月7日下午4:57:21
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:57:21
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
