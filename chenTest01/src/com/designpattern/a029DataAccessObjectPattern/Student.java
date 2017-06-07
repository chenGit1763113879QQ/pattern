/**
 *Student.java
 * Administrator
 *2017年6月7日下午4:08:43
 *
 */
package com.designpattern.a029DataAccessObjectPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:08:43
 */
public class Student {
	   private String name;
	   private int rollNo;

	   Student(String name, int rollNo){
	      this.name = name;
	      this.rollNo = rollNo;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getRollNo() {
	      return rollNo;
	   }

	   public void setRollNo(int rollNo) {
	      this.rollNo = rollNo;
	   }
	}