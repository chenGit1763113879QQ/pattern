/**
 *TerminalExpression.java
 * Administrator
 *2017��6��6������3:22:09
 *
 */
package com.designpattern.a016InterpreterPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����3:22:09
 */
public class TerminalExpression implements Expression {

	   private String data;

	   public TerminalExpression(String data){
	      this.data = data; 
	   }
	   
	/**
	 *  @param context
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a016InterpreterPattern.Expression#interpret(java.lang.String)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����3:22:09
	 */
	@Override
	public boolean interpret(String context) {
		 if(context.contains(data)){
	         return true;
	      }
		return false;
	}

}
