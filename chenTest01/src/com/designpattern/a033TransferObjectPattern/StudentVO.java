/**
 *StudentVO.java
 * Administrator
 *2017年6月7日下午5:22:38
 *
 */
package com.designpattern.a033TransferObjectPattern;

/**
 * 创建传输对象
 * @author 陈中强
 * @Time  2017年6月7日 下午5:22:38
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
