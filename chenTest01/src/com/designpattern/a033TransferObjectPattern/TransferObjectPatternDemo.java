/**
 *TransferObjectPatternDemo.java
 * Administrator
 *2017��6��7������5:29:15
 *
 */
package com.designpattern.a033TransferObjectPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����5:29:15
 */
public class TransferObjectPatternDemo {

	
	   public static void main(String[] args) {
	      StudentBO studentBusinessObject = new StudentBO();

	      //������е�ѧ��
	      for (StudentVO student : studentBusinessObject.getAllStudents()) {
	         System.out.println("Student: [RollNo : "
	         +student.getRollNo()+", Name : "+student.getName()+" ]");
	      }

	      //����ѧ��
	      StudentVO student =studentBusinessObject.getAllStudents().get(0);
	      student.setName("Michael");
	      studentBusinessObject.updateStudent(student);

	      //��ȡѧ��
	      studentBusinessObject.getStudent(0);
	      System.out.println("Student: [RollNo : "
	      +student.getRollNo()+", Name : "+student.getName()+" ]");
	   }
}
