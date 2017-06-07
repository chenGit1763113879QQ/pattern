/**
 *DaoPatternDemo.java
 * Administrator
 *2017��6��7������4:21:04
 *
 */
package com.designpattern.a029DataAccessObjectPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:21:04
 */
public class DaoPatternDemo {
	   public static void main(String[] args) {
	      StudentDao studentDao = new StudentDaoImpl();

	      //������е�ѧ��
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : "
	            +student.getRollNo()+", Name : "+student.getName()+" ]");
	      }


	      //����ѧ��
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //��ȡѧ��
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : "
	         +student.getRollNo()+", Name : "+student.getName()+" ]");		
	   }
	}