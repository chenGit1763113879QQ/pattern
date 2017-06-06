/**
 *Person.java
 * Administrator
 *2017年6月6日上午11:20:15
 *
 */
package com.designpattern.a008FilterPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:20:15
 */
public class Person {

	
	   private String name;
	   private String gender;
	   private String maritalStatus;

	   public Person(String name,String gender,String maritalStatus){
	      this.name = name;
	      this.gender = gender;
	      this.maritalStatus = maritalStatus;		
	   }

	   public String getName() {
	      return name;
	   }
	   public String getGender() {
	      return gender;
	   }
	   public String getMaritalStatus() {
	      return maritalStatus;
	   }	
	   
}
