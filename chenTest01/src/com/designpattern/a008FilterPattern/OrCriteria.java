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
public class OrCriteria implements Criteria {

	
	   private Criteria criteria;
	   private Criteria otherCriteria;
	   
	   
	   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
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

	      List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
	      List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

	      for (Person person : otherCriteriaItems) {
	         if(!firstCriteriaItems.contains(person)){
		        firstCriteriaItems.add(person);
	         }
	      }	
	      return firstCriteriaItems;
	      
	}

}
