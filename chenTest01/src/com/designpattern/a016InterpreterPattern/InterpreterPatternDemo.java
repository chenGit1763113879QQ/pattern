/**
 *InterpreterPatternDemo.java
 * Administrator
 *2017年6月6日下午3:27:13
 *
 */
package com.designpattern.a016InterpreterPattern;

/**
 * InterpreterPatternDemo 使用 Expression 类来创建规则，并解析它们
 * @author 陈中强
 * @Time  2017年6月6日 下午3:27:13
 */
public class InterpreterPatternDemo {

	
	   //规则：Robert 和 John 是男性
	   public static Expression getMaleExpression(){
	      Expression robert = new TerminalExpression("Robert");
	      Expression john = new TerminalExpression("John");
	      return new OrExpression(robert, john);		
	   }
	   

	   //规则：Julie 是一个已婚的女性
	   public static Expression getMarriedWomanExpression(){
	      Expression julie = new TerminalExpression("Julie");
	      Expression married = new TerminalExpression("Married");
	      return new AndExpression(julie, married);		
	   }
	   
	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午3:27:13
	 */
	public static void main(String[] args) {
		
	      Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();
	      

	      System.out.println("John is male? " + isMale.interpret("John"));
	      System.out.println("Julie is a married women? " 
	      + isMarriedWoman.interpret("Married Julie"));
	      
	      

	}

}
