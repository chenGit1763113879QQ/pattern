/**
 *StudentController.java
 * Administrator
 *2017年6月7日下午2:52:29
 *
 */
package com.designpattern.a026MVCPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:52:29
 */
public class StudentController {

	private Student model;
	private StudentView view;
	
	public StudentController(Student model,StudentView view){
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name){
		model.setName(name);
	}
	
   public String getStudentName(){
	      return model.getName();		
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo);		
   }

   public String getStudentRollNo(){
      return model.getRollNo();		
   }
	
   public void updateView(){
	   view.printStudentDetails(model.getName(), model.getRollNo());
   }
	
}
