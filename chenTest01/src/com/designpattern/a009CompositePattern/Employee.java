/**
 *Employee.java
 * Administrator
 *2017��6��6������11:37:49
 *
 */
package com.designpattern.a009CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ���� Employee �࣬������� Employee ������б�
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:37:49
 */
public class Employee {

	
	   private String name;
	   private String dept;
	   private int salary;
	   private List<Employee> subordinates;
	   
	   
	   
	   //���캯��
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
