/**
 *CriteriaSingle.java
 * Administrator
 *2017年6月6日上午11:24:47
 *
 */
package com.designpattern.a008FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:24:47
 */
public class CriteriaSingle implements Criteria {

	/**
	 *  @param persons
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a008FilterPattern.Criteria#meetCriteria(java.util.List)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:24:47
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
	      List<Person> singlePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
	            singlePersons.add(person);
	         }
	      }
	      return singlePersons;
	}

}
