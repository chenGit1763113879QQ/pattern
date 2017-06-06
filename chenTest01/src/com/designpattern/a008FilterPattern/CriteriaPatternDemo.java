/**
 *CriteriaPatternDemo.java
 * Administrator
 *2017年6月6日上午11:32:28
 *
 */
package com.designpattern.a008FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:32:28
 */
public class CriteriaPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:32:28
	 */
	public static void main(String[] args) {
	      List<Person> persons = new ArrayList<Person>();

	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John","Male", "Married"));
	      persons.add(new Person("Laura","Female", "Married"));
	      persons.add(new Person("Diana","Female", "Single"));
	      persons.add(new Person("Mike","Male", "Single"));
	      persons.add(new Person("Bobby","Male", "Single"));
	      
	      
	      
	      Criteria male = new CriteriaMale();
	      Criteria female = new CriteriaFemale();
	      Criteria single = new CriteriaSingle();
	      Criteria singleMale = new AndCriteria(single, male);
	      Criteria singleOrFemale = new OrCriteria(single, female);
	      
	      
	      
	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));

	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));

	      System.out.println("\nSingle Males: ");
	      printPersons(singleMale.meetCriteria(persons));

	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	      
	      
	      
	      

	}

	/**
	 *  @param meetCriteria
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:33:46
	*/
	private static void printPersons(List<Person> persons) {
	      for (Person person : persons) {
	          System.out.println("Person : [ Name : " + person.getName() 
	             +", Gender : " + person.getGender() 
	             +", Marital Status : " + person.getMaritalStatus()
	             +" ]");
	       }
		
	}

}
