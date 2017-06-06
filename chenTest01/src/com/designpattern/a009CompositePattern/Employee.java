/**
 *Employee.java
 * Administrator
 *2017年6月6日上午11:37:49
 *
 */
package com.designpattern.a009CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建 Employee 类，该类带有 Employee 对象的列表。
 * @author 陈中强
 * @Time  2017年6月6日 上午11:37:49
 */
public class Employee {

	
	   private String name;
	   private String dept;
	   private int salary;
	   private List<Employee> subordinates;
	   
	   
	   
	   //构造函数
	   public Employee(String name,String dept, int sal) {
	      this.name = name;
	      this.dept = dept;
	      this.salary = sal;
	      subordinates = new ArrayList<Employee>();
	   }
	   
	   public void add(Employee e) {
		      subordinates.add(e);
		   }

	   public void remove(Employee e) {
	      subordinates.remove(e);
	   }

	   public List<Employee> getSubordinates(){
	     return subordinates;
	   }
	   public String toString(){
		      return ("Employee :[ Name : "+ name 
		      +", dept : "+ dept + ", salary :"
		      + salary+" ]");
		   }   
}
