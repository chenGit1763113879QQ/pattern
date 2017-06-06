/**
 *AndCriteria.java
 * Administrator
 *2017��6��6������11:26:16
 *
 */
package com.designpattern.a008FilterPattern;

import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:26:16
 */
public class AndCriteria implements Criteria {

	
	   private Criteria criteria;
	   private Criteria otherCriteria;
	   
	   
	   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		      this.criteria = criteria;
		      this.otherCriteria = otherCriteria; 
		   }
	   
	/**
	 *  @param persons
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a008FilterPattern.Criteria#meetCriteria(java.util.List)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����11:26:16
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
	      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);		
	      return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
