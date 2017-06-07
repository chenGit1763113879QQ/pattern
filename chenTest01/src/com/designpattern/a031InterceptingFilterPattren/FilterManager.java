/**
 *FilterManager.java
 * Administrator
 *2017年6月7日下午4:54:23
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:54:23
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
