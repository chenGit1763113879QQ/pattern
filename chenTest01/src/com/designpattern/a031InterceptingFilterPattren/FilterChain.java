/**
 *FilterChain.java
 * Administrator
 *2017年6月7日下午4:53:29
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:53:29
 */
public class FilterChain {

	
	   private List<Filter> filters = new ArrayList<Filter>();
	   private Target target;

	   public void addFilter(Filter filter){
	      filters.add(filter);
	   }

	   public void execute(String request){
	      for (Filter filter : filters) {
	         filter.execute(request);
	      }
	      target.execute(request);
	   }

	   public void setTarget(Target target){
	      this.target = target;
	   }
	   
}
