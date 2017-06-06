/**
 *CriteriaMale.java
 * Administrator
 *2017��6��6������11:22:04
 *
 */
package com.designpattern.a008FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:22:04
 */
public class CriteriaMale implements Criteria {

	/**
	 *  @param persons
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a008FilterPattern.Criteria#meetCriteria(java.util.List)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����11:22:04
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
	      List<Person> malePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getGender().equalsIgnoreCase("MALE")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	}

}