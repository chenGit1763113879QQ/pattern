/**
 *TerminalExpression.java
 * Administrator
 *2017年6月6日下午3:22:09
 *
 */
package com.designpattern.a016InterpreterPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午3:22:09
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
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午3:22:09
	 */
	@Override
	public boolean interpret(String context) {
		 if(context.contains(data)){
	         return true;
	      }
		return false;
	}

}
