/**
 *InterpreterPatternDemo.java
 * Administrator
 *2017��6��6������3:27:13
 *
 */
package com.designpattern.a016InterpreterPattern;

/**
 * InterpreterPatternDemo ʹ�� Expression �����������򣬲���������
 * @author ����ǿ
 * @Time  2017��6��6�� ����3:27:13
 */
public class InterpreterPatternDemo {

	
	   //����Robert �� John ������
	   public static Expression getMaleExpression(){
	      Expression robert = new TerminalExpression("Robert");
	      Expression john = new TerminalExpression("John");
	      return new OrExpression(robert, john);		
	   }
	   

	   //����Julie ��һ���ѻ��Ů��
	   public static Expression getMarriedWomanExpression(){
	      Expression julie = new TerminalExpression("Julie");
	      Expression married = new TerminalExpression("Married");
	      return new AndExpression(julie, married);		
	   }
	   
	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����3:27:13
	 */
	public static void main(String[] args) {
		
	      Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();
	      

	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " 
	      + isMarriedWoman.interpret("Married Julie"));
	      
	      

	}

}
