/**
 *DaoPatternDemo.java
 * Administrator
 *2017年6月7日下午4:21:04
 *
 */
package com.designpattern.a029DataAccessObjectPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:21:04
 */
public class DaoPatternDemo {
	   public static void main(String[] args) {
	      StudentDao studentDao = new StudentDaoImpl();

	      //输出所有的学生
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : "
	            +student.getRollNo()+", Name : "+student.getName()+" ]");
	      }


	      //更新学生
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //获取学生
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : "
	         +student.getRollNo()+", Name : "+student.getName()+" ]");		
	   }
	}