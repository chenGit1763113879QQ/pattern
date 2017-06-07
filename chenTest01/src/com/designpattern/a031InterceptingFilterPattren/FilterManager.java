/**
 *FilterManager.java
 * Administrator
 *2017��6��7������4:54:23
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:54:23
 */
public class FilterManager {
	
	   FilterChain filterChain;
	
	   public FilterManager(Target target){
	      filterChain = new FilterChain();
	      filterChain.setTarget(target);
	   }
	   
	   public void setFilter(Filter filter){
	      filterChain.addFilter(filter);
	   }

	   public void filterRequest(String request){
	      filterChain.execute(request);
	   }
	   
	   
	   

}
