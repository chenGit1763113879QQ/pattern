/**
 *AndCriteria.java
 * Administrator
 *2017年6月6日上午11:26:16
 *
 */
package com.designpattern.a008FilterPattern;

import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:26:16
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
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:26:16
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
	      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);		
	      return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
