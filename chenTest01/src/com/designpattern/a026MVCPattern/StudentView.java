/**
 *StudentView.java
 * Administrator
 *2017年6月7日下午2:49:53
 *
 */
package com.designpattern.a026MVCPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:49:53
 */
public class StudentView {
	
	public void printStudentDetails(String studentName,String studentRollNo){
		
		System.out.println("Student: ");
		System.out.println("Name: "+studentName);
		System.out.println("Roll No: "+studentRollNo);
	}

}
