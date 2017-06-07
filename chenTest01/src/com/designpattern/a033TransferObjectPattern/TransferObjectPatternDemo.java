/**
 *TransferObjectPatternDemo.java
 * Administrator
 *2017年6月7日下午5:29:15
 *
 */
package com.designpattern.a033TransferObjectPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午5:29:15
 */
public class TransferObjectPatternDemo {

	
	   public static void main(String[] args) {
	      StudentBO studentBusinessObject = new StudentBO();

	      //输出所有的学生
	      for (StudentVO student : studentBusinessObject.getAllStudents()) {
	         System.out.println("Student: [RollNo : "
	         +student.getRollNo()+", Name : "+student.getName()+" ]");
	      }

	      //更新学生
	      StudentVO student =studentBusinessObject.getAllStudents().get(0);
	      student.setName("Michael");
	      studentBusinessObject.updateStudent(student);

	      //获取学生
	      studentBusinessObject.getStudent(0);
	      System.out.println("Student: [RollNo : "
	      +student.getRollNo()+", Name : "+student.getName()+" ]");
	   }
}
