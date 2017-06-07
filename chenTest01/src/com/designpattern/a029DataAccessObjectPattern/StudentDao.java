/**
 *StudentDao.java
 * Administrator
 *2017��6��7������4:09:23
 *
 */
package com.designpattern.a029DataAccessObjectPattern;

import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:09:23
 */
public interface StudentDao {

	   public List<Student> getAllStudents();
	   public Student getStudent(int rollNo);
	   public void updateStudent(Student student);
	   public void deleteStudent(Student student);
	   
}
