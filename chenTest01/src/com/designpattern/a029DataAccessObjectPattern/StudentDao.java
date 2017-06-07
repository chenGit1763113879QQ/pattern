/**
 *StudentDao.java
 * Administrator
 *2017年6月7日下午4:09:23
 *
 */
package com.designpattern.a029DataAccessObjectPattern;

import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:09:23
 */
public interface StudentDao {

	   public List<Student> getAllStudents();
	   public Student getStudent(int rollNo);
	   public void updateStudent(Student student);
	   public void deleteStudent(Student student);
	   
}
