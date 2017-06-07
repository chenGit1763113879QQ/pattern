/**
 *FilterChain.java
 * Administrator
 *2017��6��7������4:53:29
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:53:29
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
