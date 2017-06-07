/**
 *StudentVO.java
 * Administrator
 *2017��6��7������5:22:38
 *
 */
package com.designpattern.a033TransferObjectPattern;

/**
 * �����������
 * @author ����ǿ
 * @Time  2017��6��7�� ����5:22:38
 */
public class StudentVO {

	
	   private String name;
	   private int rollNo;

	   StudentVO(String name, int rollNo){
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
